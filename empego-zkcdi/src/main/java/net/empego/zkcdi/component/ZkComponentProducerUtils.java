/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:42
 *	File: ZkComponentProducerUtils.java
 *	Package: net.empego.zkcdi.component
 * 
 *  $Id: ZkComponentProducerUtils.java 30 2011-10-30 20:30:35Z oberinspector $ 
 * 
 *
 * 	Copyright (C) 2011 empego.net. All Rights Reserved.
 *
 *
 *	This program is distributed under LGPL Version 3.0.
 *  See the LICENSE at http://www.gnu.org/licenses/lgpl-3.0.html
 *  I hope it will be useful, but WITHOUT ANY WARRANTY.
 *
 ***************************************************************************/
package net.empego.zkcdi.component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

import org.zkoss.zk.ui.Component;

/**
 * The Class ZkComponentProducerUtils provides code generator to create producer classes.
 * 
 * <p>
 * Retrieves the components from a jar file
 * </p>
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public class ZkComponentProducerUtils {

	/**
	 * Test create producer.
	 * 
	 * @throws Exception
	 *           the exception
	 */
	// @Test
	public void testCreateProducer() throws Exception {
		createProducerClass("C:/Users/Thomas/.m2/repository/org/zkoss/zk/zul/5.0.8/zul-5.0.8.jar", null, "Zul", "net.empego.zkcdi.producer");
	}

	/**
	 * Create a Java File for component producer class for component classes retrieved from the jar file.
	 * 
	 * @param jarFile
	 *          Filename of the jar to retrieve component classes
	 * @param packageName
	 *          parent package of the components. if null all components in jar will be used.
	 * @param prefix
	 *          The prefix (e.g. Xxx) of the created java Filename XxxComponentProducer
	 * @param targetPackage
	 *          the target package
	 * @throws Exception
	 *           the exception
	 */
	public static void createProducerClass(final String jarFile, final String packageName, final String prefix, final String targetPackage)
			throws Exception {

		final List<Class<Component>> componentClasseNamesInPackage = getComponentClasseNamesInPackage(jarFile, packageName);

		final StringBuffer sb = new StringBuffer();
		sb.append("/*" + "\n * Generated with net.empego.zkcdi.ZkComponentProducerUtil " + "\n * from jarfile " + jarFile + "\n */"
				+ "\npackage " + targetPackage + ";\n\nimport javax.enterprise.inject.Produces;\nimport javax.enterprise.inject.Typed;"
				+ "\nimport javax.enterprise.inject.spi.InjectionPoint;\nimport net.empego.zkcdi.util.ZkCdiUtils;");

		for (final Class<Component> componentClazz : componentClasseNamesInPackage) {
			sb.append("\nimport ").append(componentClazz.getName()).append(";");
		}

		sb.append("\n\n/**\n * Producer methods to inject ZK-components from id-space.\n */");
		sb.append("\npublic class ").append(prefix).append("ComponentProducer {");

		for (final Class<Component> componentClazz : componentClasseNamesInPackage) {

			sb.append("\n\n\t@Produces\n\t@Typed(").append(componentClazz.getSimpleName()).append(".class)\n\tpublic ")
					.append(componentClazz.getSimpleName()).append(" produce").append(componentClazz.getSimpleName())
					.append("(final InjectionPoint injectionPoint) {\n\t\treturn (").append(componentClazz.getSimpleName())
					.append(") ZkCdiUtils.produceComponent(injectionPoint);\n\t}");
		}

		sb.append("\n\n}");

		final String string = sb.toString();

		final String packagePath = targetPackage.replaceAll("\\.", "/");

		final File file = new File("src/main/java/" + packagePath + "/" + prefix + "ComponentProducer.java");
		file.getParentFile().mkdirs();
		file.createNewFile();
		final FileOutputStream fos = new FileOutputStream(file);
		fos.write(string.getBytes());
		fos.flush();
		fos.close();
	}

	/**
	 * Gets the component classe names in package.
	 * 
	 * @param jarName
	 *          the jar name
	 * @param packageName
	 *          the package name
	 * @return the component classe names in package
	 */
	public static List<Class<Component>> getComponentClasseNamesInPackage(final String jarName, String packageName) {
		final ArrayList<Class<Component>> classNames = new ArrayList<Class<Component>>();

		if (packageName != null && packageName.isEmpty() == false) {
			packageName = packageName.replaceAll("\\.", "/");
		} else {
			packageName = null;
		}

		try {
			final JarInputStream jarFile = new JarInputStream(new FileInputStream(jarName));
			JarEntry jarEntry;
			while (true) {
				jarEntry = jarFile.getNextJarEntry();
				if (jarEntry == null) {
					break;
				}

				final String name = jarEntry.getName();
				if ((packageName != null && name.startsWith(packageName) || packageName == null) && name.endsWith(".class")
						&& name.contains("$") == false) {
					final String classname = jarEntry.getName().replaceAll("/", "\\.").replace(".class", "");
					final Class<?> clazz = Class.forName(classname);
					if (Component.class.isAssignableFrom(clazz) && clazz.isInterface() == false) {

						classNames.add((Class<Component>) clazz);
					}
				}
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return classNames;
	}

}

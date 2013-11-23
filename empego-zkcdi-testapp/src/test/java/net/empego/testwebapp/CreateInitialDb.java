///**
// * 
// */
//package net.empego.testwebapp;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.shrinkwrap.api.ArchivePaths;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
///**
// * @author Thomas
// * 
// */
//@RunWith(Arquillian.class)
//public class CreateInitialDb {
//
//	@Deployment
//	public static JavaArchive createDeployment() {
//		return ShrinkWrap.create(JavaArchive.class, "test.jar")
//				.addAsManifestResource("META-INF/persistence.xml", ArchivePaths.create("persistence.xml"))
//				.addAsManifestResource("META-INF/beans.xml", ArchivePaths.create("beans.xml"));
//	}
//
//	@PersistenceContext
//	private EntityManager entityManager;
//
//	@Test
//	public void testCreateinitialDB() {
//		int i = 1;
//		i++;
//
//	}
//
// }

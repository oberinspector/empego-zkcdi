package net.empego.zkcdi.util;

import net.empego.zkcdi.component.ZkComponentProducerUtils;

/**
 * Create code from zk componet jar for producer class to retrieve zk-components from id-space.
 * 
 * @author thomas.mueller@empego.net
 * 
 */
public class ZkComponentProducerUtilTest {

	// @Test
	public void testCreateProducer() throws Exception {
		ZkComponentProducerUtils.createProducerClass("C:/Users/Thomas/.m2/repository/org/zkoss/zk/zul/5.0.8/zul-5.0.8.jar", null, "Zul",
				"net.empego.zkcdi.component");

		ZkComponentProducerUtils.createProducerClass("C:/Users/Thomas/.m2/repository/org/zkoss/zk/zhtml/5.0.8/zhtml-5.0.8.jar", null, "Zhtml",
				"net.empego.zkcdi.component");

		// Add further jars with zk-components to create more producers
	}

}

package jollobajano.modules.struts.test.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jollobajano.modules.struts.HelloWorldAction;

public class HelloWorldTestCase {

	private HelloWorldAction action;
	
	@Before
	public void setUp() throws Exception {
		action = new HelloWorldAction();
	}

	@Test
	public void actionShouldReturnSuccess() throws Exception {
		String result = action.execute();
		Assert.assertEquals("success", result);
	}
	
}

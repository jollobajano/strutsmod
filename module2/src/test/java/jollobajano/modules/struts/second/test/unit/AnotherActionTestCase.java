package jollobajano.modules.struts.second.test.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jollobajano.modules.struts.second.AnotherAction;

public class AnotherActionTestCase {
	
	private AnotherAction action;
	
	@Before
	public void setUp() throws Exception {
		action = new AnotherAction();
	}

	@Test
	public void actionShouldReturnSuccess() throws Exception {
		String result = action.execute();
		Assert.assertEquals("success", result);
	}
	
}

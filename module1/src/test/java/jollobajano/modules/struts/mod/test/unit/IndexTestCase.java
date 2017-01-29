package jollobajano.modules.struts.mod.test.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jollobajano.modules.struts.mod.IndexAction;

public class IndexTestCase {

	private IndexAction action;
	
	@Before
	public void setUp() throws Exception {
		action = new IndexAction();
	}

	@Test
	public void actionShouldReturnSuccess() throws Exception {
		String result = action.execute();
		Assert.assertEquals("success", result);
	}
	
}

package jollobajano.modules.struts.mod;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	
	public String execute() throws Exception {
		System.out.println("Hello from module1");
		return SUCCESS;
	}

}

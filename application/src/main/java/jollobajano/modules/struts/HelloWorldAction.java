package jollobajano.modules.struts;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	
	public String execute() throws Exception {
		System.out.println("Hello from HelloWorld");
		return SUCCESS;		
	}

}

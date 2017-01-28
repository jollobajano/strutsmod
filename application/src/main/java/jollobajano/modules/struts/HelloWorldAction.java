package jollobajano.modules.struts;

public class HelloWorldAction {
	
	public String execute() throws Exception {
		System.out.println("Hello from HelloWorld");
		return "success";		
	}

}

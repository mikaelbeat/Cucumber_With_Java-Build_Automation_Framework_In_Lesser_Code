package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	/*
	 Hooks are used in scenarios with specific tag
	 Background in feature file is steps which are done before every test
	*/
	
	@Before("@WebTest")
	public void beforeValidation() {
		System.out.println("\n*** WEB BEFORE HOOK ***");
	}
	
	@After("@WebTest")
	public void afterValidation() {
		System.out.println("*** WEB AFTER HOOK ***\n");
	}

}

package org.setpdefinition;

import org.baseclass.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	
	
	@Before
	public void getbrow() {
		
		Browerlan();
		getUrl("https://www.facebook.com/");
		

	}
	
	@After
	
	public void closep() {
		driver.close();

	}

}

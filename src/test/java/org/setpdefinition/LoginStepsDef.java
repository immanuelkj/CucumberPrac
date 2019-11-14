package org.setpdefinition;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.pojo.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepsDef extends BaseClass{
	
	

	
	@Given("User in the home page{int}")
	public void user_in_the_home_page(Integer int1) {
	
	}

	@When("User has to enter the usermane and password{int}")
	public void user_has_to_enter_the_usermane_and_password(Integer int1, io.cucumber.datatable.DataTable d) {
		LoginPojo p = LoginPojo.getObject();
		Map<String, String> asMap = d.asMap(String.class, String.class);
		sendval(p.getUserr(), asMap.get("username"));
		sendval(p.getPas(), asMap.get("pass"));
	}

	@Then("User logging into homepage{int}")
	public void user_logging_into_homepage(Integer int1) {
	   
		Assert.assertTrue(false);
	}

}

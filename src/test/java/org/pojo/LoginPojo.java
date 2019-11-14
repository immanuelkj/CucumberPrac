package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	private static LoginPojo p;
	
	private LoginPojo(){
		
		PageFactory.initElements(driver, this);
	}
	
	public static LoginPojo getObject() {
		
		 p=new LoginPojo();
		
		return p;

	}
	
	@FindBy(id="email")
	
	private WebElement userr;
	
	@FindBy(id="pass")
	
	private WebElement pas;
	
	@FindBy(id="loginbutton")
	
	private WebElement btn;

	public WebElement getUserr() {
		return userr;
	}

	public WebElement getPas() {
		return pas;
	}

	public WebElement getBtn() {
		return btn;
	}
	
}

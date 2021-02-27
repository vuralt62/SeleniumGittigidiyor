package com.vuralt62.SeleniumProjectGittigidiyor.page;

import org.openqa.selenium.WebDriver;

import com.vuralt62.SeleniumProjectGittigidiyor.base.BasePage;
import static com.vuralt62.SeleniumProjectGittigidiyor.constants.Constants.*;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage hoverLogin () {
		hoverElement(HOVER_LOGIN);
		return this;
	}
	
	public LoginPage hoverLoginMenu () {
		findElement(HOVER_LOGIN_MENU);
		return this;
	}
	
	public LoginPage clickLoginOnMenu () {
		Click(CLICK_HOVER_LOGIN);
		return this;
	}
	
	public LoginPage setUserName () {
		SendKeys(USERNAME_FIELD,USERNAME);
		return this;
	}
	
	public LoginPage setPassWord () {
		SendKeys(PASSWORD_FIELD, PASSWORD);
		return this;
	}
	
	public LoginPage clickLogin () {
		Click(CLICK_LOGIN);
		return this;
	}
}

package org.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin extends BaseClass {

	public AdactinLogin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private static WebElement username;
	@FindBy(id = "password")
	private static WebElement password;
	@FindBy(id = "login")
	private static WebElement loginBtn;

	public static WebElement getUsername() {
		return username;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getLoginBtn() {
		return loginBtn;
	}

}

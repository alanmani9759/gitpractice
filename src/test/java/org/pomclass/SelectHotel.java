package org.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {

	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private static WebElement radioBtn;
	@FindBy(id = "continue")
	private static WebElement contBtn;

	public static WebElement getRadioBtn() {
		return radioBtn;
	}

	public static WebElement getContBtn() {
		return contBtn;
	}

}

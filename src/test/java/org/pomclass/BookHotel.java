package org.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {

	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private static WebElement firstName;
	@FindBy(id = "last_name")
	private static WebElement lastName;
	@FindBy(id = "address")
	private static WebElement address;
	@FindBy(id = "cc_num")
	private static WebElement ccNo;
	@FindBy(id = "cc_type")
	private static WebElement ccType;
	@FindBy(id = "cc_exp_month")
	private static WebElement expMonth;
	@FindBy(id = "cc_exp_year")
	private static WebElement expYear;
	@FindBy(id = "cc_cvv")
	private static WebElement cvvNo;
	@FindBy(id = "book_now")
	private static WebElement bookNowBtn;
	@FindBy(id = "username_show")
	private static WebElement userMsg;

	public static WebElement getFirstName() {
		return firstName;
	}

	public static WebElement getLastName() {
		return lastName;
	}

	public static WebElement getAddress() {
		return address;
	}

	public static WebElement getCcNo() {
		return ccNo;
	}

	public static WebElement getCcType() {
		return ccType;
	}

	public static WebElement getExpMonth() {
		return expMonth;
	}

	public static WebElement getExpYear() {
		return expYear;
	}

	public static WebElement getCvvNo() {
		return cvvNo;
	}

	public static WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	public static WebElement getUserMsg() {
		return userMsg;
	}

}

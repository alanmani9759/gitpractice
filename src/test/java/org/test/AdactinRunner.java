package org.test;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pageobjectmanager.PageObjectManager;
import org.pomclass.AdactinLogin;
import org.pomclass.BookHotel;
import org.pomclass.SearchHotel;
import org.pomclass.SelectHotel;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdactinRunner extends BaseClass {

	public static WebElement username2;
	public static WebElement password2;
	public static WebElement loginBtn;
	public static WebElement location1;
	public static WebElement hotels1;
	public static WebElement roomType1;
	public static WebElement checkInDate1;
	public static WebElement checkOutDate1;
	public static WebElement searchBtn;
	public static WebElement radioBtn;
	public static WebElement contBtn;
	public static WebElement firstName1;
	public static WebElement lastName1;
	public static WebElement address1;
	public static WebElement ccNo1;
	public static WebElement ccType1;
	public static WebElement expMonth1;
	public static WebElement expYear1;
	public static WebElement ccNumber;
	public static WebElement bookNowBtn;

	@BeforeSuite
	private void test1() {
		browserLauncher("https://adactinhotelapp.com/SelectHotel.php");
		System.out.println("test1");
	}

	@Test
	private void test2() {
		PageObjectManager pom = new PageObjectManager();
		pom.getAdactinLogin();
		username2 = AdactinLogin.getUsername();
		pom.getAdactinLogin();
		password2 = AdactinLogin.getPassword();
		pom.getAdactinLogin();
		loginBtn = AdactinLogin.getLoginBtn();
		pom.getSearchHotel();
		location1 = SearchHotel.getLocation();
		hotels1 = pom.getSearchHotel().getHotels();
		pom.getSearchHotel();
		roomType1 = SearchHotel.getRoomType();
		checkInDate1 = SearchHotel.getCheckInDate();
		checkOutDate1 = SearchHotel.getCheckOutDate();
		searchBtn = SearchHotel.getSearchBtn();
		radioBtn = SelectHotel.getRadioBtn();
		contBtn = SelectHotel.getContBtn();
		firstName1 = BookHotel.getFirstName();
		lastName1 = BookHotel.getLastName();
		address1 = BookHotel.getAddress();
		ccNo1 = BookHotel.getCcNo();
		ccType1 = BookHotel.getCcType();
		expMonth1 = BookHotel.getExpMonth();
		expYear1 = BookHotel.getExpYear();
		ccNumber = BookHotel.getCcNo();
		bookNowBtn = BookHotel.getBookNowBtn();
	}

	@Test(dataProvider = "dataPro")
	public void test3(String username, String password, String location, String hotels, String roomType,
			String checkinDate, String checkoutDate, String firstName, String lastName, String address, String ccNo,
			String ccType, String expMonth, String expYear, String cvvNo) throws IOException {
		sendKeys(username2, username);
		sendKeys(password2, password);
		clickElement(loginBtn);
		selectByVisibleText(location1, location);
		selectByVisibleText(hotels1, hotels);
		selectByVisibleText(roomType1, roomType);
		checkInDate1.clear();
		sendKeys(checkInDate1, checkinDate);
		checkOutDate1.clear();
		sendKeys(checkOutDate1, checkoutDate);
		clickElement(searchBtn);
		clickElement(radioBtn);
		clickElement(contBtn);
		sendKeys(firstName1, firstName);
		sendKeys(lastName1, lastName);
		sendKeys(address1, address);
		sendKeys(ccNo1, ccNo);
		selectByVisibleText(ccType1, ccType);
		selectByVisibleText(ccType1, ccType);
		selectByVisibleText(expMonth1, expMonth);
		selectByVisibleText(expYear1, expYear);
		sendKeys(ccNumber, cvvNo);
		clickElement(bookNowBtn);
	}

	@DataProvider(name = "dataPro")
	public Object[][] dataPro() throws IOException {

		Object[][] data = new Object[1][15];
		data[0][0] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 0);
		data[0][1] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 1);
		data[0][2] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 2);
		data[0][3] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 3);
		data[0][4] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 4);
		data[0][5] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 5);
		data[0][6] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 6);
		data[0][7] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 7);
		data[0][8] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 8);
		data[0][9] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 9);
		data[0][10] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 10);
		data[0][11] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 11);
		data[0][12] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 12);
		data[0][13] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 13);
		data[0][14] = excelRead(
				"C:\\Users\\alanl\\eclipse-workspace\\AdactinExcel\\src\\test\\resources\\ExcelFiles\\AdactinDetails.xlsx",
				"AdactinData", 1, 14);
		return data;

	}

}

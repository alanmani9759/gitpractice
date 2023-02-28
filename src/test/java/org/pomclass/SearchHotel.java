package org.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private static WebElement location;
	@FindBy(id = "hotels")
	private static WebElement hotels;
	@FindBy(id = "room_type")
	private static WebElement roomType;
	@FindBy(id = "room_nos")
	private static WebElement noOfRooms;
	@FindBy(id = "datepick_in")
	private static WebElement checkInDate;
	@FindBy(id = "datepick_out")
	private static WebElement checkOutDate;
	@FindBy(id = "adult_room")
	private static WebElement adultsPerRoom;
	@FindBy(id = "child_room")
	private static WebElement childrenPerRoom;
	@FindBy(id = "Submit")
	private static WebElement searchBtn;

	public static WebElement getLocation() {
		return location;
	}

	public static WebElement getHotels() {
		return hotels;
	}

	public static WebElement getRoomType() {
		return roomType;
	}

	public static WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public static WebElement getCheckInDate() {
		return checkInDate;
	}

	public static WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public static WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public static WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}

	public static WebElement getSearchBtn() {
		return searchBtn;
	}

}

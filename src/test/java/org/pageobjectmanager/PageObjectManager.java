package org.pageobjectmanager;

import org.baseclass.BaseClass;
import org.pomclass.AdactinLogin;
import org.pomclass.BookHotel;
import org.pomclass.SearchHotel;
import org.pomclass.SelectHotel;

public class PageObjectManager extends BaseClass {
	private static AdactinLogin adactinLogin;
	private static SearchHotel searchHotel;
	private static SelectHotel selectHotel;
	private static BookHotel bookHotel;

	public static AdactinLogin getAdactinLogin() {
		return (adactinLogin == null) ? adactinLogin = new AdactinLogin() : adactinLogin;
	}

	public static SearchHotel getSearchHotel() {
		return (searchHotel == null) ? searchHotel = new SearchHotel() : searchHotel;
	}

	public static SelectHotel getSelectHotel() {
		return (selectHotel == null) ? selectHotel = new SelectHotel() : selectHotel;
	}

	public static BookHotel getBookHotel() {
		return (bookHotel == null) ? bookHotel = new BookHotel() : bookHotel;
	}

}

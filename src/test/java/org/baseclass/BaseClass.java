package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	WebElement element;

	private void launcher() {
		System.out.println("launcher");
	}

	public static void browserLauncher(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void selectByVisibleText(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public static String excelRead(String pathName, String sheetName, int rowNo, int cellNo) throws IOException {
		String data = null;
		File file = new File(pathName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);

		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();

		if (cellType == 1) {
			data = cell.getStringCellValue();
		}
		if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
				data = format.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				data = String.valueOf(l);
			}
		}
		return data;
	}
}

package org.Utilities;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {

		public static WebDriver driver;

		public static void browserLaunch() {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		}

		public static void get(String url) {
			driver.get(url);
		}
		public static void maxwindow() {
			driver.manage().window().maximize();
		}

		public static void currentPageUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);

		}

		public static void pagetitle() {
			String title = driver.getTitle();
			System.out.println(title);
		}

		public static void fill(WebElement element,String value) {
			element.sendKeys(value);
		}

		public static void click(WebElement Weblement) {
			Weblement.click();
		}

		public static void closeBrowser() {
			driver.quit();
		}

		public static JavascriptExecutor js;

		public static void scrollpage(WebElement targetWebelement) {

			js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].scrollIntoView()", targetWebelement);

		}

		public static void javascriptClick(WebElement targetWebelement) {

			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", targetWebelement);

		}

		public static void javascriptgetattribute(WebElement targetWebelement) {

			js = (JavascriptExecutor) driver;
			js.executeScript("return arguments[0].getAttribute('value')", targetWebelement);
		}

		public static void javascriptsetattribute(WebElement targetWebelement, String value) {

			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','" + value + "')", targetWebelement);
		}

		public static void screenshoot(String imageName) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);

			File destination = new File(
					"C:\\Users\\Admin\\eclipse-workspace\\datadriven\\screenshot\\" + imageName + ".png");
			FileUtils.copyFile(source, destination);
		}

		public static Actions a;

		public static void movetoelement(WebElement target) {

			a = new Actions(driver);
			a.moveToElement(target).perform();

		}

		public static void dragAndDrop(WebElement source, WebElement target) {

			a = new Actions(driver);
			a.dragAndDrop(source, target).perform();
		}

		public static void contextClick() {
			a.contextClick().perform();
		}

		public static void doubleclick() {
			a.doubleClick();
		}

		public static void keyup() {
		}

		public static void excel(String fileName, String sheetName, int rowNum, int cellNum) throws IOException {
			File f = new File("C:\\Users\\Admin\\eclipse-workspace\\datadriven\\excel\\" + fileName + ".xlsx");

			FileInputStream fis = new FileInputStream(f);

			Workbook wb = new XSSFWorkbook(fis);

			Sheet sheetAt = wb.getSheet(sheetName);

			Row row = sheetAt.getRow(rowNum);
			Cell cell = row.getCell(cellNum);

			int cellType = cell.getCellType();
			String value;
			if (cellType == 1) {
				value = cell.getStringCellValue();
			} else if (DateUtil.isCellDateFormatted(cell)) {

				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat("E, MMM dd yyyy");
				value = s.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();

				long l = (long) numericCellValue;
				value = String.valueOf(l);
			}
			System.out.println(value);

		}

		public static void excelCreation(int rowNum, int cellNum, String passValue, String sheetName, String folderName)
				throws IOException {
			File f = new File("C:\\Users\\Admin\\eclipse-workspace\\datadriven\\excel\\" + folderName + ".xlsx");
			Workbook wb = new XSSFWorkbook();
			Sheet createSheet = wb.createSheet(sheetName);
			Row createRow = createSheet.createRow(rowNum);
			Cell createCell = createRow.createCell(cellNum);
			createCell.setCellValue(passValue);
			FileOutputStream fis = new FileOutputStream(f);
			wb.write(fis);
			System.out.println("writed...");
		}

		public static void cellCreation(int rowNum, int cellNum, String passValue, String sheetName, String folderName)
				throws IOException {
			File f = new File("C:\\Users\\Admin\\eclipse-workspace\\datadriven\\excel\\" + folderName + ".xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fi);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell createCell = row.createCell(cellNum);
			createCell.setCellValue(passValue);
			FileOutputStream fis = new FileOutputStream(f);
			wb.write(fis);
			System.out.println("writed...");
		}

		public static void rowCreation(int rowNum, int cellNum, String passValue, String sheetName, String folderName)
				throws IOException {
			File f = new File("C:\\Users\\Admin\\eclipse-workspace\\datadriven\\excel\\" + folderName + ".xlsx");

			FileInputStream fis = new FileInputStream(f);

			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row createRow = sheet.createRow(rowNum);
			Cell createCell = createRow.createCell(cellNum);
			createCell.setCellValue(passValue);

			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			System.out.println("writed...");
		}

		public static void screenShot(String name) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\datadriven\\screenshot\\" + name + ".png");
			FileUtils.copyFile(source, destination);
		}

}

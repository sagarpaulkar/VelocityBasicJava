package JavascriptExecutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSUtils {

	// 1. border around the webelement.
	
		public static void Borderbyjs(WebElement element,WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border='5px solid red'", element);
		}
		
		// 2. title of the webpage
		
		public static String titlebyjs(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			String title = js.executeScript("return document.title;").toString();
			return title;
		}
		
		public static void clickbyjs(WebElement element,WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", element);
		}
		
		public static void alertbyjs(WebDriver driver, String Message) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("alert('"+Message+" ')");
		}
		
		public static void refreshbyjs(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("history.go(0)");
			
		}
		
		public static void scrolldownbyjs(WebDriver driver,int x, int y) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("scroll("+x+","+y+")");
		}
		
		public static void scrollupbyjs(WebDriver driver,int x, int y) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("scroll("+x+","+y+")");
		}
		
		public static void scrollintoviewbyjs(WebElement element,WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		
		public static void ss(WebDriver driver) throws IOException {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Date d = new Date();
			System.out.println(d);
			String filename ="FBLogin_"+d.toString().replace(" ", "_").replace(":", "_")+".jpg";
			System.out.println(filename);
			File dest = new File("C:\\Users\\Sagar Paulkar\\Screenshots\\"+filename);
			FileUtils.copyFile(src, dest);
		}
		
		public static String excel(String sheetfilepath, String sheetname, int rowno, int cellno) throws IOException {
			//create object of fileinput
			FileInputStream file = new FileInputStream(sheetfilepath);
			//open excel sheet
			Sheet Sheet = WorkbookFactory.create(file).getSheet(sheetname);
			//get data by row and ceels
			String data = Sheet.getRow(rowno).getCell(cellno).getStringCellValue();
			System.out.println(data);
			return data;
		}
}

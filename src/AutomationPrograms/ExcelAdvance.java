package AutomationPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelAdvance {

public static WebDriver driver;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file;  // local
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		file = new FileInputStream("C:\\Users\\Sagar Paulkar\\Desktop\\excel1.xlsx");
		int rownum = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(rownum);
		System.out.println("total links present in excel sheet"+ (rownum+1));
		
		for (int i=0; i<=rownum;i++) {
			file = new FileInputStream("C:\\Users\\Sagar Paulkar\\Desktop\\excel1.xlsx");
			String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
			driver.get(value);
			System.out.println(driver.getCurrentUrl());
		}
		
	}

}

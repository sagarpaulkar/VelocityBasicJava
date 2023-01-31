package AutomationPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelBasics {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Sagar Paulkar\\Desktop\\excelwork.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		FileInputStream file2 = new FileInputStream("C:\\Users\\Sagar Paulkar\\Desktop\\excelwork.xlsx");
		String value1=WorkbookFactory.create(file2).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(value1);
		
		FileInputStream file3 = new FileInputStream("C:\\Users\\Sagar Paulkar\\Desktop\\excelwork.xlsx");
		String value2=WorkbookFactory.create(file3).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(value2);
		
		FileInputStream file4 = new FileInputStream("C:\\Users\\Sagar Paulkar\\Desktop\\excelwork.xlsx");
		String value3=WorkbookFactory.create(file4).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		System.out.println(value3);

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		signUp.click();
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys(value);
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys(value1);
		
		WebElement regemail = driver.findElement(By.name("reg_email__"));
		regemail.sendKeys(value2);
		
		WebElement regpasswd = driver.findElement(By.name("reg_passwd__"));
		regpasswd.sendKeys(value3);
		
		WebElement day= driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("31");
		
		WebElement month=driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByValue("12");
		
		WebElement year=driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByValue("1982");
		
		WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		
		WebElement sub=driver.findElement(By.name("websubmit"));
		sub.click();
}
}


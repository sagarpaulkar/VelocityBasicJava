package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_alt {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	driver.get("http://www.google.com");
//	WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
//	JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
//	myExecutor.executeScript("arguments[0].value='Kirtesh';", searchbox);
	
	driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.id("email"));
	JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
    myExecutor.executeScript("arguments[0].value='9922774123';", email);
}
}
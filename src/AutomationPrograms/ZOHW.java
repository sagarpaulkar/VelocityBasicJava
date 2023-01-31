package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZOHW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		

		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.zomato.com/");
		
	driver.manage().window().maximize();
	
	
	
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	
	WebElement id = driver.findElement(By.xpath("//iframe[@id='auth-login-ui']"));
	driver.switchTo().frame(id);
	
		WebElement mobile = driver.findElement(By.xpath("//input[@type='number']"));
		mobile.sendKeys("9922774123");
		
		
		
	}
	
}
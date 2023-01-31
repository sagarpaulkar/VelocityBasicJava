package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FKHW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		

		// implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		//Entering login on form
		
		WebElement mobile = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		mobile.sendKeys("9922774123");		
		
		WebElement pass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		pass.sendKeys("password");
		
		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		
		WebElement req = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3NgS1a']"));
		System.out.println(req.getText());
		
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		
	}

	
}
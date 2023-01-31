package AutomationPrograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPractice {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// 100 webelements ==> 10sec  ==> dynamic ==> script and browser
		
		
		// explicit wait
		// 1st way of writting
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='login']")));
		
		// 2nd way of writting
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(loginBtn));
		
		// Fluent Wait  ==> depricate
//		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).
//				withTimeout(30, TimeUnit.SECONDS).pollingEvery(6, TimeUnit.SECONDS).
//				ignoring(NoSuchElementException.class);
		
		Wait<WebDriver> wait2= new FluentWait<WebDriver>(driver).
				withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(6)).
				ignoring(NoSuchElementException.class);
		
		 WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//button[@name='websubmit']"));
		     }
		   });
		
	}
}

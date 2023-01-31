package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandelling {
public static void main(String[] args) {
		
		//1. browser properties
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.switchTo().frame("iframeResult");
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe1);
		WebElement clickmebtn = driver.findElement(By.xpath("//button[text()='Click Me!']"));
		clickmebtn.click();
		
		WebElement demo = driver.findElement(By.id("demo"));
		String javaText=demo.getText();
		
		String ExpjavaText="Hello JavaScript!";
		
		if(javaText.equalsIgnoreCase(ExpjavaText)) {
			System.out.println("Java Text Validated");
		}else {
			System.out.println("Java Text changed ");
		}
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		
		driver.close();
	}
}

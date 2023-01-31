package AutomationPrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopupExample {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String> winds;
		Iterator<String> iterate;
		
		// for first window
		winds = driver.getWindowHandles();
		iterate = winds.iterator();
		String firstwindow = iterate.next();      // 1st id
		System.out.println(firstwindow);
		driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();
		
		// for second window
		winds = driver.getWindowHandles();
		iterate = winds.iterator();
		iterate.next();      // 1st id
		String secondwindow =iterate.next();      // 2nd id
		System.out.println(secondwindow);
		driver.switchTo().window(secondwindow);
		driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
		
		
		// for third window
		winds = driver.getWindowHandles();
		iterate = winds.iterator();
		iterate.next();      // 1st id
		iterate.next();      // 2nd id
		String thirdwindow =iterate.next();      // 3rd id
		System.out.println(thirdwindow);
		driver.switchTo().window(thirdwindow);
		System.out.println(driver.getCurrentUrl());
				
		// first window
		driver.switchTo().window(firstwindow);
		
	}
}

package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsExample {

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		// hover to the webelement.
		
//		driver.get("https://www.next.co.uk/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']/button")).click();
//		List<WebElement> links = driver.findElements(By.xpath("//ul[@id='snail-trail-container']/li/a"));
//		
//		for(int i=0;i<10;i++) {
//			WebElement link = links.get(i);
//			Actions action = new Actions(driver);
//			action.moveToElement(link).build().perform();
//			System.out.println(link.getAttribute("title"));
//			Thread.sleep(2000);
//		}
		
		
		// How to handle the resizable Items
		
//		driver.get("https://jqueryui.com/resizable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement resizable = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
//		Actions action = new Actions(driver);
//		Thread.sleep(2000);
//		action.dragAndDropBy(resizable, 75, 75).build().perform();
		
		
		// drag and drop.
		
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
//		Actions action = new Actions(driver);
//		Thread.sleep(2000);
//		action.dragAndDrop(draggable, droppable).build().perform();
		
		
		// draggable Items
		
//		driver.get("https://jqueryui.com/draggable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		Actions action = new Actions(driver);
//		Thread.sleep(2000);
//		action.dragAndDropBy(draggable, 150, 150).build().perform();
		
		
		// Right Click() 
//		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement image = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
//		Actions action = new Actions(driver);
//		Thread.sleep(2000);
//		action.contextClick(image).build().perform();
		
		// sendkeys() :- 
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		Actions action = new Actions(driver);
		//action.sendKeys(username, "Paresh").build().perform();
		action.keyDown(username, Keys.SHIFT).sendKeys("Velocity").keyUp(Keys.SHIFT).build().perform();
		action.sendKeys(password, "Paresh@123").build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		//driver.close();
	}

}

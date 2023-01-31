package JavascriptExecutor;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorExample {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// 1. draw the border around the webelement
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.switchTo().frame("iframeResult");
//		WebElement clickmebtn = driver.findElement(By.xpath("//button[text()='Click Me!']"));
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].style.border='5px solid red'", clickmebtn);
//		JSUtils.Borderbyjs(clickmebtn, driver);
		
		// 2. capture the title of the webpage :- original  ==> gettitle();
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		System.out.println(JSUtils.titlebyjs(driver));
		
		// 3. click on any element :- original --> .click() :- org.openqa.selenium
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.switchTo().frame("iframeResult");
//		WebElement clickmebtn = driver.findElement(By.xpath("//button[text()='Click Me!']"));
//		Thread.sleep(2000);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].click();", clickmebtn);
//		JSUtils.clickbyjs(clickmebtn, driver);
		
		//4. to geneate an alert
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("alert('"+"Facebook login page is launched successfully"+" ')");
//		JSUtils.alertbyjs(driver, "Facebook login page launched again successfully");
//		Thread.sleep(2000);
//		Alert al = driver.switchTo().alert();
//		al.accept();
		
		// 5. refreshing the webpage :-  original --> .refresh() :- org.openqa.selenium
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		Thread.sleep(2000);
//		js.executeScript("history.go(0)");
//		JSUtils.refreshbyjs(driver);
		
		// Scrolling of the webpage.
		
		// 6. scroll down.
		
//		driver.get("https://money.rediff.com/gainers/nse");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("scroll(0,3000)");
//		JSUtils.scrolldownbyjs(driver, 0, 3000);
		
		// 7. scroll up
		
//		driver.get("https://money.rediff.com/gainers/nse");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("scroll(0,3000)");
//		JSUtils.scrolldownbyjs(driver, 0, 3000);
//		Thread.sleep(2000);
//		js.executeScript("scroll(0,-500)");
//		JSUtils.scrollupbyjs(driver, 0, 1500);
		
		// 8. scroll intoview
		
//	driver.get("https://money.rediff.com/gainers/nse");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement privacypolicy = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].scrollIntoView(true);", privacypolicy);
//		JSUtils.scrollintoviewbyjs(privacypolicy, driver);
//		privacypolicy.click();
		
		//9. SS
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		JSUtils.ss(driver);
		
		//10.excel
		
		JSUtils.excel("C:\\Users\\Sagar Paulkar\\Desktop\\excel1.xlsx", "sheet1", 0, 0);
	}
}

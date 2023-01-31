package AutomationPrograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAutomationPractice {
	
public static void main(String[] args) {
		
		// browser launch.
		
	// browser launch.
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			// get :- to launch the browser.
			driver.get("https://www.facebook.com/");
			
			// close :- to close the browser. :- focus current tab
			// driver.close();
			
			// quit :- to close the browser. :- all the tabs from the browser.
			//driver.quit();
			
			//  getcurrenturl :- you need to verify wheather the exact url is hit or not
			
//			System.out.println(driver.getCurrentUrl());
//			
//			String ActualUrl = driver.getCurrentUrl();
//			String ExpectedUrl = "https://www.facebook.com/";
//			
//			if(ActualUrl.equalsIgnoreCase(ExpectedUrl)) {
//				System.out.println("Link validation sucessful for facebook homepage");
//			}else {
//				System.out.println("Link validation failed for facebook homepage");
//			}
			
			// gettitile :- used to capture the title of the current webpage.
			
		
//			String ActualTitle = driver.getTitle();
//			System.out.println(ActualTitle);
//			String ExpectedTitle = "Facebook – log in or sign up";
//			
//			if(ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
//				System.out.println("Title validation sucessful for facebook homepage");
//			}else {
//				System.out.println("Title validation failed for facebook homepage");
//			}
			
			// Maximize() :- will open your browser with full window (we can not minimize.)
			driver.manage().window().maximize();
			
			// navigate() :- to hit the url. + additional operation (back + forward + refresh)
//			driver.navigate().to("https://www.google.co.in/");
//			driver.navigate().back();   // facebook
//			driver.navigate().forward(); // google
//			driver.navigate().refresh();
			
			// setsize() :- allow you to set the size of your browser
			
			 Dimension d = new Dimension(100, 400);
			 driver.manage().window().setSize(d);
			 
			 // setpostion :- you can set the position of your browser on your screen.
			 
			Point p = new Point(300, 500);
			driver.manage().window().setPosition(p);
			
			
		}
	}


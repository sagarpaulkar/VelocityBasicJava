package AutomationPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsPractice {
public static void main(String[] args) throws InterruptedException {
		
		// webelement interface ==> we can perform the respective actions on the webelements.
		
		// browser launch.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//1. Sendkeys() :- method present in webelement interface ==> used to pass the data to the webelement
		
		// username.
		//WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		//username.sendKeys("velocity3rdSeptEveningBatch");
		
		// password 
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password@34567");
		
		//2. Click() :- used to click on buttons/ radio button
		//WebElement LogingBtn = driver.findElement(By.xpath("//button[@name='login']"));
		//LogingBtn.click();
		
		//3. isEnabled :- will help you to understand the current state of the webelement  ==> active /passive ==> boolean values.
		
		//System.out.println(LogingBtn.isEnabled());
//		if(LogingBtn.isEnabled()== true) {
//			LogingBtn.click();
//		}else {
//			System.out.println("The login button is disabled");
//		}
		
//		driver.navigate().to("https://www.facebook.com/reg/");
//		Thread.sleep(1500);
		
		//4. isDisplayed :- will help you to check the presence of webelement on the webpage
		
//		WebElement fblogo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
//		System.out.println(fblogo.isDisplayed());
//		if(fblogo.isDisplayed()== true) {
//			System.out.println("Facebook logo is displayed on registration page");
//		}else {
//			System.out.println("Facebook logo is not displayed on registration page");
//		}
		
		
		// 5. isselected :- will help you to check the selection state of the webelement
//		driver.navigate().to("https://www.facebook.com/reg/");
//		Thread.sleep(1500);
//		
//		WebElement femaleopt = driver.findElement(By.xpath("//input[@value='1']"));
//		//femaleopt.click();
//		
//		if(femaleopt.isSelected()==false) {
//			femaleopt.click();
//		}else {
//			System.out.println("female option is by default selected");
//		}
		
		
		// getText() :- extract your text function from the perticular webelement
//		WebElement tagline = driver.findElement(By.xpath("//h2[@class='_8eso']"));
//		String Actualtextvalue = tagline.getText();
//		System.out.println(Actualtextvalue);
//		String Expectedtextvalue = "Facebook helps you connect and share with the people in your life.";
		
//		if(Actualtextvalue.equalsIgnoreCase(Expectedtextvalue)) {
//			System.out.println("Test case is passed");
//		}else {
//			System.out.println("Test case is failed");
//		}
		
//		if(Actualtextvalue.contains("with the people in your life")) {
//			System.out.println("Tagline is updated");
//		}else {
//			System.out.println("Tagline is not updated");
//		}
		
		// getattribute() :- this method will allow you to capture the attribute value of the weblement
		
		// username.
//		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
//		String actattributevalue = username.getAttribute("data-testid");
//		String expectedattributevalue="royal_email";
//		
//		if(actattributevalue.equals(expectedattributevalue)) {
//				System.out.println("id attribute  is updated in current sprint");
//		}else {
//			System.out.println("old attribute  is reflecting on the website");
//		}
		
		// Multiple Webelements
		
		List<WebElement> footerlinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a"));
		System.out.println(footerlinks.size());
		
		for(int i=0;i<footerlinks.size();i++) {
			WebElement indivisualfooterlink = footerlinks.get(i);
			String linkname = indivisualfooterlink.getText();
//			System.out.println(i+"==>"+linkname);
		   String link	= indivisualfooterlink.getAttribute("href");
		   System.out.println(i+"==>"+linkname+"==>"+link);
		}
		
	}
		
		
}

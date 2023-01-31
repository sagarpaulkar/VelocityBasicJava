package AutomationPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSIGNUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Evoking the chrome browser 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		// get :- to launch the browser.
		driver.get("https://www.facebook.com/");
		
		// Open sign up page 		
		WebElement SignUP = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		SignUP.click();
		
		// Validate Facebook Logo		
		WebElement FBLOGO=driver.findElement(By.className("fb_logo"));
		if (FBLOGO.isDisplayed()==true) {
			System.out.println("FB logo validated ");
		}
		else {
			System.out.println("FB logo not present");
			}
		
		// Facebook new account validation line 		
		String lineLogo = driver.findElement(By.className("mbs")).getText();		
		if (lineLogo.equalsIgnoreCase("Create a new account"))
		{
			System.out.println("Logo line Validated");
		}else
		{
			System.out.println("Logo line incorrect");
		}
		
		//Enter  the data on Facebook sign up page 
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Sagar");
		
		WebElement sur = driver.findElement(By.name("lastname"));
		sur.sendKeys("Paulkar");
		
		WebElement emailnumber= driver.findElement(By.name("reg_email__"));
		emailnumber.sendKeys("9922774123");
		
		WebElement password= driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("12345678");
		
		WebElement day= driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("31");
		
		WebElement month=driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByValue("12");
		
		WebElement year=driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByValue("1982");
		
		
		
//		List<WebElement> days=s.getOptions();		
//		System.out.println("Total days"+days.size());
//		
//		for(int i=0;i<=days.size()-1;i++) {
//		System.out.println(days.get(i).getText());
		
		WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		
		WebElement sub=driver.findElement(By.name("websubmit"));
		sub.click();
		
		// get all below links 
		
		List<WebElement> lang = driver.findElements(By.xpath("//ul[@class='uiList localeSelectorList _2pid _509- _4ki _6-h _6-j _6-i']/li/a"));
		System.out.println(lang.size());
		
		for(int i=0;i<lang.size();i++) {
			WebElement lang2 = lang.get(i);
			String languages = lang2.getText();
			//System.out.println(i+"==>"+languages);
			String link	=lang2.getAttribute("title");
			System.out.println(i+"==>"+languages+"==>"+link);
	}

}
}
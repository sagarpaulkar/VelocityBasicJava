package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandelling {
	// 1. launch browser ==> hit the url ==> browser properties set==> navigate to registration page ==> 
		// locate the elements ==> action perform
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			WebElement signuplink = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
			signuplink.click();
			
			// you have the  identify the  list box which you have to handle
			
			WebElement selectday = driver.findElement(By.xpath("//select[@title='Day']"));
			
			// you have to create the object of select class and perform further action.
			
			 //Select s = new Select(selectday);
			 
			  // 1. select the value by index. [index always start from 0]  ==> select the birthday 19
			 //s.selectByIndex(18);   ==> int
			 
			 //2 .select the option by value
			// s.selectByValue("19");     ==> string
			 
			 //3. select the option by visible text
			 //s.selectByVisibleText("19");    ==> string data
			 
			 // all the elements present in perticular listbox
			WebElement selectyear = driver.findElement(By.xpath("//select[@title='Year']"));
			
			Select s = new Select(selectyear);
			s.selectByValue("1995");
//			List<WebElement> years = s.getOptions();
//			System.out.println("Total  years present in listbox:- "+ years.size());
//			
//			for(int i=0; i<years.size();i++) {
//				String year = years.get(i).getText();
//				System.out.println(year);
//			}
			
			// to check the default selected option.
//			String firstopt = s.getFirstSelectedOption().getText();
//			System.out.println(firstopt);
			
		}
}

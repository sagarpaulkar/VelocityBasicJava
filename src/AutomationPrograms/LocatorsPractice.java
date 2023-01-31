package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Regular locators
		
		// 1. ID:- 
	    // driver.findelement(By.id("copy the unique id from the website"));
		driver.findElement(By.id("email"));
		
		// 2. name
	   // driver.findelement(By.name("copy the unique name attribute value from the website"));
		driver.findElement(By.name("email"));
		
		// 3. classname
		// driver.findelement(By.classname("pass the unique classname from the website"));
		driver.findElement(By.className("inputtext _55r1 _6luy"));
		
		// 4. tagname
		// driver.findelement(By.tagname("unique tagname from the website"));
		driver.findElement(By.tagName("button"));
		
		// 5. LinkText
		// driver.findelement(By.linktext("Link text copied from the website"));
		driver.findElement(By.linkText("Forgotten password?"));
		
		// 6. Partial LinkText
		// driver.findelement(By.partiallinktext(" portion of the Link text copied from the website"));
		driver.findElement(By.partialLinkText("password?"));
		
		//  Regular Xpath :- 1. absolute xpath      2. relative xpath
		
		// 1. absolute xpath:-
		// driver.findelement(by.xpath("copy the absolute xpath from the website"));
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/div[3]/div/div[47]/div/div/section/div/div[1]/div[1]/div/div[1]/a/img"));
		
		
		// 2. Relative xpath:-
	    // driver.findelement(by.xpath("copy the relative xpath from the website"));
		driver.findElement(By.xpath("//button"));
		
		// Customized Xpath  :- we need to design
		
		// 1. Basic Xpath :- 
		
	   // tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@id='email']"));
		
		// 2. xpath by text function
		//tagname[text()='value']
		driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	
	    // 3 .xpath by contains()
		//tagname[contains(@attribute,'value')]
		driver.findElement(By.xpath("//label[contains(@for,'u_0_4')]"));
		driver.findElement(By.xpath("//a[contains(@data-label,' Loose Fit Super Soft Jogger ')]"));
	 
		// 4. xpath by starts-with
	    //tagname[starts-with(@attribute,'value')]
	    driver.findElement(By.xpath("//label[starts-with(@for,'u_0_4')]"));
		
	    // 5. Logical operators [and ==> both conditions are true or ==> if any one of two is true]
	    
	    // tagname[@attribute1='value' and @attribute='value']
	    driver.findElement(By.xpath("//input[@id='email' and @aria-label='Email address or phone number']"));
	    
	   // tagname[@attribute1='value' or @attribute='value']
	    driver.findElement(By.xpath("//input[@value='1' or @id='u_0_4_oL']"));
	}
}

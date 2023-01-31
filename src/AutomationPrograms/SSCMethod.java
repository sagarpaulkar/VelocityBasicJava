package AutomationPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSCMethod {

	public static WebDriver driver;
	
	public static void ssTaking() throws IOException 
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String filename = "FBLS_"+d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File dest= new File("C:\\Users\\Sagar Paulkar\\Screenshots\\"+filename);
		FileUtils.copyFile(src,dest);
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	//BrowserEvoking
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		ssTaking();		
		Thread.sleep(5000);
		
		//SignUp SS
		driver.navigate().to("https://www.facebook.com/reg/");
		ssTaking();
		
	}

}

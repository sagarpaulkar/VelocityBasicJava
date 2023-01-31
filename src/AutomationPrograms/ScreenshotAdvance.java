package AutomationPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotAdvance {

public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		System.out.println(d);
		String filename ="FBLogin_"+d.toString().replace(" ", "").replace(":", "")+".jpg";
		System.out.println(filename);
		File dest = new File("C:\\Users\\Sagar Paulkar\\Screenshots\\"+filename);
		FileUtils.copyFile(src, dest);
	}
}

package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MCHW {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com//markets/indian-indices/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int rows = driver.findElements(By.xpath("//div[@id='indicesTableData']//div/div/table/tbody/tr")).size();
		System.out.println("rows"+rows);
		
		int cols = driver.findElements(By.xpath("//div[@id='indicesTableData']//div/div/table/tbody/tr[1]/td")).size();
		System.out.println("cols"+cols);
		
		for(int r=1;r<=rows;r++) {
			for (int c=1;c<=cols-1;c++) {
				String value = driver.findElement(By.xpath("//div[@id='indicesTableData']//div/div/table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print("==>"+ value);
			}
			System.out.println();
		}
	}
}

package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoE
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		try
		{
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("done:");
		}
		catch (Exception e) {
			System.out.println("Not done:");
		}
		driver.quit();
	}	
}


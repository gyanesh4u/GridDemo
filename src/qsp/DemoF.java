package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoF 
{
	WebDriver driver;
	public WebDriver wait;
	
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	 	driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test
	public void Login()
	{
		////driver.get("https://demo.actitime.com/login.do");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wait=(WebDriver) new WebDriverWait(driver, 5);
		driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	//Thread.sleep(10000);
	String title = driver.getTitle();
	System.out.println(title);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
	
		driver.quit();


}

}

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoC 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();

	while(true)
	{
		try
		{
			String text=driver.findElement(By.id("logoutLink")).getText();
			System.out.println(text);
			break;
		}
		catch (Exception e) 
		{
		}
	}
	
	driver.quit();
}	
	
}

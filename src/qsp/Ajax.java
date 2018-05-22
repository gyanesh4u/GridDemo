package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ajax 
{
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.plus2net.com/jquery/msg-demo/dropdown3.php");
	WebElement country=driver.findElement(By.id("country_code"));
	WebElement state=driver.findElement(By.id("state_id"));
	WebElement city=driver.findElement(By.id("city_id"));
	
	Select selCountry=new Select(country);
	Select selState=new Select(state);
	Select selCity=new Select(city);
	
	selCountry.selectByVisibleText("INDIA");
	Thread.sleep(2000);
	selState.selectByVisibleText("7:Karnataka");
	Thread.sleep(2000);
	selCity.selectByVisibleText("Bangalore");
}
}

package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoG 
{
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/gyanesh/Desktop/SVG.html");
	Actions act=new Actions(driver);
	int line=0;
	List<WebElement> allElements = driver.findElements(By.xpath("//*"));
	for(WebElement element:allElements)
	{
		String tag=element.getTagName();
		if(tag.equals("line"))
		{
			line++;
			System.out.println("before");
			System.out.println(element.getCssValue("stroke"));
			System.out.println();
			Thread.sleep(2000);
		
			System.out.println("after");
			act.moveToElement(element).perform();
			String xp="./following-sibling::*[1]/*[2]";
			WebElement toolTip=driver.findElement(By.xpath(xp));
			System.out.println("Tool Top message :"+toolTip.getText());
			System.out.println(element.getCssValue("stroke"));
		}
	}
	System.out.println("Number of lines:"  + line);
	driver.close();
}
}

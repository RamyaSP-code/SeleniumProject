package Amazon;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonScroll {
WebDriver driver;
Actions act;
JavascriptExecutor Js;
@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");

	driver=new ChromeDriver();
act=new Actions(driver);
Js=(JavascriptExecutor)driver;
driver.manage().window().maximize();
driver.get("https://www.amazon.in");
}
@AfterMethod
	public void teardown()
	{
		driver.close();
	}
@Test
public void scrollByPages()
{
	for(int i=0;i<5;i++)
	{
		//Js.executeScript(Window.scrollByPages(0,5000));
	}
	//Thread.sleep(3000);
	/*for(int i=0;i<5;i++)
	
		Js.executeScript(window.scrollByPages(0,-5000));
	}*/
	WebElement input=driver.findElement(By.xpath("//a[contains(text(),'Careers']"));
	input.click();
	String Title=driver.getTitle();
	System.out.println(Title);
}
}

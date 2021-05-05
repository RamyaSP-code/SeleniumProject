package test.qa.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleFrames {
	WebDriver driver;
@BeforeMethod
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
	}
@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
@Test(priority=1)
public void FrameByIndex()
{
	int size=driver.findElements( By.tagName("frame")).size();
	for(int i=0;i<size;i++)
	{
			WebDriver frame=driver.switchTo().frame(i);
			String title=frame.getTitle();
			int size2=driver.findElements( By.tagName("a")).size();
			System.out.println("Total no.of hyperlinks present in the frame"+i+"with titel -"+title+"are: "+size);
			driver.switchTo().defaultContent();
	}
}
@Test(priority=2)
public void FrameByNmae()
{
	WebElement frame=driver.findElement(By.name("packageListFrame"));
	String attribute=frame.getAttribute("name");
	Reporter.log(driver.switchTo().frame(attribute).getTitle(),true);
}
@Test(priority=3)
public void FrameByElement()
{
	WebElement frame=driver.findElement(By.xpath("//frame[@title='All packages')]"));
	int size=driver.findElements( By.tagName("a")).size();
	String title=((WebDriver) frame).getTitle();
	System.out.println("Total no.of hyperlinks present in the frame"+title+"are: "+size);

}
}

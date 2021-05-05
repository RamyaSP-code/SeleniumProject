package test.qa.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingwithFileUpload {
	WebDriver driver;
	@Test
	public void setup() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://my.naukri.com/account/createaccount?othersrcp=23531");
		driver.findElement(By.xpath("//button[contains(text(),'I am a Professional')]")).click();
		driver.findElement(By.name("uploadCV")).sendKeys("\"C:\\Users\\USER\\Desktop\\Ramya\"");
	driver.close();
	}
}

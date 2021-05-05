package test.qa.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingwithHiddenPopup {
	WebDriver driver;
	@Test
	public void setup() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[4]/a[1]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}

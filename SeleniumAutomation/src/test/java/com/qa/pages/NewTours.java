package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	NewToursPage ntp=new NewToursPage(driver);
	driver.get("http://demo.guru99.com/test/newtours/index.php");
	ntp.getUserName().sendKeys("mercury");
	ntp.getPassword().sendKeys("mercury");
	ntp.getSubmit().click();
	Thread.sleep(1000);
	ntp.getFlightbooking().click();
	Thread.sleep(1000);
 Select pc=new Select(ntp.getPassCount());
 pc.selectByIndex(3);
	Thread.sleep(1000);
	 Select dl=new Select(ntp.getDepLocation());
		dl.selectByIndex(3);
		Thread.sleep(1000);
		 Select fm=new Select(ntp.getFromMonth());
fm.selectByValue("5");
Select fd=new Select(ntp.getFromDay());
fd.selectByValue("21");
Thread.sleep(1000);
Select al=new Select(ntp.getToPort());
al.selectByIndex(2);
Thread.sleep(1000);
Select tm=new Select(ntp.getToMonth());
tm.selectByValue("5");
Select td=new Select(ntp.getToDay());
td.selectByValue("26");
Thread.sleep(1000);
ntp.getContinue().click();
driver.close();
}
}

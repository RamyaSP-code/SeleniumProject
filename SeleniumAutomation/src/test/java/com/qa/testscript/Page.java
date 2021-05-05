package com.qa.testscript;
// page object model for seperating the test description from testcode  for reusability..
//Test code
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.gp;

public class Page {
	public static void main(String[] args) {
	
	//open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		gp g=new gp(driver);
		
		//launch the google url
	    driver.get("https://www.google.com/");
	    g.getinputField().sendKeys("Automation Testing");
	    g.getSearchButton().click();
}
}
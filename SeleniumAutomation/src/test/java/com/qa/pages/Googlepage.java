package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
			gp g=new gp(driver);
			
			//launch the google url
		    driver.get("https://www.google.com./");
		    String Title1="Automation Testing";
		    g.getinputField().sendKeys(Title1);
		    g.getSearchButton().submit();
		    String Title2=driver.getTitle();
		    System.out.println(Title2);
		    if(Title1.equals(Title2))
		    	System.out.println("same");
		    else
		    	
		    	System.out.println("different");
}
}


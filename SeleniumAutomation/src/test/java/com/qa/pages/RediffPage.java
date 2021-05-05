package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffPage {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				Rediff rf=new Rediff(driver);
		         driver.get("https://www.rediff.com/");
		         String homepageTitle1=driver.getCurrentUrl();
		         System.out.println(homepageTitle1);
		         rf.getSignIn().click();
		         String loginpageTitle1=driver.getCurrentUrl();
		         System.out.println(loginpageTitle1);
		         driver.navigate().back();
		         String homepageTitle2=driver.getCurrentUrl();
		         if(homepageTitle1.equals(homepageTitle2))
		         {
		         	System.out.println("home page name is same");
		         }
		         else
		         {
		         	System.out.println("home page name is not same!");
		         }
		         driver.navigate().forward();
		         String loginpageTitle2=driver.getCurrentUrl();
		         if(loginpageTitle1.equals(loginpageTitle2))
		         {
		         	System.out.println("login page name is same");
		         }
		         else
		         {
		         	System.out.println("login page name is not same!");
		         }
		         driver.quit();


}
}
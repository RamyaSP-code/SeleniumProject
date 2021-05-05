package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Casestudy1 {
public static void main(String[] args) {
	//open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
			WebDriver driver1=new ChromeDriver();
	         //launch the rediff url
	         driver1.get("https://www.rediff.com/");
//Get and print the title of home page
	         String homepageTitle1=driver1.getCurrentUrl();
	         System.out.println(homepageTitle1);
	         //click on sign in
	         driver1.findElement(By.className("signin")).click();
	         //get and print the title of login page
	         String loginpageTitle1=driver1.getCurrentUrl();
	         System.out.println(loginpageTitle1);
	         //go back previous page using navigate method
	         driver1.navigate().back();
	         //get the title and check it is same as home page
	         String homepageTitle2=driver1.getCurrentUrl();
if(homepageTitle1.equals(homepageTitle2))
{
	System.out.println("home page name is same");
}
else
{
	System.out.println("home page name is not same!");
}
//use forward method and get the page title  and check it is same as login page
driver1.navigate().forward();

String loginpageTitle2=driver1.getCurrentUrl();
if(loginpageTitle1.equals(loginpageTitle2))
{
	System.out.println("login page name is same");
}
else
{
	System.out.println("login page name is not same!");
}
driver1.quit();
}
}

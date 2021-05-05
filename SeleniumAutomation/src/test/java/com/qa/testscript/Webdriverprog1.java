package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverprog1 {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
	
	//WebDriver driver=new ChromeDriver();
	//driver.get("https://www.flipkart.com/");
//open the browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
         //launch the rediff url
         driver.get("https://www.rediff.com/");
         //click on create account
         WebElement CreateAccountLink=driver.findElement(By.linkText("Create Account"));
         CreateAccountLink.click();

         //check if the user is landed on the page
         String currentUrl=driver.getCurrentUrl();
         if(currentUrl.contains(("register")))
     {
    System.out.println("The user is landed on the registration page");    	 
         driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Ramya");
         driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("Ramya@test.com");
         driver.findElement(By.className("btn_checkavail")).click();
     }
         else
         {
        	    System.out.println("The user is not landed on the registration page");    	 

         }
         driver.close();
	
}
}

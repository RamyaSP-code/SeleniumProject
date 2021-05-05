package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Casestudy2 {
public static void main(String[] args) {
	//open the browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
	WebDriver driver2=new ChromeDriver();
	//launch the google url
    driver2.get("https://www.google.com/");
    WebElement e=driver2.findElement(By.name("q"));
   String Title2="Automation Testing";
    e.sendKeys("Automation Testing");
    e.submit();
    String Title1=driver2.getTitle();
    System.out.println(Title1);
    if(Title1.equals(Title2))
    	System.out.println("searched title name is same");
    
    else
    	
    	System.out.println("searched title name is not same");
   		driver2.close();
}
}
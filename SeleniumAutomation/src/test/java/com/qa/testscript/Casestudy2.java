package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Casestudy2 {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
	WebDriver driver2=new ChromeDriver();
	//launch the google url
    driver2.get("https://www.google.com/");
    //pass the title as automation testing for search
    String Title="Automation Testing";
    driver2.findElement(By.name("q")).sendKeys(Keys.ENTER);
    String Title1=driver2.getTitle();
    System.out.println(Title1);
    String Title2=Title+"- GOOGLE Search";
    if(Title2.equals( Title1))
    {
        System.out.println("same");
    }
    else
    {
        System.out.println("not same");
    }
    Thread.sleep(1000);
driver2.close();
}
}

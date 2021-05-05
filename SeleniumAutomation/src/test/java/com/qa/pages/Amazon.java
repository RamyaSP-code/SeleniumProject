package com.qa.pages;
//CaseStudy 4

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Ramya\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	String Title=driver.getTitle();
	
	int upper=0,lower=0,digits=0,spaces=0,SpcChar=0;
	for(int i=0;i<Title.length();i++)
	{
		char ch=Title.charAt(i);
		if(ch>='A' && ch<='Z')
		{
			upper++;
		}
		else if(ch>='a' && ch<='z') {
			lower++;
		}
		else if(ch>='1' && ch<='9')
			spaces++;
		else
		{
			SpcChar++;
		}
	}
	System.out.println("uppercase count in the title- " +upper);
	System.out.println("lowercase count in the title- " +lower);
	System.out.println("digits count in the title- " +digits);
	System.out.println("spaces count in the title- " +spaces);
	System.out.println("special characters count in the title- " +SpcChar);

}
}
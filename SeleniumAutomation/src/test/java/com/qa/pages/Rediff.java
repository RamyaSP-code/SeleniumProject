package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rediff {
WebDriver driver;
@FindBy(className="signin")
WebElement SignIn;
public WebElement getSignIn() {
	return SignIn;
}
public Rediff( WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

}

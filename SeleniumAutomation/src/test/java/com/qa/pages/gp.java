package com.qa.pages;
// Test Descripion 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gp {
 WebDriver driver;
@FindBy(name="q")
WebElement inputField;
public WebElement getinputField()
{
	return inputField;
}
@FindBy(name="btnK")
WebElement SearchButton;
public WebElement getSearchButton()
{
	return SearchButton;
}
public gp( WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
}
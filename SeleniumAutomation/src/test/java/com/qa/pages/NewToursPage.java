package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewToursPage {
	 WebDriver driver;
@FindBy(name="userName")
WebElement UserName;
public WebElement getUserName() {
	return UserName;
}
@FindBy(name="password")
WebElement Password;
public WebElement getPassword() {
	return Password;
}
@FindBy(name="submit")
WebElement Submit;
public WebElement getSubmit() {
	return Submit;
}
@FindBy(linkText="Flights")
WebElement Flightbooking;
public WebElement getFlightbooking() {
	return Flightbooking;
}
@FindBy(name="passCount")
WebElement PassCount;
public WebElement getPassCount() {
	return PassCount;
}
@FindBy(name="fromPort")
WebElement DepLocation;
public WebElement getDepLocation() {
	return DepLocation;
}
@FindBy(name="fromMonth")
WebElement  FromMonth;
public WebElement getFromMonth() {
	return FromMonth;
}

@FindBy(name="fromDay")
WebElement  FromDay;

public WebElement getFromDay() {
	return FromDay;
}
@FindBy(name="toPort")
WebElement  ToPort;

public WebElement getToPort() {
	return ToPort;
}
@FindBy(name="toMonth")
WebElement  ToMonth;
public WebElement getToMonth() {
	return ToMonth;
}
@FindBy(name="toDay")
WebElement  ToDay;
public WebElement getToDay() {
	return ToDay;
}
@FindBy(name="findFlights")
WebElement  Continue;
public WebElement getContinue() {
	return Continue;
}
public NewToursPage( WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

}

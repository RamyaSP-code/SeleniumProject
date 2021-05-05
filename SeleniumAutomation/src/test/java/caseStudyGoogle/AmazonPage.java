package caseStudyGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage{
WebDriver driver;
@FindBy(id="searchDropdownBox")
WebElement category;
public WebElement getCategory() {
	return category;
}
@FindBy(id="twotabsearchtextbox")
WebElement searchItem;
public WebElement getSearchItem() {
	return searchItem;
}
@FindBy(id="nav-search-submit-button")
WebElement searchButton;
public WebElement getSearchButton() {
	return searchButton;
}
@FindBy()
WebElement bookTitle;
public WebElement getBookTitle() {
	return bookTitle;
}


public AmazonPage(WebDriver driver)
{
	this.driver= driver;
	PageFactory.initElements(driver,this);
}

}


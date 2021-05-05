package Amazon;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageamazon  {
	WebDriver driver;

@FindBy(id="nav-link-accountList-nav-line-1")
WebElement signin;
public WebElement getSignin() {
	return signin;
}
@FindBy(id="ap_email")
WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(id="continue")
WebElement Continue;
public WebElement getContinue() {
	return Continue;
}
@FindBy(id="ap_password")
WebElement passWord;
public WebElement getPassWord() {
	return passWord;
}
@FindBy(id="signInSubmit")
WebElement accountSignin;

public WebElement getAccountSignin() {
	return accountSignin;
}
@FindBy(id="nav-search-submit-button")
WebElement Submit;
public WebElement getSubmit() {
	return Submit;
}
@FindBy(id = "twotabsearchtextbox")
WebElement SearchButton;
	public WebElement getSearchButton() {
	return SearchButton;
}
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/h2/a/span")
	WebElement Select;
	public WebElement getSelect()
	{
		return Select;
	}
	@FindBy(id = "add-to-cart-button")
	WebElement AddToCart;
	public WebElement getAddToCart() {
		return AddToCart;
	}
	@FindBy(id = "hlb-view-cart-announce")
	WebElement cart;
	public WebElement getCart() {
		return cart;
	}
	@FindBy(xpath="//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	WebElement proceedToBuy;
	public WebElement getProceedToBuy()
	{
		return proceedToBuy;
	}
	@FindBy(xpath = "//*[@id=\"address-book-entry-0\"]/div[2]/span/a")
	WebElement deliveryAdd;
	public WebElement getDeliveryAdd() {
		return deliveryAdd;
	}
	@FindBy(xpath="//*[@id=\"nav-logo-sprites\"]")
	WebElement homePage;
	public WebElement getHomePage1() {
		return homePage;
	}
	@FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
	WebElement sideTab;
	public WebElement getSideTab() {
		return sideTab;
	}
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[29]/a")
	WebElement signOut;
	public WebElement getSignOut() {
		return signOut;
	}
	@FindAll(@FindBy(tagName="ul"))
	List<WebElement> inputs;
	public List<WebElement> getInputs() {
		return inputs;
	}
public Pageamazon(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}

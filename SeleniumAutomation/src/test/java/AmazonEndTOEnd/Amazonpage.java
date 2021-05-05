package AmazonEndTOEnd;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonpage {
		WebDriver driver;
		public Amazonpage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="nav-link-accountList-nav-line-1")
		WebElement signin;
		public WebElement getSignin() {
			return signin;
		}
		@FindBy(id = "ap_email")
		WebElement email;
		public WebElement getEmail() {
			return email;
		}
		@FindBy(id = "continue")
		WebElement Continue;
		public WebElement getContinue() {
			return Continue;
		}
		@FindBy(id = "ap_password")
		WebElement password;
		public WebElement getPassword() {
			return password;
		}
		@FindBy(id = "signInSubmit")
		WebElement submit;
		public WebElement getSubmit() {
			return submit;
		}
		@FindBy(id = "twotabsearchtextbox")
		WebElement search;
		public WebElement getSearch() {
			return search;
		}
		//@FindBy(xpath="//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[4]/div/span/div/div/div/div/div[3]/h2/a/span")
		@FindBy(xpath="//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[4]")
		WebElement select;
		public WebElement getSelect() {
			return select;
		}
		@FindBy(id = "add-to-cart-button")
		WebElement cartAdd;
		public WebElement getCartAdd() {
			return cartAdd;
		}
		@FindBy(id = "nav-cart-count")
		WebElement cart;
		public WebElement getCart() {
			return cart;
		}
		// *[@id="sc-buy-box-ptc-button"]/span/input
		@FindBy(xpath = "//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
		WebElement buy;
		public WebElement getBuy() {
			return buy;
		}
		@FindBy(xpath = "//*[@id=\"address-book-entry-0\"]/div[2]/span/a")
		WebElement deliveryAdd;
		public WebElement getDeliveryAdd() {
			return deliveryAdd;
		}
		@FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
		WebElement sideTab;
		public WebElement getSideTab() {
			return sideTab;
		}
		@FindBy(xpath="//*[@id=\"nav-logo-sprites\"]")
		WebElement home;
		public WebElement getHome() {
			return home;
		}
		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[29]/a")
		WebElement signOut;
		public WebElement getSignOut() {
			return signOut;
		}
		
		public WebDriver getDriver() {
			return driver;
		}
	}
		


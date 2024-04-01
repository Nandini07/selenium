package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import reusablecomponents.reusablecomponents;

public class cartpage extends reusablecomponents{

		WebDriver driver;
	public cartpage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(css=".cartSection h3")
	List<WebElement> cartitems;
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	public  List<WebElement> getCartItems() {
		return cartitems;
		
	}
	public boolean checkCartItems(String productname) {
		boolean match= getCartItems().stream().anyMatch(s->s.getText().equalsIgnoreCase(productname));
		return match;

	}
	public void clickCheckout() {
		checkout.click();
	}
	
	
	
}

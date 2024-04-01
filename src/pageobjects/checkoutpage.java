package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusablecomponents.reusablecomponents;

public class checkoutpage extends reusablecomponents{
	WebDriver driver;
	public checkoutpage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement country;
	
	@FindBy(xpath="//span[@class='ng-star-inserted']")
	WebElement selcountry;
	
	@FindBy(css=".action__submit")
	WebElement placeord;
	
	
	public void placeOrder(String countryname) {
		country.sendKeys(countryname);
		selcountry.click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(1500, 700)");
		placeord.click();
		//return new ConfirmPage(driver);
	}
}

package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusablecomponents.reusablecomponents;

public class landingpage extends reusablecomponents  {
	WebDriver driver;
	public landingpage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement userpassword;
	
	@FindBy(id="login")
	WebElement submit;
	
	public void loginapp(String email, String password) {
		userEmail.sendKeys(email);
		userpassword.sendKeys(password);
		submit.click();
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	
}
package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusablecomponents.reusablecomponents;

public class ConfirmPage extends reusablecomponents{
	WebDriver driver;
	public ConfirmPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".hero-primary")
	WebElement text1;
	
	public String Confirmfinaltext(){
		 String text= text1.getText();
		 return text;
		 
	}
}

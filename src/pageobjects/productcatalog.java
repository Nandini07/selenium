package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import reusablecomponents.reusablecomponents;

public class productcatalog extends reusablecomponents {
	WebDriver driver;
	public productcatalog(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	By toastmessage = By.cssSelector("#toast-container");
	By animmes= By.cssSelector(".ng-animating");	
	
	public List<WebElement> getproductlist() {
		return products;
	}
	
	public  WebElement getproductbyname(String productName) {
		WebElement name = getproductlist().stream().filter(s->s.findElement(By.cssSelector("b")).getText()
			
			.equals(productName)).findFirst().orElse(null);
		return name;
		
	}
	
	public void addProducttoCart(String prodname) {
		WebElement prod= getproductbyname(prodname);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		waitforElementToAppear(toastmessage);
		waitforelementtodisappear(animmes);
	}
	
	
}

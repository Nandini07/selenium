package selpractice;

import java.io.IOException;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.*;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.ConfirmPage;
import pageobjects.cartpage;
import pageobjects.checkoutpage;
import pageobjects.productcatalog;
import testcomponents.BaseTest;

public class endtoendframework extends BaseTest{


	
	@Test
	public void passorder() {
		System.out.println("pass order");
	}
	
	@Test
	
	public void submitorder() throws IOException {
		
		//WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://rahulshettyacademy.com/client");
		//driver.manage().window().maximize();
		String productname="ADIDAS ORIGINAL";
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//Constructor for landing
		
		//landingpage lp= launchapp();
		//lp.goTo();
		lp.loginapp("nandinikandula07@gmail.com", "Nandini@2407");
		
		productcatalog pc= new productcatalog(driver);
		pc.addProducttoCart(productname);
		pc.goToCartPage();
		
		
		cartpage cp = new cartpage(driver);
		boolean match=cp.checkCartItems(productname);
		Assert.assertTrue(match);
		cp.clickCheckout();
		
		checkoutpage cop=new checkoutpage(driver);
		cop.placeOrder("canada");
		
		ConfirmPage conp= new ConfirmPage(driver);
		String text=conp.Confirmfinaltext();
		Assert.assertEquals(text, "THANKYOU FOR THE ORDER.");
		
	
		//driver.findElement(By.id("userEmail")).sendKeys("nandinikandula07@gmail.com");
		
		
		//driver.findElement(By.id("userPassword")).sendKeys("Nandini@2407");
		//driver.findElement(By.id("login")).click();
		
		
		
		//List<WebElement> products =driver.findElements(By.cssSelector(".mb-3"));
		//WebElement name = products.stream().filter(s->s.findElement(By.cssSelector("b")).getText()
				//.equals(productname)).findFirst().orElse(null);
		//System.out.println(name.getText());
		//name.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
		
		//waitforElementToAppear()
		//driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		//driver.findElement(null)
		//List<WebElement> cartitems=driver.findElements(By.cssSelector(".cartSection h3"));
		//boolean match= cartitems.stream().anyMatch(s->s.getText().equalsIgnoreCase(productname));
		//Assert.assertTrue(match);
		//driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		
		
		//driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("canada");
		//driver.findElement(By.xpath("//span[@class='ng-star-inserted']")).click();
		//driver.findElement(By.cssSelector(".action__submit")).click();
		//String text=driver.findElement(By.cssSelector(".hero-primary")).getText();
	
	}

}
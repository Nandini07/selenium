package selpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class checkboxpractice {
	public static void main (String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String text =driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]")).getText();
		
		System.out.println(text);
		driver.findElement(By.id("dropdown-class-example")).click();
		Select sel = new Select(driver.findElement(By.id("dropdown-class-example")));
		sel.selectByVisibleText(text);
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		String Alerttext= driver.switchTo().alert().getText().trim();
		System.out.println(Alerttext);
		String str= Alerttext.split(",")[0].split(" ")[1];
		//String str1= str.split(" ")[1];
		System.out.println(str);
		Assert.assertEquals(str, text);
		driver.switchTo().alert().dismiss();
	}
}

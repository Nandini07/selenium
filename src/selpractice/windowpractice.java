package selpractice;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpractice {
	public static void main (String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	int linkcount= driver.findElements(By.tagName("a")).size();
	System.out.println(linkcount);
	WebElement footdriver = driver.findElement(By.id("gf-BIG"));
	System.out.println(footdriver.findElements(By.tagName("a")).size());
	
	WebElement firstcolumdriver =footdriver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
int size1=firstcolumdriver.findElements(By.tagName("a")).size();
System.out.println(size1);
for(int i=0;i<size1;i++){
	String keysopen= Keys.chord(Keys.CONTROL, Keys.ENTER);
	firstcolumdriver.findElements(By.tagName("a")).get(i).sendKeys(keysopen);	
	
	
		
	}

Set<String> windowsh= driver.getWindowHandles();
java.util.Iterator<String> it = windowsh.iterator();
System.out.println(windowsh.size());
while(it.hasNext()) {
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
	

}
}
	
	
}

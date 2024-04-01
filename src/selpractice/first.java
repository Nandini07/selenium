package selpractice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		//wait.until(ExpectedConditions.alertIsPresent());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2) );
		
		
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
			wait.until(ExpectedConditions.alertIsPresent());
			//driver.switchTo().frame(0);
			driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
			
			
		}
		catch(Exception NoAlertPresentException){
			
			 System.out.println("No alert within the first 10 seconds");
		}
		
		
		
		//boolean flag;
		
		//List<WebElement> links =driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		//for(WebElement link:links) {
			
			//System.out.println(link.getText()+" "+link.getAttribute("href"));
		//}
		
		
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();	
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Tor");
		//Pearson Intl-ON, Toronto
		String text=driver.findElement(By.xpath("//span[normalize-space()='YYZ']")).getText();
		System.out.println(text);
		if(text.equals("YYZ")) {
			//driver.findElement(By.xpath("///span[normalize-space()='YYZ']")).click();
			
			driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
			System.out.println("selected toronto");
			}
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Hyd");
		String text1 = driver.findElement(By.xpath("//span[normalize-space()='HYD']")).getText();
		if(text1.equals("HYD")) {
			driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']//div[contains(@class,'')]")).click();
			System.out.println("selected hyderbad");
		}
		
		//String datee= driver.findElement(By.xpath("//div]@class='dateInnerCell']")).;
		//driver.close();
		
		String year= "September2024";
		
		String yrandmonth= driver.findElement(By.cssSelector(".DayPicker-Caption")).getText();
		//System.out.println(yrandmonth);
		while(!yrandmonth.contains(year)) {
		driver.findElement(By.cssSelector(".DayPicker-NavButton--next")).click();
		yrandmonth= driver.findElement(By.cssSelector(".DayPicker-Caption")).getText();

		//System.out.println(yrandmonth);
		}
		List<WebElement> dates= driver.findElements(By.xpath("//p[text()='29']"));
		for(WebElement date1:dates) {
			//System.out.println(date1.getText());
			Actions act = new Actions(driver);
			act.doubleClick(date1).perform();
			
			break;
		}
		
		driver.findElement(By.cssSelector(".reDates.inactiveWidget")).click();
		
		String reyear= "October2024";
		
		String reyrandmonth= driver.findElement(By.cssSelector(".DayPicker-Caption")).getText();
		//System.out.println(reyrandmonth);
		while(!reyrandmonth.equals(reyear)) {
		driver.findElement(By.cssSelector(".DayPicker-NavButton--next")).click();
		reyrandmonth= driver.findElement(By.cssSelector(".DayPicker-Caption")).getText();
		
		//System.out.println(reyrandmonth);
		}
		
		List<WebElement> datesre= driver.findElements(By.xpath("//p[text()='29']"));
		
		
		System.out.println(datesre.size());
		datesre.remove(0);
		for(WebElement date2:datesre) {
			//System.out.println(date2.getText());
			Actions act = new Actions(driver);
			act.doubleClick(date2).perform();
			
			break;
		}
		driver.findElement(By.cssSelector(".primaryBtn.font24.latoBold.widgetSearchBtn ")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ViewFareBtn")));
		//driver.get("https://www.makemytrip.com/flight/search?itinerary=YYZ-HYD-29/09/2024_HYD-YYZ-29/10/2024&tripType=R&paxType=A-1_C-0_I-0&intl=true&cabinClass=E&ccde=IN&lang=eng");
		
	}

}

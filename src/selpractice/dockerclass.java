package selpractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.edge.EdgeDriver;

public class dockerclass {
	public static void main (String[] args) throws MalformedURLException {
		
		/*ChromeOptions options = new ChromeOptions();

	       options.addArguments("--disable-notifications");
	      options.addArguments("--ignore-ssl-errors=yes");
		options.addArguments("--ignore-ssl-errors=yes");*/
		EdgeOptions options = new EdgeOptions();

	       options.addArguments("--disable-notifications");
	      options.addArguments("--ignore-ssl-errors=yes");
		options.addArguments("--ignore-ssl-errors=yes");
		WebDriver driver= new EdgeDriver(options); 
        URL url = new URL("http://localhost:4444/wd/hub");

		driver= new RemoteWebDriver(url,options);

				
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	   

		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("HYD");
		//driver.switchTo().alert().dismiss();
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("AMD ");
		driver.findElement(By.xpath("//div[contains(text(),'AMD')]")).click();
		//driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='September 2024'])[1]"));
		//driver.findElement(By.cssSelector("div[class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		
		
		//driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73'])[1]")).click()
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")).click();
		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-1g94qm0.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();
		driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		//Select sel = new Select(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-xfv69g r-poiln3 r-1b43r93 r-zl2h9q']")));
		
		//sel.selectByValue("Mrs");
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-1ugchlj r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-1x93onp']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-1ugchlj r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-1x93onp']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'][normalize-space()='Miss']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("nandu");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kandula");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@data-testid=\"contact-number-country-selection\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Canada");
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1b43r93 r-193dp3'][normalize-space()='Canada']")).click();
		driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys("2268832818");
		driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']")).sendKeys("nann@gmail.com");
		driver.findElement(By.xpath("//input[@data-testid='city-inputbox-contact-details']")).sendKeys("Toronto");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-19h5ruw']//div[@class='css-1dbjc4n r-zso239']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//div[@data-testid=\"traveller-info-continue-cta\"]")).click();
		
		driver.close();
		
}
	
}

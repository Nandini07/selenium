package testcomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pageobjects.landingpage;

public class BaseTest {
	public WebDriver driver;
	public landingpage lp;
	public WebDriver initializeDriver() throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\nandi\\eclipse-workspace\\selpractice\\src\\selpractice\\GlobalData.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			 driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://rahulshettyacademy.com/client");
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	@BeforeMethod
	public landingpage  launchapp() throws IOException {
		driver=initializeDriver();
		 lp=new landingpage(driver);
		lp.goTo();
		return lp;

	}
	@AfterMethod
	public void closeapp(){
		driver.close();
		
	}
}

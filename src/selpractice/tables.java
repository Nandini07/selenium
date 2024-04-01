package selpractice;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		int rowcount=driver.findElements(By.xpath("//table[@name='courses']//tbody/tr")).size();
		int colcount= driver.findElements(By.xpath("//table[@name='courses']//tbody/tr/th")).size();
		System.out.println(colcount);

		System.out.println(rowcount);
		String text= driver.findElement(By.xpath("//table[@name='courses']//tbody/tr[3]")).getText();
		System.out.println(text);
		
		List<WebElement> products =driver.findElements(By.cssSelector(".mb-3"));
		//arr.add("al");
		//arr.add("na");
		//arr.add("ab");
		String[] ar = {"al","ab","na"};
		List<String> names = Arrays.asList(ar);
		System.out.println(names.stream().filter(s->s.startsWith("a")).count());
		ChromeOptions co = new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		
		//File src = ((TakeScreenShot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File(""));
		
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("");
		
		//System.out.println(dis);
		//List<char[]> dis=arr1.stream().filter(s->s.distinvt()).toList()
	}

}

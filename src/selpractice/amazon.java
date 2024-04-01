package selpractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	WebDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart tv");
		a.sendKeys(search,Keys.ENTER).build().perform();
		//a.moveToElement(search).sendKeys(Keys.DOWN)
		//driver.findElement(By)
		List<WebElement> ele = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		for(WebElement E: ele) {
			//System.out.println(E.getText());
			
		}*/
		
		// String str="aab";
	     //  String str= "pwwkew";
	        String str="abcbcabcdeafghijklmn";
//TODO Auto-generated method stub
	        StringBuilder sb = new StringBuilder();
	        StringBuilder sb1 = new StringBuilder();

	        int count=0;
	        int count2=0;
	        int end=0;
	        int end1=0;
	        for(int i=0;i<str.length()-1;i++) {
	        	if((int)str.charAt(i)== (int)str.charAt(i+1)-1 || (int)str.charAt(i)== (int)str.charAt(i+1)) {
	        		//sb.append(str.charAt(i));
	        		//sb.append(str.charAt(i+1));
	        		
	        		count++;
	        		 //end=i;
	        	}
	        	else{
	  	        		count=0;
	        		//sb1=sb;
	        	}
	        	if(count>count2) {
	        		count2 =count;
	        		end=i+1;
	        	}
	        	
	        }
	     	System.out.println(end);
	     	System.out.println(count2);

     	System.out.println(str.substring(end-count2,end+1));
     	System.out.println(str.substring(0,4));
     	
      /* Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("Bangalore", 560);

        map.put("Chennai", 890);

        map.put("Hyderabad", 566);

        map.put("Mumbai", 788);

        map.put("New Delhi", 1000);*/
     	
	}     	

	

}

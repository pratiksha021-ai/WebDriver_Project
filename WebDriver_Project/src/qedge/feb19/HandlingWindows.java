package qedge.feb19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HandlingWindows {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://www.facebook.com/r.php?entry_point=login");
//		Thread.sleep(5000);
//		String parent = driver.getWindowHandle();
//		System.out.println(parent);
//		driver.findElement(By.linkText("Terms")).click();
//		driver.findElement(By.linkText("Privacy Policy")).click();
//		driver.findElement(By.linkText("Cookies Policy")).click();
//		
//		Set<String> windows = driver.getWindowHandles();
//		for (String window : windows) {
//			
//			if (!parent.equals(window)) {
//				System.out.println(driver.switchTo().window(window).getTitle());
//				Thread.sleep(5000);
//				driver.close();		
//			}	
//		}
//		driver.switchTo().window(parent);
//		Select listBoxYear = new Select(driver.findElement(By.id("year")));
//		List<WebElement> options = listBoxYear.getOptions();
//		for (WebElement webElement : options) {
//			System.out.println(webElement.getText());	
//		}
//		driver.quit();
//		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.facebook.com/r.php?entry_point=login");
	    Thread.sleep(5000);
	    String parent = driver.getWindowHandle();
	    System.out.println("parent");
	    driver.findElement(By.linkText("Terms")).click();
	    driver.findElement(By.linkText("Privacy Policy")).click();
	    driver.findElement(By.linkText("Cookies Policy")).click();
	    
	    Set<String> windows =driver.getWindowHandles();
	    for (String window : windows) {
	    	
	     if (parent.equals(window)) {
	     System.out.println(driver.switchTo().window(window).getTitle());
	    	Thread.sleep(5000);
	    	driver.close();
				
			}
			
		}
			driver.switchTo().window(parent);
			Select listBoxYear =new Select(driver.findElement(By.id("year")));
			List<WebElement> options=listBoxYear.getOptions();
			for (WebElement webElement : options) {
				System.out.println(webElement.getText());
				}
			driver.close();
		}
	    
	}



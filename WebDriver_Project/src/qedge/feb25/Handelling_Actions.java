package qedge.feb25;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handelling_Actions {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://google.com");
//		Thread.sleep(5000);
//		driver.findElement(By.name("q")).sendKeys("selenium openings");
//		Actions ac=new Actions(driver);
//		for (int i = 0; i < 4; i++) {
//			Thread.sleep(3000);
//			ac.sendKeys(Keys.ARROW_DOWN).perform();	
//		}
//		
//		ac.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("opera opening");
		Actions ac =new Actions(driver);
		for (int i = 0; i < 5; i++) {
			Thread.sleep(3000);
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.quit();
		
		
		

		
	}
	
      
}

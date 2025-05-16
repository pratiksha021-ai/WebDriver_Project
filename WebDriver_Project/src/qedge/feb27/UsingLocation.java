package qedge.feb27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingLocation {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://amazon.in");
//		Actions ac = new Actions(driver);
//		Thread.sleep(5000);
//		WebElement element = driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[2]"));		
//		System.out.println("X: "+ element.getLocation().x + "Y: "+ element.getLocation().y);
//		ac.moveToElement(element).click().perform();
//        Thread.sleep(5000);
//        driver.quit();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions ac =new Actions(driver);
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[1]"));
	    System.out.println("X: "+ element.getLocation().x + "Y: "+ element.getLocation().y);	
		ac.moveToElement(element).click().perform();
		Thread.sleep(5000);
		driver.quit();
	}

}

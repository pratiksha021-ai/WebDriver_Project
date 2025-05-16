
package qedge.feb28;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocation {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		driver.get("https://amazon.in");
//		Thread.sleep(5000);
//		WebElement element = driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[2]"));
//		js.executeScript("document.scrollIntoView", element);
//		element.click();
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[2]"));
		js.executeScript("document.scrollIntoView", element);
		element.clear();
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}

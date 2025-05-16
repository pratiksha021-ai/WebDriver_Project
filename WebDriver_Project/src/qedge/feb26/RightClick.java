package qedge.feb26;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://www.google.com/");
//		Thread.sleep(5000);
//		Actions ac= new Actions(driver);
//		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Gmail']"))).contextClick();
//		ac.pause(5000);
//		ac.sendKeys(Keys.ARROW_DOWN).perform();
//		ac.sendKeys(Keys.ARROW_DOWN).perform();
//		ac.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(5000);
//		Set<String> windows = driver.getWindowHandles();
//		Object[] arrWindows = windows.toArray();
//		String window1=arrWindows[0].toString();
//		String windows2 = arrWindows[1].toString();
//		driver.switchTo().window(windows2);
//		Thread.sleep(3000);
//		driver.close();
//		driver.switchTo().window(window1);
//		Thread.sleep(5000);
//		driver.quit();
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Gmail']"))).contextClick();
		ac.pause(3000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
		Object[] arrWindows =windows.toArray();
		String window1 =arrWindows[0].toString();
		String window2 =arrWindows[1].toString();
		driver.switchTo().window(window2);
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(window1);
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}

}

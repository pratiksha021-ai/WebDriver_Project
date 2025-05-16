package qedge.feb26;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick2 {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://www.google.com/");
//		Thread.sleep(5000);
//		Actions ac= new Actions(driver);
//		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Gmail']"))).contextClick().perform();		
//		//create robot class object
//		Robot robot=new Robot();
//		for (int i = 0; i < 2; i++) {
//			Thread.sleep(3000);
//			robot.keyPress(KeyEvent.VK_DOWN);
//			robot.keyRelease(KeyEvent.VK_DOWN);
//		}
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(5000);
//		Object[] allWindows=driver.getWindowHandles().toArray();
//		//switch to second window
//		driver.switchTo().window(allWindows[1].toString());
//		Thread.sleep(5000);
//		//Get all the links on second window
//		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
//		for (WebElement webElement : allLinks) {
//			System.out.println(webElement.getText());
//			System.out.println(webElement.getAttribute("href"));
//		}
//		//Close second window
//		driver.close();
//		driver.switchTo().window(allWindows[0].toString());
//		Thread.sleep(5000);
//		//Print first window title
//		System.out.println(driver.getTitle());
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Gmail']"))).contextClick().perform();
		Robot robot=new Robot();
		for (int i = 0; i < 2; i++) {
			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);	
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		Object[]allwindows=driver.getWindowHandles().toArray();
		driver.switchTo().window(allwindows[0].toString());
		Thread.sleep(5000);
		List<WebElement> alllinks =driver.findElements(By.tagName("a"));
		for (WebElement webElement : alllinks) {
			System.out.println(webElement.getText());
			System.out.println(webElement.getAttribute("href"));
		}
		driver.close();
		driver.switchTo().window(allwindows[0].toString());
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}

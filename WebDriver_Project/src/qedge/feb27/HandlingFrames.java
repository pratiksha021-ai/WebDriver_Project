package qedge.feb27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://jqueryui.com/droppable/");
//		Thread.sleep(5000);
//        Actions ac = new Actions(driver);
//        List<WebElement> frames= driver.findElements(By.tagName("iframe"));
//        System.out.println(frames.size());
//        driver.switchTo().frame(0);
//        Thread.sleep(5000);
//        WebElement source = driver.findElement(By.id("draggable"));
//        WebElement target = driver.findElement(By.id("droppable"));
//        ac.clickAndHold(source).moveToElement(target).release().perform();
//        Thread.sleep(3000);
//        if (target.getText().equals("Dropped!")) {
//			System.out.println("Drag and drop succesfull");
//		}
//        driver.switchTo().defaultContent();
//        Thread.sleep(3000);
//        ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
//        Thread.sleep(5000);
//        driver.quit();
        	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		List<WebElement> frames =driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		 ac.clickAndHold(source).moveToElement(target).release().perform();
	        Thread.sleep(3000);
	        if (target.getText().equals("Dropped!")) {
				System.out.println("Drag and drop succesfull");
			}
	        driver.switchTo().defaultContent();
	        Thread.sleep(3000);
	        ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
	        Thread.sleep(5000);
	        driver.quit();
	}

}

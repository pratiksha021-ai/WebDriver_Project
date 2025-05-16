package qedge.feb27;
import java.util.List;

import org.checkerframework.framework.qual.TargetLocations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.org.antlr.v4.runtime.atn.SemanticContext.AND;
import io.opentelemetry.sdk.metrics.internal.view.DropAggregation;

public class DragAndDrop2 {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://jqueryui.com/droppable/");
//		Thread.sleep(5000);
//        Actions ac = new Actions(driver);
//        WebElement frame = driver.findElement(By.className("demo-frame"));
//        driver.switchTo().frame(frame);
//        WebElement source = driver.findElement(By.id("draggable"));
//        WebElement target = driver.findElement(By.id("droppable"));
//        int x=target.getLocation().x;
//        int y = target.getLocation().y;
//        ac.dragAndDropBy(source, x, y).perform();
//        System.out.println(x+"    "+y);
//        //ac.dragAndDrop(source, target);
//        Thread.sleep(5000);
//        if (target.getText().equals("Dropped!")) {
//			System.out.println("Drag and drop succesfull");
//		}
//        driver.switchTo().defaultContent();
//        Thread.sleep(3000);
//        ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
//        Thread.sleep(5000);
//        driver.quit();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac= new Actions(driver);
		WebElement frame= driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement target =driver.findElement(By.id("droppable"));
		int x=target.getLocation().x;
		int y=target.getLocation().y;
		ac.dragAndDropBy(source, x, y).perform();
		System.out.println(x+"    "+y);
		Thread.sleep(5000);
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

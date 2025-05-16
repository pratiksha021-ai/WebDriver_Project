package qedge.feb28;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//write a java script to scroll to particualr element
public class JavaScript2 {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.location='https://amazon.in'");
//		Thread.sleep(5000);
//		//scroll to the bottom from top
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		Thread.sleep(5000);
//		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
//		Thread.sleep(5000);
//		js.executeScript("window.scrollTo(0,1000)");
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(document.body.scrollHight,0)");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo()0,1000");
		Thread.sleep(5000);
		driver.quit();
	}

}

package qedge.march5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Example {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://flights.qedgetech.com/");
//		//create reference object for webdriverwait class
//		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		//wait until registe link is clickable
//		mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register")));
//		//mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register")));
//		driver.findElement(By.linkText("Register")).click();
//		//wait until name textbox is visible
//		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
//		driver.findElement(By.name("name")).sendKeys("testing");
//		driver.quit();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(3000);
		WebDriverWait myWait= new WebDriverWait(driver,Duration.ofSeconds(30));
		myWait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Regist")));
		driver.findElement(By.partialLinkText("Regist")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
		driver.findElement(By.name("name")).sendKeys("pratiksha");
		driver.quit();
	}

}

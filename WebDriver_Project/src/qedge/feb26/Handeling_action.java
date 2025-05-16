package qedge.feb26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handeling_action {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://www.ajio.com/");
//		Thread.sleep(5000);
//		Actions ac= new Actions(driver);
//		//mouse hover on MEN
//		ac.moveToElement(driver.findElement(By.xpath("//span[@aria-label='MEN']"))).perform();
//		ac.pause(5000);
//		//click on Shirts under MEN menu
//		ac.moveToElement(driver.findElement(By.xpath("(//a[text()='Shirts'])[@href='/men-shirts/c/830216013']"))).click().perform();
//		ac.pause(5000);
//		//mouse hover to KIDS
//		ac.moveToElement(driver.findElement(By.xpath("//span[@aria-label='KIDS']"))).perform();
//		ac.pause(5000);
//		//Click on soft toys under KIDS
//		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Soft Toys']"))).click().perform();
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ajio.com/");
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[@aria-label='WOMEN']"))).perform();
		ac.pause(5000);
		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Sarees']"))).click().perform();
		ac.pause(5000);
		ac.moveToElement(driver.findElement(By.xpath("//span[@aria-label='BEAUTY']"))).click().perform();
		ac.pause(3000);
		ac.moveToElement(driver.findElement(By.xpath("//a[@title='Perfumes']"))).click().perform();
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}

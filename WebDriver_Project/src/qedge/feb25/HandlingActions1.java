package qedge.feb25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingActions1 {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://gmail.com");
//		Thread.sleep(5000);
//		Actions ac= new Actions(driver);
//		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Create account']"))).click().perform();
//		for (int i = 0; i < 3; i++) {
//			Thread.sleep(3000);
//			ac.sendKeys(Keys.ARROW_UP).perform();
//		}
//		
//		ac.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("testing");
//		ac.moveToElement(driver.findElement(By.xpath("//span[starts-with(text(),'Next')]"))).click().perform();
//		Thread.sleep(5000);
//		Select months=new Select(driver.findElement(By.xpath("//select[@id='month']")));
//		List<WebElement> options=months.getOptions();
//		System.out.println(options.size());
//		for (WebElement option : options) {
//			System.out.println(option.getText());
//		}
//		
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Create account']"))).click().perform();
		Thread.sleep(5000);
		for (int i = 0; i < 3; i++) {
			Thread.sleep(5000);
			ac.sendKeys(Keys.ARROW_UP).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("pratiksha");
        ac.moveToElement(driver.findElement(By.xpath("//span[starts-with(text(),'Next')]"))).click().perform();
        Thread.sleep(5000);
        Select month=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        List<WebElement>options=month.getOptions();
        System.out.println(options.size());
        for (WebElement option : options) {
			System.out.println(option.getText());
		}
        Thread.sleep(5000);
        driver.quit();
        
        
	}

}

package qedge.feb19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingAlert {
	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		Thread.sleep(5000);
//		driver.findElement(By.name("proceed")).click();
//		Thread.sleep(2000);
//		String alert_msg= driver.switchTo().alert().getText();
//		System.out.println("Alert message: "+ alert_msg);
//		driver.switchTo().alert().accept();
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		String alert_msg=driver.switchTo().alert().getText();
		System.out.println("Alert message:"+ alert_msg);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
		 
	   
		
		
		}

}

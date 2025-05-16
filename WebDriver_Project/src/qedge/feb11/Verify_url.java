package qedge.feb11;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_url {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://gmail.com");
//		Thread.sleep(5000);
//	    String expected="https:";
//	    String actual=driver.getCurrentUrl();
//	    if (actual.startsWith(expected)) {
//	    	System.out.println("url is secured" + " Actual "+actual + "expected "+ expected);		
//		} else {
//			System.out.println("Url is Not Secured    "+expected+"      "+actual);
//		}
//	    driver.quit();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);
		String expected="https";
		String actual=driver.getCurrentUrl();
		if (actual.startsWith(expected)) {
			System.out.println("url is secured"+" Actual"+actual+"expected"+expected);
			
		} else {
			System.out.println("Url is Not Secured    "+expected+"      "+actual);
		}
	    driver.quit();
		

	}

}

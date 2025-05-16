package qedge.feb11;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		Thread.sleep(5000);
//		String title= driver.getTitle();
//		String expected="google";
//		if (expected.equalsIgnoreCase(title)) {
//        System.out.println("title is matching");
//        
//		}
//		else { 
//			System.out.println("title is not matching");
//			
//		}
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(8000);
		String title=driver.getTitle();
		String expecte="whatsapp";
        if(expecte.equalsIgnoreCase(title)) {
        	System.out.println("title is matching");
        	
        	
        }
        else {
			System.out.println("title is nat matching");
		}
        Thread.sleep(8000);
        driver.quit();
	}

}

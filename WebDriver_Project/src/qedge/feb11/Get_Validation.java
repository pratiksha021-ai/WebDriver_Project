package qedge.feb11;

import java.awt.SystemColor;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.MemberSubstitution.Current;

public class Get_Validation {

	private static final char[] CurrentUrl = null;

	public static void main(String[] args) throws Throwable {
		//Create instance object
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://flipkart.com");
//		Thread.sleep(5000);
//		//Get title of the url
//		String pageTitle =  driver.getTitle();
//		System.out.println(pageTitle);
//		System.out.println(pageTitle.length());
//		
//		String currentUrl= driver.getCurrentUrl();
//	System.out.println(currentUrl);
//		System.out.println(currentUrl.length());
//		
//		Thread.sleep(5000);
//		
//		driver.quit();
//		
		
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);
		//Get title of the url
     	String pageTitle =  driver.getTitle();
     	System.out.println(pageTitle);
     	System.out.println(pageTitle.length());
     	String currenturl = driver.getCurrentUrl();
     	System.out.println(currenturl);
     	System.out.println(currenturl.length());
     	Thread.sleep(5000);
     	driver.quit();
     	
        
        
		
		
		

	}

}

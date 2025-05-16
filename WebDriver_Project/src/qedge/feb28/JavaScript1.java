package qedge.feb28;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.location='https://amazon.in'");
//		Thread.sleep(5000);
//		//print title and length of title
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
//		System.out.println(title.length());
//		
//		//print url and length of url
//		String url=js.executeScript("return document.URL").toString();
//		System.out.println(url);
//		System.out.println(url.length());
//		
//		//print domain name and length of domain
//		String domain=js.executeScript("return document.domain").toString();
//		System.out.println(domain);
//		System.out.println(domain.length());
//		 driver.quit();
		
		
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   JavascriptExecutor js= (JavascriptExecutor) driver;
	   js.executeScript("window.location='https://amazon.in'");
	   Thread.sleep(5000);
	   String title = js.executeScript("return document.title").toString();
	   System.out.println(title);
	   System.out.println(title.length());
	   
	   String url=js.executeScript("return document.URL").toString();
	   System.out.println(url);
	   System.out.println(url.length());
	   
	   String domain=js.executeScript("return document.domain").toString();
	   System.out.println(domain);
	   System.out.println(domain.length());
	   driver.quit();
		

	}

}

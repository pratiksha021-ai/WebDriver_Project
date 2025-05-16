package qedge.feb10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	public static void main(String[] args) throws Throwable {
		//
		WebDriver chrmDriver = new ChromeDriver();
		//chrmDriver.get("https://www.gmail.com");
		chrmDriver.manage().window().maximize();
		chrmDriver.manage().deleteAllCookies();
		chrmDriver.get("https://www.google.com");
		//Suspend execution for 5 seconds
		Thread.sleep(5000);
		
		//kill browser
		chrmDriver.quit();
		//chrmDriver.close();
		//WebDriver edgeDriver = new EdgeDriver();
		//WebDriver fireFox = new FirefoxDriver();
		//https://www.amazon.in
		
//		WebDriver chrmDriver1 = new ChromeDriver();
//		chrmDriver1.get("https://www.amazon.in/?&tag=googhydrabk1");
//		chrmDriver1.manage().window().maximize();
//		chrmDriver.manage().deleteAllCookies();
//		chrmDriver.get("https://www.google.com");
		//kill browser
		

	}

}

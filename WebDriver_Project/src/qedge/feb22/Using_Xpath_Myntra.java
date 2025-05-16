package qedge.feb22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Xpath_Myntra {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://www.myntra.com/");
//		Thread.sleep(5000);
//		List<WebElement> links= driver.findElements(By.xpath("(//ul[@class='desktop-navBlock'])[1]//following::li/a"));
//		System.out.println(links.size());
//		for (WebElement each : links) {
//			System.out.println(each.getText());
//			System.out.println(each.getAttribute("href"));
//		}
//		
//		Thread.sleep(5000);
//		driver.quit();
		//(//div[@class='desktop-navLink'])[4]//following::ul/li/a
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		//home xpath
		//List<WebElement> links =driver.findElements(By.xpath("(//div[@class='desktop-navLink'])[4]//following::ul/li/a"));
		
	    //beauty xpath
		List<WebElement> links =driver.findElements(By.xpath("(//div[@class='desktop-navLink'])[5]//following::ul/li/a"));
		System.out.println(links.size());
		for (WebElement each : links) {
			System.out.println(each.getText());
			System.out.println(each.getAttribute("href"));
			
		}
		Thread.sleep(5000);
		driver.quit();

	}

}

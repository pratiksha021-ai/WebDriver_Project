package qedge.feb22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Xpath {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//		Thread.sleep(5000);
//        List<WebElement> footerLinks=driver.findElements(By.xpath("//div[@id='pageFooter']//following::ul/li/a"));
//        System.out.println("Number of links: " + footerLinks.size());
//        for (WebElement each : footerLinks) {
//        	System.out.println(each.getText());
//        	System.out.println(each.getAttribute("href"));
//		}
//        
//        Thread.sleep(5000);
//        driver.quit();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);
	    List<WebElement> footerlinks=	driver.findElements(By.xpath("//div[@id='pageFooter']//following::a"));
	    Thread.sleep(5000);
	    System.out.println("number of links" + footerlinks.size());
	    for (WebElement each : footerlinks) {
	    	System.out.println(each.getText());
	    	System.out.println(each.getAttribute("href"));
			
		}
	    Thread.sleep(5000);
	    driver.quit();
       
	}

}

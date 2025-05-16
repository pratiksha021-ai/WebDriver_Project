package qedge.feb21;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://gmail.com");
//		Thread.sleep(5000);
//		String parent = driver.getWindowHandle();
//		System.out.println(parent);
//		driver.findElement(By.linkText("Help")).click();
//		driver.findElement(By.linkText("Privacy")).click();
//		driver.findElement(By.linkText("Terms")).click();
//		Thread.sleep(5000);
//		Set<String> allwindows = driver.getWindowHandles();
//		Iterator<String> itr = allwindows.iterator();
//		while (itr.hasNext()) {
//			String window = (String) itr.next();
//			if (!parent.equals(window)) {
//				System.out.println(window);
//				driver.switchTo().window(window);
//				Thread.sleep(2000);
//				System.out.println(driver.getTitle());
//				Thread.sleep(5000);
//				driver.close();
//			}
//			
//		}
//		
//		driver.switchTo().window(parent);
//		Thread.sleep(2000);
//		driver.findElement(By.name("identifier")).sendKeys("rajeev1234");
//		Thread.sleep(5000);
//		driver.quit();
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		Thread.sleep(5000);
		Set<String> allwindow =driver.getWindowHandles();
		Iterator<String> itr = allwindow.iterator();
		while (itr.hasNext()) {
			String window = (String) itr.next();
			if (!parent.equals(window)) {
				System.out.println(window);
				driver.switchTo().window(window);
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				Thread.sleep(5000);
				}
			
		}
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.findElement(By.name("identifier")).sendKeys("pratiksha123");
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	

	}

}

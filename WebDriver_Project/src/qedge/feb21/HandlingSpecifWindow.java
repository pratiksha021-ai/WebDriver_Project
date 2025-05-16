package qedge.feb21;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSpecifWindow {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://gmail.com");
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("Help")).click();
//		driver.findElement(By.linkText("Privacy")).click();
//		String Parent= driver.getWindowHandle();
//		System.out.println(Parent);
//		Object[] windows= driver.getWindowHandles().toArray();
//		driver.switchTo().window(windows[2].toString());
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		driver.close();
//		driver.switchTo().window(windows[1].toString());
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		driver.close();
//		driver.switchTo().window(windows[0].toString());
//		System.out.println(driver.getTitle());
//		Thread.sleep(5000);
//		driver.close();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		Object[] windows = driver.getWindowHandles().toArray();
		driver.switchTo().window(windows[2].toString());
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(windows[1].toString());
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(windows[0].toString());
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}

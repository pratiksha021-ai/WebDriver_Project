package qedge.feb15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.navigate().to("https:/google.com");
//		System.out.println("pagetitle[1]"+driver.getTitle());
//		Thread.sleep(5000);
//		//click gmail link in google page
//		driver.findElement(By.linkText("Gmail")).click();
//		System.out.println("pagetitle[2]"+driver.getTitle());
//		Thread.sleep(5000);
//		driver.navigate().back();
//		Thread.sleep(5000);
	//System.out.println("pagetitle[3]"+driver.getTitle());
//		driver.navigate().forward();
//		Thread.sleep(5000);
//		System.out.println("pagetitle[4]"+driver.getTitle());
//		
//		//reload page
//		driver.navigate().refresh();
//		Thread.sleep(5000);
//		driver.quit();
//		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https:/google.com");
		System.out.println("pagetitle[1]"+driver.getTitle());
		Thread.sleep(4000);
		driver.findElement(By.linkText("Images")).click();
		System.out.println("Pagetitle[2]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println("pagetitle[3]"+driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println("pagetitle[4]"+driver.getTitle());
		driver.navigate().refresh();
		driver.quit();
		
		
		

	}

}

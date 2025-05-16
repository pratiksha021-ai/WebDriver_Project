package qedge.feb15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Xpath {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://flights.qedgetech.com");
//		//Suspend execution for 5 seconds
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("manual");
//		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("98765543");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("piku1@gmail.com");
//		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("test@!@#$");
//		driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Male");
//		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).sendKeys("20-12-1987");
//		driver.findElement(By.xpath("//input[@id='flexCheckChecked']")).click();
//		driver.findElement(By.xpath("//input[@name='submit']")).click();
//		
//		String message = driver.findElement(By.xpath("//h4[1]")).getText();
//		System.out.println(message);
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vrushali dutt");
		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("9420856176");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vrushali123@gmail.com");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("vri123@#!");
		driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Female");
		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).sendKeys("08-10-2000");
		driver.findElement(By.xpath("//input[@id='flexCheckChecked']")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//h4[1]")).getText());
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}

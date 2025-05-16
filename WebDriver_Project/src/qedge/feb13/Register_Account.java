package qedge.feb13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Account {

	public static void main(String[] args) throws Throwable {
		
//		WebDriver chrmDriver = new ChromeDriver();
//		//chrmDriver.get("https://www.gmail.com");
//		chrmDriver.manage().window().maximize();
//		chrmDriver.manage().deleteAllCookies();
//		chrmDriver.get("https://flights.qedgetech.com");
//		//Suspend execution for 5 seconds
//		Thread.sleep(5000);
//		//click register link
//		chrmDriver.findElement(By.partialLinkText("Regist")).click();
//		Thread.sleep(5000);
//		chrmDriver.findElement(By.name("name")).sendKeys("Rajeev");
//		chrmDriver.findElement(By.id("contact")).sendKeys("9145305812");
//		chrmDriver.findElement(By.name("email")).sendKeys("bluelotus220@gmail.com");
//		chrmDriver.findElement(By.name("password")).sendKeys("test@123");
//		chrmDriver.findElement(By.name("gender")).sendKeys("Male");
//		Thread.sleep(2000);
//		chrmDriver.findElement(By.id("popupDatepicker")).sendKeys("16-12-1988");
//		chrmDriver.findElement(By.id("flexCheckChecked")).click();
//		Thread.sleep(2000);
//		chrmDriver.findElement(By.name("submit")).click();
//		Thread.sleep(5000);
//		chrmDriver.quit();
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Regist")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("name")).sendKeys("pratiksha");
		driver.findElement(By.name("contact")).sendKeys("9145305812");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("golaitpratiksha394@gmail.com");
		driver.findElement(By.name("password")).sendKeys("piku@123");
		Thread.sleep(5000);
		driver.findElement(By.name("gender")).sendKeys("Female");
		driver.findElement(By.id("popupDatepicker")).sendKeys("08/11/1999");
		Thread.sleep(4000);
		driver.findElement(By.id("flexCheckChecked")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
		
		

	}

}

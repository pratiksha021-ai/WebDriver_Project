package qedge.march5;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Example {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://flights.qedgetech.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.findElement(By.linkText("Register")).click();
//		//Thread.sleep(10000);
//		driver.findElement(By.name("name")).sendKeys("test");
//		driver.findElement(By.name("contact")).sendKeys("547894789");
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flights.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.partialLinkText("Regist")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("pratiksha");
		driver.findElement(By.name("contact")).sendKeys("9667876");
		Thread.sleep(5000);
		driver.quit();
	}

}



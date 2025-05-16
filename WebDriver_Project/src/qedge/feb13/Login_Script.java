package qedge.feb13;

import java.awt.Choice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Script {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://flights.qedgetech.com/");
//		Thread.sleep(5000);
//		driver.findElement(By.name("email")).sendKeys("bluelotus220@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test@123");
//		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[2]/button[1]")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
//		Thread.sleep(10000);
//		driver.quit();
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://flights.qedgetech.com/");
	    Thread.sleep(5000);
	    driver.findElement(By.name("email")).sendKeys("bluelotus220@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("test@123");
	    driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
	    Thread.sleep(5000);
	    driver.quit();
	    

	}

	private static void findElement(By name) {
		// TODO Auto-generated method stub
		
	}

}

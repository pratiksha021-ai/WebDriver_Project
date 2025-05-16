package qedge.feb14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_UsingWebelement {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://orangehrm.qedgetech.com/");
//		Thread.sleep(5000);
//		WebElement element_username=  driver.findElement(By.name("txtUsername"));
//		element_username.clear();
//		element_username.sendKeys("Admin");
//		String userName=element_username.getAttribute("value");
//		System.out.println(userName);
//		
//		//Find password element
//		WebElement element_passwd=driver.findElement(By.id("txtPassword"));
//		element_passwd.clear();
//		element_passwd.sendKeys("Qedge123!@#");
//		String passwd = element_passwd.getAttribute("value");
//		System.out.println(passwd);
//		
//		//Find login button
//		WebElement btnLogin = driver.findElement(By.name("Submit"));
//		btnLogin.click();
//		Thread.sleep(5000);
//		
//		//Check if login successful
//		String expected = "dashboard";
//		String actual = driver.getCurrentUrl();
//		if(actual.contains(expected))
//		{
//			System.out.println("Login success:::"+expected+"     "+actual);
//		}
//		else
//		{
//			String errorMessage = driver.findElement(By.id("spanMessage")).getText();
//			System.out.println(errorMessage+"    "+expected+"     "+actual);
//		}
//		Thread.sleep(5000);
//		driver.quit();
	 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(5000);
		WebElement element_userName= driver.findElement(By.name("email"));
		element_userName.clear();
		element_userName.sendKeys("vrushali123@gmail.com");
	    System.out.println(element_userName.getAttribute("value"));
	    
	    WebElement element_passwd= driver.findElement(By.name("password"));
	    element_passwd.clear();
	    element_passwd.sendKeys("vri123@#t");
	    System.out.println(element_passwd.getAttribute("value"));
	    
	    WebElement element_sign= driver.findElement(By.xpath("//button[normalize-space()='Sign In']"));
	    element_sign.click();
	    Thread.sleep(5000);
	    String expected = "vrushali-dutt.html";
	    String actual = driver.getCurrentUrl();
	    if(actual.contains(expected))
	    {
	    	System.out.println("Login success:::"+expected+"     "+actual);
	    }
	    else
	    {
	    	String errorMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissable']")).getText();
	    	System.out.println(errorMsg);
	    }
	    
	    Thread.sleep(5000);
	    driver.quit();
	}

}

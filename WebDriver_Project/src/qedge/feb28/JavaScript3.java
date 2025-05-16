package qedge.feb28;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript3 {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
//		Thread.sleep(5000);
//		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin'");
//		js.executeScript("document.getElementById('txtPassword').value='Qedge123!@#'");
//		js.executeScript("document.querySelector('#btnLogin').click()");
//		Thread.sleep(5000);
//		String Expected ="dashboard";
//		String Actual = js.executeScript("return document.URL").toString();
//		if(Actual.contains(Expected))
//		{
//			System.out.println("Login success::"+Expected+"   "+Actual);
//		}
//		else
//		{
//			//capture error message
//			String error_mess= js.executeScript("return document.querySelector(\"#spanMessage\").innerHTML").toString();
//			System.out.println(error_mess+"    "+Expected+"     "+Actual);
//		}
//		Thread.sleep(5000);
//	driver.quit();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin'");
		js.executeScript("document.querySelector(\"#txtPassword\").value='Qedge123!@#'");
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		Thread.sleep(5000);
		String Expected ="Dashboard";
		String Actual = js.executeScript("return document.URL").toString();
		if (Actual.contains(Expected)) 
		{
			System.out.println("Login success::"+Expected+"    "+Actual);	
		}
		else
			{
				String error_mess= js.executeScript("return document.querySelector(\"#spanMessage\").innerHTML").toString();
				System.out.println(error_mess+"    "+Expected+"     "+Actual);
			}
			Thread.sleep(5000);
		driver.quit();

	}

}

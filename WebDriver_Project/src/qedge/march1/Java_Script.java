package qedge.march1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.location='https://flights.qedgetech.com/'");
//		Thread.sleep(5000);
//		js.executeScript("document.querySelector(\"a[href='https://flights.qedgetech.com/register.html']\").click()");
//		Thread.sleep(5000);
//		js.executeScript("document.querySelector(\"#name\").value='Admin2'");
//		js.executeScript("document.querySelector(\"#contact\").value='12345678'");
//		js.executeScript("document.querySelector(\"#email\").value='piku24@gmail.com'");
//		js.executeScript("document.querySelector(\"#address\").value='test@123'");
//		js.executeScript("document.querySelector(\"select[name='gender']\").value='Female'");
//		js.executeScript("document.querySelector(\"#popupDatepicker\").value='08-11-1999'");
//        js.executeScript("document.querySelector(\"#flexCheckChecked\").click()");
//        js.executeScript("document.querySelector(\"input[value='Register']\").click()");
//        Thread.sleep(5000);
//        String message=js.executeScript("document.querySelector(\"body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h4:nth-child(2)\").innerHTML").toString();
//		System.out.println(message);
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.location='https://flights.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"a[href='https://flights.qedgetech.com/register.html']\").click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#name\").value='pratiksha1'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#contact\").value='923789900'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#email\").value='nrhtiksha@134gamil.com'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#address\").value='test@123'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"select[name='gender']\").value='Female'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#popupDatepicker\").value='08/11/1999'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#flexCheckChecked\").click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"input[value='Register']\").click()");
		Thread.sleep(5000);
		driver.quit();
	}

}

package qedge.feb14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://orangehrm.qedgetech.com/");
//		Thread.sleep(5000);
//		String element_text=driver.findElement(By.partialLinkText("Forgot your password")).getText();
//		System.out.println(element_text);
//		String element_url=driver.findElement(By.partialLinkText("Forgot your password")).getAttribute("href");
//		System.out.println(element_url);
//		driver.quit();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(5000);
		String element_text=driver.findElement(By.partialLinkText("I forgot my passwo")).getText();
		System.out.println(element_text);
		driver.quit();
		
		}

}

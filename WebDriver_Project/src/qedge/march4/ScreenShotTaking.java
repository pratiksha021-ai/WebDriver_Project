package qedge.march4;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTaking {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://webapp.qedgetech.com/");
//		Thread.sleep(5000);
//		//take screen shot
//		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//copy screen shot into local system
//		FileUtils.copyFile(screen, new File("E:/screenshot/loginwindow.png"));
//		driver.quit();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://webapp.qedgetech.com/");
		Thread.sleep(5000);
		File screen= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("E:/screenshot/loginwindow.png"));
		driver.quit();
		

	}

}

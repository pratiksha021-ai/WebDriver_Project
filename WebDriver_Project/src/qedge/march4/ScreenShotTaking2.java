package qedge.march4;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTaking2 {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://webapp.qedgetech.com/");
//		Thread.sleep(5000);
//		//take screen shot
//		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//copy screen shot into local system
//		Date date = new Date();
//		DateFormat df = new SimpleDateFormat("YYYY_MM_dd");
//		String formatedDate=df.format(date);
//		FileUtils.copyFile(screen, new File("E:/screenshot/"+formatedDate+"_loginwindow.png"));
//		driver.quit();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://webapp.qedgetech.com/");
        Thread.sleep(5000);
        File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Date date= new Date();
        DateFormat df =new SimpleDateFormat("YYYY_MM_dd");
        String formatedDate=df.format(date);
        FileUtils.copyFile(screen, new File("E:/screenshot/_loginwindow"+formatedDate+".png"));
        driver.quit();
        
	}

}

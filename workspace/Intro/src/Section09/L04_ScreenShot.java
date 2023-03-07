package Section09;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L04_ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsoto\\Desktop\\Resources\\drivers_v1\\chromedriver.exe");		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationtesting.co.uk/");
		
		takeSnapShot(driver);
		
		
	}	
	public static void takeSnapShot(WebDriver webdriver) throws IOException {
		//Clases importadas desde las librerias agregadas APACHE COMMONS IO
		File sourceFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);		
		
		File destFile = new File("C:\\Users\\fsoto\\Desktop\\Resources\\screenshots\\"+timestamp()+".png");
		
		FileUtils.copyFile(sourceFile, destFile);
	}
	public static String timestamp() {		
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}

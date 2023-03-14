package Section12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L02_Login {
	WebDriver driver;
	@BeforeSuite
	public void setup() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsoto\\Desktop\\Resources\\drivers_v1\\chromedriver.exe");		
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Properties prop = new Properties();
		FileInputStream data = new FileInputStream("C:\\Users\\fsoto\\Desktop\\Resources\\workspace\\Intro\\src\\Section12\\L02_config.properties");		
		prop.load(data);		
		
		driver.get(prop.getProperty("url"));
		
	}
	@Test
	public void singnin() throws InterruptedException{		
		driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("testz@test.com");		
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("elcapo85");
		driver.findElement(By.cssSelector("[data-link-action='sign-in']")).click();
		System.out.println("User has logged in");
		Thread.sleep(2000);
	}	

}

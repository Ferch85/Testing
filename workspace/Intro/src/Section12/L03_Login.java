package Section12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L03_Login {
	WebDriver driver;
	@BeforeSuite
	public void setup() throws InterruptedException, IOException {
		
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream("C:\\Users\\fsoto\\Desktop\\Resources\\workspace\\Intro\\src\\Section12\\L03_config.properties");		
		prop.load(data);
		
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsoto\\Desktop\\Resources\\drivers_v1\\chromedriver.exe");			
			driver = new ChromeDriver();
		}else if(prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\fsoto\\Desktop\\Resources\\drivers_v1\\geckodriver.exe");			
			driver = new FirefoxDriver();
		}else {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\fsoto\\Desktop\\Resources\\drivers_v1\\msedgedriver.exe");			
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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

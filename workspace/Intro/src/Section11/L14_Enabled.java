package Section11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class L14_Enabled {
	WebDriver driver;
	@BeforeSuite
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsoto\\Desktop\\Resources\\drivers_v1\\chromedriver.exe");		
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");
		
	}
	@Test (enabled = false)
	public void enterEmail() throws InterruptedException {		
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("testz@test.com");
		Thread.sleep(3000);		
	}
	@Test
	public void enterPassword() throws InterruptedException {		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("elcapo85");
		Thread.sleep(3000);		
	}
}

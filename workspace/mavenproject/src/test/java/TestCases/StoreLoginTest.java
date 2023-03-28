package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjects.TestStoreLoginPage;

public class StoreLoginTest {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsoto\\Desktop\\Resources\\drivers_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");
		TestStoreLoginPage logPage = new TestStoreLoginPage(driver);
		
		logPage.getEmail().sendKeys("testz@test.com");
		logPage.getPassword().sendKeys("elcapo85");
		logPage.getLoginBtn().click();
	}
}

package Section08;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L07_BrowserTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsoto\\Desktop\\Resources\\drivers_v1\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/browserTabs.html");
		
		for(int i = 0; i < 3; i++) {
			driver.findElement(By.cssSelector("[type]")).click();
		}
		
		
		
		ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
		
		
		for(String window : driver.getWindowHandles()) {			
			Thread.sleep(1500);
			driver.switchTo().window(window);
		}
		
		driver.switchTo().window(windowHandles.get(0));
	
		
		
	}

}

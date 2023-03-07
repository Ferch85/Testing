package Section08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L01_TravelWebsitePt1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsoto\\Desktop\\Resources\\drivers_v1\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		WebDriver driver = new ChromeDriver(options);	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.easyjet.com/en");	
		
		driver.findElement(By.id("ensCloseBanner")).click();
		
		driver.findElement(By.name("origin")).clear();		
		
		driver.findElement(By.name("origin")).sendKeys("London");
		
		//driver.findElement(By.cssSelector("ul[role='listbox'] > li:nth-of-type(3)")).click();
		
		List<WebElement> origins = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li>a>span")));
		
		for(WebElement origin : origins) {			
			
			if(origin.getText().contains("Luton")) {
				origin.click();
			}
		}
		
		
	}

}

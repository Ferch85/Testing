package Section05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;

public class L13_HiddenElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsoto\\Desktop\\Resources\\drivers_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtesting.co.uk/hiddenElements.html");
		
		
		// isDislayed regresa true si el elemento esta visible en la pagina
		System.out.println(driver.findElement(By.xpath("//div[@id='main']/div[@class='inner']//p[.='This paragraph should be hidden.']")).isDisplayed());

	}

}

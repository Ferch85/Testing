package Section05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03_SendingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsoto\\Desktop\\Resources\\drivers_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/conactForm.html");
		
		driver.findElement(By.name("first_name")).sendKeys("GomuGomu");
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("GomuGomu");
		
		
		driver.findElement(By.name("last_name")).sendKeys("BaraBara");
		

	}

}

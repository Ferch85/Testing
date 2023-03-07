package Section05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L05_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsoto\\Desktop\\Resources\\drivers_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/buttons.html");
		
		boolean a;
		
		a = driver.findElement(By.cssSelector("button#btn_four")).isEnabled();
		
		System.out.println("El valor es: "+a);
		
		System.out.println(driver.findElement(By.cssSelector("button#btn_three")).isEnabled());
		

	}

}

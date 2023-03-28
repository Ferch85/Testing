package uk.com.automationtesting;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.Homepage;
import pageObjects.ShopHomepage;

public class OrderCompleteTest extends BasePage {

	public OrderCompleteTest() throws IOException {
		super();
	}
	
	@BeforeTest
	public void setup() throws IOException {
		driver = getDriver();
		driver.get(getUrl()); //Method getUrl Belongs to BasePage Class
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
	}
	
	@Test
	public void endToEndTest() throws IOException {
		Homepage home = new Homepage(driver);
		home.getCookie().click();
		home.getTestStoreLink().click();
		
		ShopHomepage shopHome = new ShopHomepage(driver);
		shopHome.getProdOne().click();
	}
	
}
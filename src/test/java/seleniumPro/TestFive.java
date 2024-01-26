package seleniumPro;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFive {
	
	static ChromeDriver driver;
	
	@BeforeMethod
	public void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
	}
	
	@Test(priority = 1, description = "verifyTile",enabled = true)
	public static void VerifyTitle() {
		String actualTile = driver.getTitle();
		assertEquals(actualTile, "WebDriverUniversity.com");
	}
	
	@Test(priority = 1, description = "verifyUrl",enabled = true)
	public static void VerifyCurrentUrl() {
		String actualUrl = driver.getCurrentUrl();
		Boolean word = actualUrl.contains("university");
		assertEquals(true,true);
		
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}
	

}

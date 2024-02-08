package seleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class seleniumThirteen {
	
	
@DataProvider(name = "logindata")
public Object[][] logiData() {
	return new Object [][] {
		{"standard_user","secret_sauce"},
		{"locked_out_user","secret_sauce"},
		{"problem_user","secret_sauce"},
		{"performance_glitch_user","secret_sauce"}
		
	};
	
}
	
	
	
	
@Test(dataProvider = "logindata")
public static void LoginTest(String username,String password) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriverNew\\chromedriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/index.html");
	driver.findElement(By.id("user-name")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("login-button")).click();
	
	
}

}

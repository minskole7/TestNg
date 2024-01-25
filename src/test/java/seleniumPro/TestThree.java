package seleniumPro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestThree {
	
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}
	
	
	@BeforeClass
	public void beoforeClasse() {
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public static void BeforeMethod() {
		System.out.println("Before Method");	
	}

	// Method 1
	@Test(priority = 1)
	public static void TestSeven() {
		System.out.println("Test case seven");
	}
	
	// Method 2
	@Test(priority = 2)
	public static void TestEight() {
		System.out.println("Test case eight");
	}
	
	@AfterMethod
	public static void AfterMethod() {
		System.out.println("After Method");	
	}
	
	@AfterClass
	public void afterClasse() {
		System.out.println("After class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	

}

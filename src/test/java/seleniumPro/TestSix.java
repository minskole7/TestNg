package seleniumPro;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSix {
	
	
	// xml  ---- ??
	// how to create xml file ??
	// Suite ----> test ----> classes ----> class -----> method
	
	
	@BeforeSuite
	public static void beforeSuite() {
		System.out.println("before suite is executed");
	}
	
	@AfterSuite
	public static void afterSuite() {
		System.out.println("after suite executed");
	}
	
	@BeforeTest
	public static void beforeTest() {
		System.out.println("before test executed");
	}
	
	@AfterTest
	public static void afterTest() {
		System.out.println("after test executed");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class executed");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class executed");
	}
	
	@BeforeMethod
	public static void beforeMethod() {
		System.out.println("before method exectuted");
	}
	
	@AfterMethod
	public static void afterMethod() {
		System.out.println("after method exectuted");
	}
	

	@Test
	public static void TestOne() {
		System.out.println("Test case one pass");
	}
	
	@Test
	public static void TestTwo() {
		System.out.println("Test case two pass");
	}
	
	
	
}

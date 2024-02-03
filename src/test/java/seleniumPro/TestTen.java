package seleniumPro;

import org.testng.annotations.Test;

public class TestTen {

	
	@Test(groups = {"regression"})
	public static void TestNine() {
		System.out.println("Test case Nine");
	}
	
	@Test(groups = "login")
	public static void TestCTen() {
		System.out.println("Test case Ten");
	}
	
	
	@Test(groups = {"login","regression"})
	public static void TestCEleven() {
		System.out.println("Test case Eleven");
	}
	
	
	
}

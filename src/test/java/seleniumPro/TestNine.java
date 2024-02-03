package seleniumPro;

import org.testng.annotations.Test;

public class TestNine {
	
	
	
	@Test(groups = "login")
	public static void Testone() {
		System.out.println("Test case one");
	}
	
	@Test
	public static void Testtwo() {
		System.out.println("Test case two");
	}
	
	@Test(groups = "login")
	public static void Testthree() {
		System.out.println("Test case three");
	}
	
	@Test
	public static void TestFour() {
		System.out.println("Test case four");
	}
	
	@Test(groups = "login")
	public static void TestFive() {
		System.out.println("Test case five");
	}
	
	

}

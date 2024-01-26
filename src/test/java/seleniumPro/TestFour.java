package seleniumPro;

import org.testng.annotations.Test;

public class TestFour {
	// By default priority is same and zero

	@Test(priority = 1)
	public static void TestOne() {
		System.out.println("Test case one");
	}
	@Test(priority = 2)
	public static void TestTwo() {
		System.out.println("Test case two");
	}
	@Test(priority = 0)
	public static void TestThree() {
		System.out.println("Test case three");
	}
	
	@Test(priority = -1)
	public static void TestFour() {
		System.out.println("Test case four");
	}

}

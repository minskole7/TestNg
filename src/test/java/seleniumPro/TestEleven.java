package seleniumPro;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestEleven {
	
	@Parameters({"firstName","lastName","email","message"})
	@Test
	public static void TestCase11(String fn , String ln , String email, String msg) {
		System.out.println("Test case 11 pass");
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(email);
		System.out.println(msg);
	}
}

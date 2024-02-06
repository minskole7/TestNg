package seleniumPro;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestTwleve {
	@Test
	public void testHardAssertion() {
		String first_Name = "chinmay";
		Assert.assertEquals(first_Name, "Chinmay");
		System.out.println("I am learning hard assertion");
	}

	
	@Test
	public void testSoftAssertion() {
		SoftAssert softassert = new SoftAssert();
		String first_Name = "chinmay";
		softassert.assertEquals(first_Name, "Chinmay");
		System.out.println("I am learning softassertion");
		softassert.assertEquals(true, true);
		softassert.assertAll();
	}
}

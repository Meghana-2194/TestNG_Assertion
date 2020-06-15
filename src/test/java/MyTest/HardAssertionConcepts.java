package MyTest;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssertionConcepts {

	@Test
	public void test1() {
		System.out.println("Open URL");
		Assert.assertEquals(true, true); // hard assertion : Use whenever
											// required

		System.out.println("User_name");
		System.out.println("password");
		System.out.println("Login");

		Assert.assertEquals(false, true); // hard assertion : User whenever
											// required

		System.out.println("Validate Home page");

	}
}

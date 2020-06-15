package MyTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertConcepts {
	
	
	@Test
	public void test1() {
		
		SoftAssert softassert1 = new SoftAssert();
		System.out.println("Open URL");
		softassert1.assertEquals(true, true); // soft assertion : User whenever required 
		
		System.out.println("User_name");
		System.out.println("password");
		System.out.println("Login");
		
		softassert1.assertEquals(true, true); // soft  assertion : User whenever required 
		
		System.out.println("Validate Home page");
		
		softassert1.assertEquals(false, true , "Home Page title is missing"); // soft assertion
		
		System.out.println("Go to Deal");
		System.out.println("Create a deal");
		softassert1.assertEquals(false, true , "Not able to create a Deal"); // soft assertion
		
		System.out.println("Go to Contacts");
		System.out.println("Create a contacts");
		softassert1.assertEquals(false, true , "Not able to create a Contacts"); // soft assertion
		
		softassert1.assertAll(); // mandatory , it will give us the failed testCases in details
		
	}
	
	@Test
	public void test2(){
		SoftAssert softassert2 = new SoftAssert(); // best approach
		
		System.out.println("Logout") ;
		softassert2.assertEquals(true, false,"Logging out falied");
		softassert2.assertAll();
	}
	
	@Test
	public void tearDown(){
		
	}
}


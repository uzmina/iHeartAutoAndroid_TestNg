package Tests;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.*;

import Utilities.TestRoot;

/** 
 * Test sign in methods
 * @author ChitraSelvaraj
 *
 */
public class TestSignIn extends TestRoot{
	
	@BeforeTest
	public void before(){
		if(!setup()){
			AssertJUnit.fail("Could not load driver");
		}
	}
	@AfterTest
	public void after(){
		quit();
	}
	
	// Sign in from gate
	@Test
	public void testSignInFromGate(){
		if(Behavior.Gate.clickLogIn(driver)){
			Behavior.Account.signIn(driver);
			AssertJUnit.assertTrue(Behavior.AccountSettings.checkLoggedIn(driver, Elements.AccountSettings.iHeartAccountEmail));
		}
		else{
			AssertJUnit.fail("Could not click login");
		}
	}
	

	
	
}

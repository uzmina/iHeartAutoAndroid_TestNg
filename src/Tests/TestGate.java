package Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
//import org.testng.Assert;
import org.testng.annotations.*;

import Utilities.TestRoot;

public class TestGate extends TestRoot{
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
	
	@Test
	public void testSignUpButton(){
		AssertJUnit.assertTrue(Behavior.Gate.clickSignUp(driver));
	
	}
	
	
	@Test
	public void testLogInButton(){
		AssertJUnit.assertTrue(Behavior.Gate.clickLogIn(driver));
	}
	
	@Test
	public void testMaybeLaterButton(){
		AssertJUnit.assertTrue(Behavior.Gate.clickMaybeLater(driver));
	}
	
}

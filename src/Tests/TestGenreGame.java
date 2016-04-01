package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
//import Behavior.GenreGame;
import Utilities.TestRoot;

public class TestGenreGame extends TestRoot{
	
	@BeforeMethod
	public void before(){
		if(!setup()){
			AssertJUnit.fail("Could not load driver");
		}
	}
	@AfterMethod
	public void after(){
		quit();
	}
	
	// Test anonymous user logging in and using app
	@Test
	
	
	
	public void testSingleGenreSelection(){
		// Click maybe later
		 Behavior.AnonymousUser.clickMayBeLater(driver);
		// Select a single genre, assert we can click done
		AssertJUnit.assertTrue("Could not select genres", Behavior.GenreGame.selectGenre(driver));
		AssertJUnit.assertTrue("Could not click done after selecting genres", Behavior.GenreGame.clickDone(driver));
	}
	
	
	
}

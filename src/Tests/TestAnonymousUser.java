package Tests;
import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;


//import Behavior.AnonymousUser;
//import Behavior.Disclaimer;
import Utilities.TestRoot;
//import static org.testng.AssertJUnit.*;

public class TestAnonymousUser extends TestRoot{
	
	@Before
	public void before(){
		if(!setup()){
			AssertJUnit.fail("Could not load driver");
		}
	}
	
	@Test
	public void AnonymousUserWorkflow(){
	
	//check location setup 
		
		//Behavior.LocationSetup.clickSkipButton(driver);
		//Assert.assertTrue("location is ON'", Behavior.Gate.clickMaybeLater(driver));
		
		
		// Click maybe later
			Behavior.AnonymousUser.clickMayBeLater(driver);
		// Select a single genre, assert we can click done
			Behavior.GenreGame.selectGenre(driver);
			//Assert.assertTrue("Selected genre", Behavior.Disclaimer.acceptDisclaimer(driver));
			//Assert.assertTrue("Could not click done after selecting genres", Behavior.GenreGame.clickDone(driver));
		//Accept disclaimer
			
			Behavior.Disclaimer.acceptDisclaimer(driver);
			//Assert.assertTrue("Disclaimer did not show'", Behavior.AnonymousUser.getDefaultlocation(driver));
		
	        //Behavior.AnonymousUser.getDefaultlocation(driver);
	        Behavior.AnonymousUser.getSongTitle(driver);
	        Behavior.AnonymousUser.getStationName(driver);
	        Behavior.AnonymousUser.getArtistName(driver);
	        
	        Behavior.AnonymousUser.createStation(driver);
	        Behavior.AnonymousUser.favoriteStation(driver);
	        Behavior.AnonymousUser.thumbStation(driver);
	      
	        
	        Behavior.AnonymousUser.recentStations(driver);
			Behavior.AnonymousUser.FavoriteAStation(driver);
			Behavior.AnonymousUser.ForYouStations(driver);
			
			Behavior.ArtistRadio.searchPlayArtistRadio(driver);
			Behavior.Podcasts.searchPlayPodcast(driver);
			
			Behavior.LiveRadio.playStationNearYou(driver);
			Behavior.LiveRadio.playStationbylocation(driver);
			Behavior.LiveRadio.playStationByGenre(driver);

			Behavior.AnonymousUser.scanStation(driver); 
	}
	@AfterMethod
	public void after(){
		quit();
	}
}

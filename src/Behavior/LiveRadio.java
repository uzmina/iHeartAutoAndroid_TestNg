package Behavior;
//import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;

public class LiveRadio extends Page{
	public static Boolean playStationbylocation(AndroidDriver<MobileElement> d){
		//click menu button
		MobileElement menuButton = waitForVisible(d, find(Elements.Page.menuButton), 10);
		menuButton.click();
		MobileElement returnButton = waitForVisible(d, find(Elements.Page.menuBackButton), 10);
		if(returnButton != null){
			
			//int count = 0;
			while(returnButton.isDisplayed()){
				returnButton.click();
				//count++;
				
			}
			locationBasedRadio(d);
		}
		  else
		  {
			  locationBasedRadio(d);
		  }
		return null;
		
	}
	
	public static  boolean locationBasedRadio(AndroidDriver<MobileElement> d){
		//scroll to next page
				MobileElement nextButton = waitForVisible(d, find(Elements.Page.nextScrollId), 10);
				nextButton.click();
				
				//tap live radio card
				MobileElement liveRadio = waitForVisible(d, find(Elements.LiveRadio.liveRadioCard), 15);
				liveRadio.click();
				
				//tap location card
				MobileElement byLocation = waitForVisible(d, find(Elements.LiveRadio.byLocationCard), 10);
				byLocation.click();
				
				//tap location base search card based on alphabetical order
				MobileElement byloc1 = waitForVisible(d, find(Elements.LiveRadio.location1), 10);
				byloc1.click();
				
				//tap to select a state
				MobileElement byState = waitForVisible(d, find(Elements.LiveRadio.state1row2), 10);
				String st = byState.getText();
				System.out.println("print state name before if condition  " + st);
				byState.click();
				
				//tap to select a city
				MobileElement byCity = waitForVisible(d, find(Elements.LiveRadio.row1City1), 10);
				String city = byCity.getText();
				System.out.println("print city before if condition  " + city);
				byCity.click();
				
				//tap to select a station
				MobileElement station1 = waitForVisible(d, find(Elements.LiveRadio.station1), 10);
				MobileElement station1text = waitForVisible(d, find(Elements.LiveRadio.station1), 10);
				String s1 = station1text.getText();
				System.out.println("Station displayed on first position under selected city - " +s1);
				station1.click();
				
				//capture bread crumb should be same as city selected
				MobileElement breadCrumb = waitForVisible(d, find(Elements.Playback.breadCrumbText), 10);
				String c2 = breadCrumb.getText();
				System.out.println("print before if condition  " + c2);
				if(city==c2){
					System.out.println("player view is rendered playing the station selected from city  " + c2);
					return true;
				}
				
				//to verify station on player is same as tapped from city search results
				MobileElement stationName = waitForVisible(d, find(Elements.Playback.stationNameText), 10);
				String s2 = stationName.getText();
				System.out.println("station on player  " + s2);
				//MobileElement returnToPlayer = waitForVisible(d, find(Elements.Page.returnToPlayerButton), 10);
				//returnToPlayer.click();
				if(s1==s2){
					System.out.println("player render playing the selected station  " + s2);
					return true;
				}
				return false;
				
				
	}
				
				
	
	
	//to test user can play station from station near you option
	public static boolean playStationNearYou(AndroidDriver<MobileElement> d){
		//click menu button
		MobileElement menuButton = waitForVisible(d, find(Elements.Page.menuButton), 10);
		menuButton.click();
		MobileElement returnButton = waitForVisible(d, find(Elements.Page.menuBackButton), 10);
		if(returnButton != null){
			
			
				returnButton.click();
			    stationNearYou(d);
		     }
			else
			{
				
				stationNearYou(d);
			}
		return false;
		
	}
	//function for station near you
	public static boolean stationNearYou(AndroidDriver<MobileElement> d){
		//scroll to next page
		MobileElement nextButton = waitForVisible(d, find(Elements.Page.nextScrollId), 10);
		nextButton.click();
		
		//tap live radio card
		MobileElement liveRadio = waitForVisible(d, find(Elements.LiveRadio.liveRadioCard), 15);
		liveRadio.click();
		
		//tap location card
		MobileElement nearYou = waitForVisible(d, find(Elements.LiveRadio.nearYouCard), 15);
		nearYou.click();
		
		//tap to select a station
		MobileElement station1 = waitForVisible(d, find(Elements.LiveRadio.station1), 10);
		MobileElement station1text = waitForVisible(d, find(Elements.LiveRadio.station1text), 10);
		String s1 = station1text.getText();
		System.out.println("Station displayed on first position under near you - " +s1);
		station1.click();
		
		MobileElement breadCrumb = waitForVisible(d, find(Elements.Playback.breadCrumbText), 10);
		String breadCrumbt = breadCrumb.getText();
		System.out.println("bread crumb displays - " +breadCrumbt);
		
		//MobileElement returnToPlayer = waitForVisible(d, find(Elements.Page.returnToPlayerButton), 10);
		//returnToPlayer.click();
		
		MobileElement stationName = waitForVisible(d, find(Elements.Playback.stationNameText), 10);
		String s2 = stationName.getText();
		
		//compare selected station plays and metadata displays correctly
		//System.out.println("station on player  " + s2);
		if(s1==s2){
			System.out.println("player view is rendered playing the selected station  " + s2);
			return true;
		}
		
		return false;
		
		
	}
	
	
	//station searched by genre
	public static boolean playStationByGenre(AndroidDriver<MobileElement> d){
				//click menu button
				MobileElement menuButton = waitForVisible(d, find(Elements.Page.menuButton), 15);
				menuButton.click();
		
				if(waitForVisible(d, find(Elements.LiveRadio.backButton), 5) != null){
					MobileElement returnButton = waitForVisible(d, find(Elements.LiveRadio.backButton), 10);
					int count = 0;
					do {
						returnButton.click();
						count++;
					}while(count <5 && returnButton.isDisplayed());
					stationByGenre(d);
				     }
					else
					{
						
						stationByGenre(d);
					}
				return false;
				
	}
	
	public static boolean stationByGenre(AndroidDriver<MobileElement> d){
		
		//scroll to next page
		MobileElement nextButton = waitForVisible(d, find(Elements.Page.nextScrollId), 10);
		nextButton.click();
		
		//tap live radio card
		MobileElement liveRadio = waitForVisible(d, find(Elements.LiveRadio.liveRadioCard), 15);
		liveRadio.click();
		
		//tap location card
		MobileElement genre = waitForVisible(d, find(Elements.LiveRadio.byGenreCard), 10);
		genre.click();
		
		//tap to select a genre
		MobileElement genreCard = waitForVisible(d, find(Elements.LiveRadio.row1genre3), 10);
		MobileElement genreText = waitForVisible(d, find(Elements.LiveRadio.hiphop), 10);
		String gText1 = genreText.getText();
		System.out.println("Genre displayed - " +gText1);
		genreCard.click();
		
		//tap to select a station
		MobileElement genreStation = waitForVisible(d, find(Elements.LiveRadio.station3), 10);
		MobileElement stText1 = waitForVisible(d, find(Elements.LiveRadio.station3text), 10);
		String sText1 = stText1.getText();
		System.out.println("station selected to play - " +sText1);
		genreStation.click();
		
		MobileElement breadCrumb = waitForVisible(d, find(Elements.Playback.breadCrumbText), 10);
		String breadCrumbt = breadCrumb.getText();
		System.out.println("bread crumb displays the selected station - " + breadCrumbt);
		
		if(gText1==breadCrumbt){
			System.out.println("bread crumb displays the selected station - " + breadCrumbt);
			return true;
		}
		
		MobileElement stationName = waitForVisible(d, find(Elements.Playback.stationNameText), 10);
		String sText2 = stationName.getText();
		
		if(sText1==sText2){
			System.out.println("player view is rendered playing the selected station  " + sText2);
			return true;
		}
		
		return false;
	}
	
}

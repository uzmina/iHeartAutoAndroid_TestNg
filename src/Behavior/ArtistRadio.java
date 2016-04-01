package Behavior;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ArtistRadio extends Page{

	public static String searchPlayArtistRadio(AndroidDriver<MobileElement> d){
		
		//tap on menu button
		MobileElement menuButton = waitForVisible(d, find(Elements.Page.menuButton), 10);
		menuButton.click();
		MobileElement returnButton = waitForVisible(d, find(Elements.Page.menuBackButton), 10);
		if(returnButton != null){
			
			//int count = 0;
			while(returnButton.isDisplayed()){
				returnButton.click();
				//count++;
				
			}
			playArtistRadio(d);
		}
		  else
		  {
			  playArtistRadio(d);
		  }
		return null;
	}
	
		public static String playArtistRadio(AndroidDriver<MobileElement> d){
		//scroll to next page
		MobileElement nextButton = waitForVisible(d, find(Elements.Page.nextScrollId), 10);
		nextButton.click();
		
		//Tap on Artist radio card
		MobileElement ArtistCard = waitForVisible(d, find(Elements.ArtistRadio.artistRadioCard), 10);
		ArtistCard.click();
		
		//tap on artist genre card
		MobileElement ArtistGenreCard = waitForVisible(d, find(Elements.ArtistRadio.artistGenreCard0_1), 10);
		ArtistGenreCard.click();
		
		//tap on artist based custom station
		MobileElement artistStationCard = waitForVisible(d, find(Elements.ArtistRadio.artistGenreRadio2_0), 10);
		artistStationCard.click();
		
		MobileElement signPopupText = waitForVisible(d, find(Elements.AnonymousUser.signupTextDesc),5);
		System.out.println("sign up displayed when anonymous user plays custom station   " +signPopupText.getText());
		
		MobileElement signPopupButton = waitForVisible(d, find(Elements.AnonymousUser.cancelBtn),5);
		signPopupButton.click();
		
		MobileElement cancelMenuButton = waitForVisible(d, find(Elements.Page.returnToPlayerButton),5);
		cancelMenuButton.click();
		
		return Elements.Page.returnToPlayerButton;
		}
	

}

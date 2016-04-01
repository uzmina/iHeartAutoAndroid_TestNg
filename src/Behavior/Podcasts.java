package Behavior;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Podcasts extends Page {

public static String searchPlayPodcast(AndroidDriver<MobileElement> d){
		
		//tap on menu button
		MobileElement menuButton = waitForVisible(d, find(Elements.Page.menuButton), 10);
		menuButton.click();
		
		//scroll to next page
		MobileElement nextButton = waitForVisible(d, find(Elements.Page.nextScrollId), 10);
		nextButton.click();
		
		//Tap on podcast radio card
		MobileElement podcastCard = waitForVisible(d, find(Elements.Podcasts.podcastsCard), 10);
		podcastCard.click();
		
		//tap on podcast Topic Card
		MobileElement podcastTopicCard = waitForVisible(d, find(Elements.Podcasts.podcastTopicCard0_0), 10);
		podcastTopicCard.click();
		
		//tap on topic based podcast station
		MobileElement podcastStationCard = waitForVisible(d, find(Elements.Podcasts.podcastRadio1_0), 10);
		podcastStationCard.click();
		
		MobileElement signPopupText = waitForVisible(d, find(Elements.AnonymousUser.signupTextDesc),5);
		System.out.println("sign up displayed when anonymous user plays podcasts station   " +signPopupText.getText());
		
		MobileElement signPopupButton = waitForVisible(d, find(Elements.AnonymousUser.cancelBtn),5);
		signPopupButton.click();
		
		MobileElement cancelMenuButton = waitForVisible(d, find(Elements.Page.returnToPlayerButton),5);
		cancelMenuButton.click();
		
		return Elements.Page.returnToPlayerButton;
		
	}
}

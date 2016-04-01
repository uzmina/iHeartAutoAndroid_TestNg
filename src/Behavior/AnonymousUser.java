package Behavior;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import static org.testng.AssertJUnit.*;

public class AnonymousUser extends Page{
	
	public static String clickMayBeLater(AndroidDriver<MobileElement> d){
		MobileElement mayBeLater= waitForVisible(d, MobileBy.xpath(Elements.AnonymousUser.mayBeLaterBtn), 10);
		mayBeLater.click();
		MobileElement genrePageTitle1 =  waitForVisible(d, find(Elements.GenreGame.genreHeadingText1),10);
		MobileElement genrePageTitle2 =  waitForVisible(d, find(Elements.GenreGame.genreHeadingText2),10);
		if(genrePageTitle1 != null){
			String text1 = genrePageTitle1.getText();
			String text2 = genrePageTitle2.getText();
			
			System.out.println("This is the genre page title - " + text1 + " " + text2);
			return text1 ;
			
			}
		return null;
		}
	
	public static String getDefaultlocation(AndroidDriver<MobileElement> d){
		MobileElement defaultLocation= waitForVisible(d, find(Elements.AnonymousUser.breadCrumbText), 10);
		if(defaultLocation != null){
			System.out.println("This is the default location   " + defaultLocation.getText());
			return defaultLocation.getText();
		}
		return null;
	}
	//get the name of the station playing near you
	public static String getStationName(AndroidDriver<MobileElement> d){
		MobileElement defaultStation = waitForVisible(d, find(Elements.AnonymousUser.stationNameText), 10);
		if(defaultStation != null){
			System.out.println("this is the station near you -  " + defaultStation.getText());
			return defaultStation.getText();
		}
		return null;
	}
	
	
	//get text if song is playing
	public static String getSongTitle(AndroidDriver<MobileElement> d){
		MobileElement songStation = waitForVisible(d, find(Elements.AnonymousUser.songNameText), 15);
		if(songStation != null){
			System.out.println("This song is playing right now   "+ songStation.getText());
			return songStation.getText();
			
		}
		return null;
	}
	//to test artist name is displayed
	public static String getArtistName(AndroidDriver<MobileElement> d){
		MobileElement artistName = waitForVisible(d, find(Elements.AnonymousUser.artistNameText), 15);
		if(artistName != null){
			System.out.println("This is the artist playing right now   " +artistName.getText());
			return artistName.getText();
		}
			else
			{
				MobileElement stationTag = waitForVisible(d, find(Elements.AnonymousUser.stationTaglineText), 15);
				return stationTag.getText();
			}

	}
	//to test tapping thumbs returns signup pop
	public static String thumbStation(AndroidDriver<MobileElement> d){
		
		MobileElement thumbs = waitForVisible(d, find(Elements.AnonymousUser.thumbsButton), 10);
		if(thumbs != null){
			thumbs.click();
			
			MobileElement signPopupText = waitForVisible(d, find(Elements.AnonymousUser.signupTextDesc),5);
			System.out.println("sign up displayed when anonymous user tries to thumb a  station   " + signPopupText.getText());
			
			MobileElement signPopupButton = waitForVisible(d, find(Elements.AnonymousUser.cancelBtn),5);
			signPopupButton.click();
			
			return Elements.AnonymousUser.breadCrumbText;
		}
		return null;
	
	}
	//to validate tapping create station button prompts user to log in
	public static String createStation(AndroidDriver<MobileElement> d){
		
		MobileElement thumbs = waitForVisible(d, find(Elements.AnonymousUser.createStationButton), 10);
		if(thumbs != null){
			thumbs.click();
			
			MobileElement signPopupText = waitForVisible(d, find(Elements.AnonymousUser.signupTextDesc),5);
			System.out.println("sign up displayed when anonymous user tries to create a  station   " +signPopupText.getText());
			
			MobileElement signPopupButton = waitForVisible(d, find(Elements.AnonymousUser.cancelBtn),5);
			signPopupButton.click();
			
			return Elements.AnonymousUser.breadCrumbText;
		}
		return null;
	
	}
//To validate tapping favorites button prompts user to log in
	public static String favoriteStation(AndroidDriver<MobileElement> d){
	
	MobileElement thumbs = waitForVisible(d, find(Elements.AnonymousUser.favoriteButton), 10);
	if(thumbs != null){
		thumbs.click();
		
		MobileElement signPopupText = waitForVisible(d, find(Elements.AnonymousUser.signupTextDesc),5);
		System.out.println("sign up displayed when anonymous user tries to favorite  a  station   " +signPopupText.getText());
		
		MobileElement signPopupButton = waitForVisible(d, find(Elements.AnonymousUser.cancelBtn),5);
		signPopupButton.click();
		
		return Elements.AnonymousUser.breadCrumbText;
	}
	return null;

	}
	//to test scan functionality
	public static void scanStation(AndroidDriver<MobileElement> d){
		MobileElement scan = waitForVisible(d, find(Elements.AnonymousUser.scanButton), 10);
		
		if(scan != null){
			MobileElement stationName1 = waitForVisible(d, find(Elements.AnonymousUser.stationNameText),5);
			System.out.println("station before scanning   " +stationName1.getText());
			
			scan.click();
			MobileElement stationName2 = waitForVisible(d, find(Elements.AnonymousUser.stationNameText),5);
			//System.out.println("station after scanning   " +stationName2.getText());

			//MobileElement stopButton = waitForVisible(d, MobileBy.xpath(Elements.AnonymousUser.playPauseButton),5);
			//stopButton.click();
			if(stationName1 != stationName2){
				System.out.println("station after scanning   " +stationName2.getText());
				return;
			}
			
				
		}
		
		
	
	}
//To test For you station shows recommended stations
	public static String ForYouStations(AndroidDriver<MobileElement> d){
		
		MobileElement menuButton = waitForVisible(d, find(Elements.Page.menuButton), 10);
		menuButton.click();
		MobileElement forYouCard = waitForVisible(d, find(Elements.Page.forYouCard), 10);
		forYouCard.click();
		
		MobileElement forYouStation1 = waitForVisible(d, find(Elements.Page.forYouStation1), 10);
		String station1 = forYouStation1.getText();
		System.out.println("For you shows recommended station for top 40 - " +station1);
		
		MobileElement forYouStation2 = waitForVisible(d, find(Elements.Page.forYouStation2), 10);
		String station2 = forYouStation2.getText();
		System.out.println("For you shows recommended station for top 40 - " +station2);
		forYouStation2.click();
		if(Elements.AnonymousUser.signupTextDesc != null){
			MobileElement signPopupText = waitForVisible(d, find(Elements.AnonymousUser.signupTextDesc),5);
			System.out.println("sign up displayed when anonymous user view Favorites station  - " +signPopupText.getText());
			MobileElement signPopupButton = waitForVisible(d, find(Elements.AnonymousUser.cancelBtn),5);
			signPopupButton.click();
			
		}
			else{
			MobileElement breadcrumb = waitForVisible(d, find(Elements.AnonymousUser.breadCrumbText), 10);
			System.out.println("Station played from recent station and player rendered" + breadcrumb);
			if(Elements.AnonymousUser.stationNameText != null){
				MobileElement station3 = waitForVisible(d, find(Elements.AnonymousUser.stationNameText), 10);
				System.out.println("this is the station played from For you -  " + station3.getText());
				
				return station3.getText();
				
			}
				
			}
		
		
		return null;
		
	}
	
//To test anonymous user is prompted to sign up when Favorites card is tapped	
	public static String FavoriteAStation(AndroidDriver<MobileElement> d){
		MobileElement menuButton = waitForVisible(d, find(Elements.Page.menuButton), 10);
		menuButton.click();
		MobileElement favoriteCard = waitForVisible(d, find(Elements.Page.favoritesCard), 10);
		favoriteCard.click();
		MobileElement signPopupText = waitForVisible(d, find(Elements.AnonymousUser.signupTextDesc),5);
		System.out.println("sign up displayed when anonymous user view Favorites station   " +signPopupText.getText());
		
		MobileElement signPopupButton = waitForVisible(d, find(Elements.AnonymousUser.cancelBtn),5);
		signPopupButton.click();
		
		MobileElement cancelMenuButton = waitForVisible(d, find(Elements.Page.returnToPlayerButton),5);
		cancelMenuButton.click();
		
		return Elements.Page.returnToPlayerButton;
		
	}
	
	//Check if currently playing station is displayed in recent station
		public static String recentStations(AndroidDriver<MobileElement> d){
			MobileElement defaultStation = waitForVisible(d, find(Elements.AnonymousUser.stationNameText), 10);
			String playingStation = defaultStation.getText();
			MobileElement menuButton = waitForVisible(d, find(Elements.Page.menuButton), 10);
			menuButton.click();
			MobileElement recentStationCard = waitForVisible(d, find(Elements.Page.recentStationsCard), 10);
			recentStationCard.click();
			
			MobileElement recentStation1 = waitForVisible(d, find(Elements.Page.recentStationText), 10);
			String recent1 = recentStation1.getText();
			System.out.println("this station is from recent station page- " + recent1);
			if(playingStation == recent1) {
				return recent1;
			}
			return null;
		}
		
		//To test live radio station can be searched and played from live radio options
		public static String liveStations(AndroidDriver<MobileElement> d){
			
			MobileElement menuButton = waitForVisible(d, find(Elements.Page.menuButton), 10);
			menuButton.click();
			MobileElement forYouCard = waitForVisible(d, find(Elements.Page.forYouCard), 10);
			forYouCard.click();
			
			MobileElement forYouStation1 = waitForVisible(d, find(Elements.Page.forYouStation1), 10);
			String station1 = forYouStation1.getText();
			System.out.println("For you shows recommended station for top 40 - " +station1);
			
			MobileElement forYouStation2 = waitForVisible(d, find(Elements.Page.forYouStation2), 10);
			String station2 = forYouStation2.getText();
			System.out.println("For you shows recommended station for top 40 - " +station2);
			forYouStation2.click();
			if(Elements.AnonymousUser.signupTextDesc != null){
				MobileElement signPopupText = waitForVisible(d, find(Elements.AnonymousUser.signupTextDesc),5);
				System.out.println("sign up displayed when anonymous user view Favorites station  - " +signPopupText.getText());
			}
				else{
				MobileElement breadcrumb = waitForVisible(d, find(Elements.AnonymousUser.breadCrumbText), 10);
				System.out.println("Station played from recent station and player rendered" + breadcrumb);
				if(Elements.AnonymousUser.stationNameText != null){
					MobileElement station3 = waitForVisible(d, find(Elements.AnonymousUser.stationNameText), 10);
					System.out.println("this is the station near you -  " + station3.getText());
					return station3.getText();
					
				}
					
				}
			
			
			return null;
			
		}
}

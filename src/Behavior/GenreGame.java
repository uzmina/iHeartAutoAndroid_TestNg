package Behavior;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GenreGame extends Page {

	public static boolean selectGenre(AndroidDriver<MobileElement> d){
		waitToClick(d, find(Elements.GenreGame.genreGamePage1Item1),5);
		//return isVisible(Elements.GenreGame.GenreSelected) ;
		waitToClick(d, find(Elements.GenreGame.GenreContinueBtn), 3);
		return isVisible(Elements.Disclaimer.disclaimerTitle);
	}
	
	

	public static boolean clickDone(AndroidDriver<MobileElement> d) {
		waitToClick(d, find(Elements.GenreGame.GenreContinueBtn),5);
		return isVisible(Elements.Disclaimer.disclaimerTitle);
	}
	
}
	
	


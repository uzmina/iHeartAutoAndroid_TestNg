package Behavior;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Playback extends Page {

	public static String getSongTitle(AndroidDriver<MobileElement> d){
		MobileElement songStation = waitForVisible(d, find(Elements.Playback.songTitleId), 15);
		if(songStation != null){
			return songStation.getText();
		}
		return null;
	}
	public static String getSongInfo(AndroidDriver<MobileElement> d){
		MobileElement artistStationInfo = waitForVisible(d, find(Elements.Playback.artistId), 15);
		if(artistStationInfo != null){
			return artistStationInfo.getText();
		}
		return null;
	}
	public static boolean thumbDown(AndroidDriver<MobileElement> d){
		MobileElement e = waitForVisible(d, find(Elements.Playback.thumbDownId), 15);
		boolean clicked = Page.testClick(d, e);
		if(clicked && waitForVisible(d, find(Elements.Playback.thumbedDownGotItId), 3) != null){
			click(d, find(Elements.Playback.thumbedDownGotItId));
		}
		return clicked;
	}
	public static boolean thumbUp(AndroidDriver<MobileElement> d){
		MobileElement e = waitForVisible(d, find(Elements.Playback.thumbUpId), 15);
		return Page.testClick(d, e);
	}
	public static boolean playPause(AndroidDriver<MobileElement> d){
		MobileElement e = waitForVisible(d, find(Elements.Playback.playPauseBfferId), 15);
		return Page.testClick(d, e);
	}
	public static boolean skip(AndroidDriver<MobileElement> d){
		MobileElement e = waitForVisible(d, find(Elements.Playback.skipSongId), 15);
		return Page.testClick(d, e);
	}
	/*work flow different for checking favorites station so commenting this section
	public static boolean favorite(AndroidDriver<MobileElement> d){
		int y = waitForVisible(d, find(Elements.Playback.backButtonX), 5).getLocation().getY();
		MobileElement e = waitForVisible(d, find(Elements.Playback.favoriteButtonId), 15);
		boolean clicked = Page.testClick(d, e);
		
		// Dismiss the share popup
		sleep(1750); // Sleep long enough for the animation to complete
		try{
			d.tap(1, getAppWidth(d) / 2, y, 150); // In case of a popup
		}
		catch(Exception exc){} // Don't know why this is needed, sometimes throws exception for no good reason
		
		return clicked;
	} */
	
	public static void clickGotIt(AndroidDriver<MobileElement> d){
		waitToClick(d, find(Elements.Playback.thumbedDownGotItId), 10);
	}
	
	public static int getElapsedTime(AndroidDriver<MobileElement> d){
		return getTime(d, Elements.Playback.timeElapsedId);
	}
	public static int getTotalTime(AndroidDriver<MobileElement> d){
		return getTime(d, Elements.Playback.timeTotalId);
	}
	
	private static int getTime(AndroidDriver<MobileElement> d, String element){
		MobileElement time = waitForVisible(d, find(element), 15);
		int elapsedTime = -1;
		if(time != null){
			String timeLeft = time.getText();
			// Concat to just the first part of the time
			if(timeLeft.contains("|")){
				timeLeft = timeLeft.substring(0, timeLeft.indexOf("|")).trim();
			}
			if(timeLeft.contains(":")){
				// Split out minutes
				String minutes = timeLeft.substring(0, timeLeft.indexOf(":")).trim();
				String seconds = timeLeft.substring(timeLeft.indexOf(":") + 1, timeLeft.length()).trim();
				elapsedTime = (Integer.parseInt(minutes) * 60) + Integer.parseInt(seconds);
			}
			else{
				elapsedTime = Integer.parseInt(timeLeft);
			}
		}
		
		return elapsedTime;
	}
	
	/*//Don't have artist bio, lyrics, share, tune , skip suggestion etc in auto so commenting it
	public static void clickBack(AndroidDriver<MobileElement> d){
		waitToClick(d, find(Elements.Playback.backButtonX), 15);
	}
	
	
	public static void dismissSkipPopup(AndroidDriver<MobileElement> d){
		waitToClick(driver, find(Elements.Playback.skippedNoThanksId), 10);
	}
	
	public static void selectSkipSuggestion(AndroidDriver<MobileElement> d, int i){
		waitForVisible(d, find(Elements.Playback.skippedListX), 10);
		System.out.println("Selecting new station: " + d.findElement(find(Elements.Playback.getSkippedListItemTitleX(i))).getText() + "...");
		click(driver, find(Elements.Playback.getSkippedListItemX(i)));
	}

	public static void clickGotIt(AndroidDriver<MobileElement> d){
		waitToClick(d, find(Elements.Playback.thumbedDownGotItId), 10);
	}
	
	public static void clickAdditionalOptions(AndroidDriver<MobileElement> d){
		MobileElement e = waitForVisible(d, find(Elements.Playback.infoButtonX), 15);
		// Needs a slightly quicker tap than most items
		int attempt = 0;
		while(attempt < 10 && waitForVisible(d, find(Elements.Playback.stationInfoArtistBioX), 1) == null){
			sleep(50);
			quickTap(d, e);
			attempt++;
		}
	}
	public static void clickArtistBio(AndroidDriver<MobileElement> d){
		waitToClick(d, find(Elements.Playback.stationInfoArtistBioX), 15);
	}
	public static boolean getToArtistBio(AndroidDriver<MobileElement> d){
		if(waitForVisible(d, find(Elements.Playback.albumnArtworkId), 15) != null){
			clickAdditionalOptions(d);
			clickArtistBio(d);
			return waitForVisible(d, find(Elements.Playback.artistBioNameId), 10) != null;
		}
		else{
			System.err.println("Cannot get to artist bio unless we're on the playback screen!");
			return false;
		}
	}
	
	public static void clickBuyOnGooglePlay(AndroidDriver<MobileElement> d){
		waitToClick(d, find(Elements.Playback.stationInfoBuyOnGooglePlayX), 15);
	}
	
	public static boolean clickTune(AndroidDriver<MobileElement> d){
		waitToClick(d, find(Elements.Playback.stationInfoTuneX), 15);
		return waitForVisible(d, find(Elements.Playback.tuneStationTopHitsId), 5) != null;
	}
	
	public static boolean clickShare(AndroidDriver<MobileElement> d){
		MobileElement e = waitForVisible(d, find(Elements.Playback.shareButtonX), 15);
		int attempt = 0;
		while(attempt < 10 && waitForVisible(d, find(Elements.Playback.alertHeadingId), 0) == null){
			sleep(50);
			quickTap(d, e);
			attempt++;
		}
		return waitForVisible(d, find(Elements.Page.alertHeadingId), 10) != null;
	}
	*/
	/**
	 * Clicks the center of the seek bar, seeking to the middle point
	 * @param d
	 */
	public static void clickSeekBar(AndroidDriver<MobileElement> d){
		waitToClick(d, find(Elements.Playback.podcastSeekBar), 10);
	}
	
	public static void seekTo(AndroidDriver<MobileElement> d, int percentageToSeek){
		if(percentageToSeek > 100 || percentageToSeek < 0){
			System.err.println("Bad percentage value, must be between 0 and 100");
		}
		MobileElement scrollBar = waitForVisible(d, find(Elements.Playback.podcastSeekBar), 10);
		int seekWidth = scrollBar.getSize().getWidth();
		double seekDecimal = ((double) percentageToSeek) / 100;
		int click = (int) (seekWidth * seekDecimal);
		// Adjust for the position on the screen
		click += scrollBar.getLocation().getX();
		d.tap(1, click, scrollBar.getLocation().getY(), 150);
		// Bar is now in close area, scroll to the position
		// Grab current scrub time
		int elapsed = getElapsedTime(d);
		int total = getTotalTime(d);
		int target = (int) (total * seekDecimal);
		if(!isAbout(elapsed, target, 15)){
			int counter = 0;
			boolean triedSomething = false;
			while(elapsed < target && counter < 50){
				triedSomething = true;
				click += 2;
				counter++;
				d.tap(1, click, scrollBar.getLocation().getY(), 150);
				elapsed = getElapsedTime(d);
			}
			while(!triedSomething && counter< 50 && elapsed > target){
				triedSomething = true;
				click -= 2;
				counter++;
				d.tap(1, click, scrollBar.getLocation().getY(), 150);
				elapsed = getElapsedTime(d);
			}
		}
	}
}

//package Tests;
//
//import org.junit.*;
//
//import Utilities.TestRoot;
//import io.appium.java_client.MobileElement;
//
//public class TestPlaybackControls extends TestRoot {
//	@Before
//	public void before(){
//		if(!setup()){
//			Assert.fail("Could not load driver");
//		}
//	}
//	@After
//	public void after(){
//		quit();
//	}
//	
//	@Test
//	/**
//	 * Tests that pausing and playing music really does pause and play music
//	 * Special debug points will be noted, because this is a timed test
//	 * Beware staying at a breakpoint so long that the song ends!
//	 */
//	public void testPlayPauseArtistRadio(){
//		// Log in from the gate
//		Behavior.Page.logInFromBoot(driver);
//		// Search for an artist, get first result and enter playback
//		Behavior.Search.searchFor(driver, "The Killers");
//		Behavior.Search.selectFirstResult(driver);
//		Assert.assertTrue("Did not enter playback", waitForVisible(driver, find(Elements.Playback.albumnArtworkId), 15) != null);
//		// Sleep 3.5 seconds to allow some playback, more than one minute to pass
//		sleep(3500);
//		// No breakpoints between here...
//		int currentTime = Behavior.Playback.getElapsedTime(driver);
//		Assert.assertTrue("Music was not playing", currentTime > 2);
//		// ... and here
//		
//		//Pause
//		Behavior.Playback.playPause(driver);
//		int pausedTime = Behavior.Playback.getElapsedTime(driver);
//		
//		// Sleep 2 seconds to make sure it really did pause
//		sleep(2000);
//		currentTime = Behavior.Playback.getElapsedTime(driver);
//		Assert.assertTrue("Didn't pause!", isAbout(pausedTime, currentTime));
//		Behavior.Playback.playPause(driver);
//		// Careful with breakpoints after this point, you don't want the song to end!
//		
//		// Music is playing again sleep 2.5 seconds to ensure
//		sleep(2500);
//		currentTime = Behavior.Playback.getElapsedTime(driver);
//		// We should be ahead by about 3 seconds after we paused
//		Assert.assertTrue("Could not play music after pausing", pausedTime < currentTime);
//	}
//	
//	// Skip 6 songs and play one of the suggested stations
//	@Test
//	public void testSkipAndPlaySuggestions(){
//		// Sign up and create a new account, we need a fresh one for skips
//		Behavior.Gate.clickSignUp(driver);
//		Behavior.Account.createThrowawayAccount(driver);
//		Behavior.GenreGame.selectGenreAndClickDone(driver, 1);
//		// Search for an artist 
//		Behavior.Search.searchFor(driver, "Justin Beiber"); // Oh god, skip it all!
//		Behavior.Search.selectFirstResult(driver);
//		// Grab this station for later use
//		MobileElement ele = waitForVisible(driver, find(Elements.Playback.stationTitleX), 10);
//		String stationTitle = "";
//		if(ele != null){
//			stationTitle = ele.getText();
//		}
//		// Skip 6+ songs
//		for(int i = 0; i < 7; i++){
//			sleep(2000);
//			Behavior.Playback.skip(driver);
//		}
//		// Assert we got a popup
//		Assert.assertTrue("No popup after skipping 6 songs!", waitForVisible(driver, find(Elements.Playback.skippedHeadingX), 10) != null);
//		// Popup displays, select one of the suggestions and hit play
//		Behavior.Playback.selectSkipSuggestion(driver, 1);
//		
//		// Grab the new station title
//		ele = waitForVisible(driver, find(Elements.Playback.stationTitleX), 10);
//		String newStation = "";
//		if(ele != null){
//			newStation = ele.getText();
//		}
//		
//		// Assert We go to the new station
//		Assert.assertTrue("We didn't switch stations!", !stationTitle.equals(newStation));
//	}
//	
//	
//	// Thumb up makes it visible in recent history (same with thumbs down)
//	@Test
//	public void testThumbs(){
//		// Create a new user
//		// Sign up and create a new account, we need a fresh one for skips
//		Behavior.Gate.clickSignUp(driver);
//		Behavior.Account.createThrowawayAccount(driver);
//		Behavior.GenreGame.selectGenreAndClickDone(driver, 1);
//		// Load up a station
//		Behavior.Search.searchFor(driver, "Modest Mouse");
//		Behavior.Search.selectFirstResult(driver);
//		// Skip/Thumbs up or down 2 songs
//		// Thumb up, then skip
//		Behavior.Playback.thumbUp(driver);
//		// Tap outside to dismiss
//		driver.tap(1, 200, 100, 250);
//		
//		Behavior.Playback.skip(driver);
//		sleep(1000);
//		// Thumb down, then skip
//		Behavior.Playback.thumbDown(driver);
//		
//		Behavior.Playback.skip(driver);
//		sleep(1000);
//		// Last song (currently playing) will be first in listening history
//		// Check the listening history
//		Behavior.Playback.clickBack(driver);
//		Behavior.Navbar.clickBack(driver);
//		Assert.assertTrue("Could not open menu", Behavior.Navbar.openMenu(driver));
//		Behavior.Page.clickMenuDrawerListeningHistory(driver);
//		// Reverse order, no preference, thumb down, thumb up
//		waitForVisible(driver, find(Elements.ListeningHistory.getHistoryListSongX(1)), 10);
//		
//		// First item has no preference
//		try{
//			// Item 2 because item 1 is the station heading
//			Assert.assertTrue("Should have been no thumb", waitForVisible(driver, find(Elements.ListeningHistory.getHistoryListSongThumbX(2)), 1) == null);
//		}
//		catch(Exception e){}
//		// Second and third items have a preference 
//		Assert.assertTrue("Should have been a thumb", waitForVisible(driver, find(Elements.ListeningHistory.getHistoryListSongThumbX(3)), 1) != null);
//		Assert.assertTrue("Should have been a thumb", waitForVisible(driver, find(Elements.ListeningHistory.getHistoryListSongThumbX(4)), 1) != null);
//	}
//	
//	// Additional info brings up... additional info (Uses Android back button, we'll see)
//	@Test
//	public void testAdditionalInfo(){
//		Behavior.Gate.logInFromBoot(driver);
//		Behavior.Search.searchForAndSelectFirstResult(driver, "Taylor Swift"); 
//		Assert.assertTrue("Could not load artist bio", Behavior.Playback.getToArtistBio(driver));
//		Behavior.Page.back(driver);
//
//		// Google Play section is present
//		Behavior.Playback.clickAdditionalOptions(driver);
//		Behavior.Playback.clickBuyOnGooglePlay(driver);
//		Assert.assertTrue("Did not leave app", waitForVisible(driver, find(Elements.Playback.stationInfoBuyOnGooglePlayX), 1) == null);
//		sleep(250);
//		Behavior.Page.back(driver);
//		// Should be back in the app
//		Assert.assertTrue("Did not go back to the app", waitForVisible(driver, find(Elements.Playback.albumnArtworkId), 10) != null);
//		// Lyrics are present (not clickable for all songs, so we just check that they're there)
//		Behavior.Playback.clickAdditionalOptions(driver);
//		Assert.assertTrue("No lyrics button", waitForVisible(driver, find(Elements.Playback.stationInfoLyricsX), 10) != null);
//		
//		// Tune Station is present
//		Assert.assertTrue("Could not click tune station", Behavior.Playback.clickTune(driver));
//	}
//	
//	// Share brings up sharing options (Uses Android back button)
//	@Test
//	public void testSharingOptions(){
//		Behavior.Gate.logInFromBoot(driver);
//		Behavior.Search.searchForAndSelectFirstResult(driver, "Imagine Dragons");
//		Assert.assertTrue("Could not load share pane", Behavior.Playback.clickShare(driver));
//		Behavior.Page.back(driver);
//		Assert.assertTrue("Did not return to playback", waitForVisible(driver, find(Elements.Playback.albumnArtworkId), 10) != null);
//	}
//
//	
//	@Test
//	public void testPodcastSkip(){
//		Behavior.Gate.logInFromBoot(driver);
//		Behavior.Search.searchForAndSelectFirstResult(driver, "Elvis Duran On Demand");
//		Behavior.Page.clickPodcastEpisode(driver, 1);
//		Assert.assertTrue("Did not go to playback", waitForVisible(driver, find(Elements.Playback.podcastSeekBar), 10) != null);
//		String nameBeforeSkip = waitForVisible(driver, find(Elements.Playback.songTitleId), 1).getText();
//		Behavior.Playback.skip(driver);
//		Assert.assertTrue("Did not skip", !nameBeforeSkip.equals(waitForVisible(driver, find(Elements.Playback.songTitleId), 1).getText()));
//	}
//	
//	@Test
//	/**
//	 * Needs a clean slate because we can't un-thumb tracks, 
//	 */
//	public void testPodcastThumbs(){
//		Behavior.Page.signUpFromBoot(driver);
//		
//		Behavior.Search.searchForAndSelectFirstResult(driver, "Elvis Duran On Demand");
//		Behavior.Page.clickPodcastEpisode(driver, 1);
//		Assert.assertTrue("Did not go to playback", waitForVisible(driver, find(Elements.Playback.podcastSeekBar), 10) != null);
//		
//		// Click thumbs up, skip, click thumbs down, skip, make sure we have one of each in listening history
//		Behavior.Playback.thumbUp(driver);
//		Behavior.Playback.skip(driver);
//		Behavior.Playback.thumbDown(driver);
//		Behavior.Playback.skip(driver);
//		Behavior.Playback.back(driver);
//		int backCount = 0; 
//		while(backCount < 5 && waitForVisible(driver, find(Elements.Page.menuDrawerButtonX), 1) == null){
//			backCount++;
//			Behavior.Page.back(driver);
//		}
//		Behavior.Navbar.openMenu(driver);
//		Behavior.Page.clickMenuDrawerListeningHistory(driver);
//		Assert.assertTrue("First item was thumb-free", waitForVisible(driver, find(Elements.ListeningHistory.getHistoryListSongThumbX(2)), 1) == null);
//		Assert.assertTrue("Second item was thumb-free", waitForVisible(driver, find(Elements.ListeningHistory.getHistoryListSongThumbX(3)), 1) != null);
//		Assert.assertTrue("Third item was thumb-free", waitForVisible(driver, find(Elements.ListeningHistory.getHistoryListSongThumbX(4)), 1) != null);
//	}
//	
//	@Test
//	public void testPodcastSeek(){
//		// Log in and find podcast
//		Behavior.Gate.logInFromBoot(driver);
//		Behavior.Search.searchForAndSelectFirstResult(driver, "Elvis Duran On Demand");
//		Behavior.Page.clickPodcastEpisode(driver, 1);
//		Assert.assertTrue("Did not go to playback", waitForVisible(driver, find(Elements.Playback.podcastSeekBar), 10) != null);
//		// pause so we're not messing up the scrubbing later
//		Behavior.Playback.playPause(driver); 
//		int timeBeforeSeek = Behavior.Playback.getElapsedTime(driver);
//		Behavior.Playback.seekTo(driver, 50);
//		int currentTime = Behavior.Playback.getElapsedTime(driver);
//		Assert.assertTrue("Could not seek in podcast", !isAbout(currentTime, timeBeforeSeek));
//		int scrubTo = Behavior.Playback.getTotalTime(driver) / 2;
//		Assert.assertTrue("Seek position wasn't halfway. Position: " + currentTime + " halfway point: " + scrubTo,
//				isAbout(currentTime, scrubTo, 60));
//		scrubTo = Behavior.Playback.getTotalTime(driver) / 4;
//		Behavior.Playback.seekTo(driver, 25);
//		currentTime = Behavior.Playback.getElapsedTime(driver);
//		Assert.assertTrue("Seek position wasn't quarter location. Position: " + currentTime + " quarter point: " + scrubTo,
//				isAbout(currentTime, scrubTo, 60));
//	}
//}

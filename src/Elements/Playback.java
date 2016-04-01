package Elements;

public class Playback extends Page{
	
	//for Auto it is connectId and NOT controllerId 
	//adding auto specific 
	//player controls 
		public static String breadCrumbText = Xpath.base + Xpath.view(1) + Xpath.linear(1) + Xpath.text(1);
		public static String songNameText = Xpath.base + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) + Xpath.linear(1) + Xpath.frame(1)+Xpath.text(1) ;
		public static String stationNameText = Xpath.base + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) +Xpath.linear(1) + Xpath.text(1);
		public static String artistNameText = Xpath.base + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) + Xpath.linear(1) + Xpath.text(2); ;
		public static String favoriteButton = Xpath.base + Xpath.view(1) + Xpath.linear(1) + Xpath.imageButton(2) ;
		public static String menuButton = Xpath.base + Xpath.view(1) + Xpath.linear(1) + Xpath.imageButton(1);
		public static String thumbsButton = Xpath.base + Xpath.linear(1) + Xpath.frame(2) + Xpath.linear(1) + Xpath.linear(1) + Xpath.text(2);;
		public static String scanButton = Xpath.base + Xpath.linear(1) + Xpath.frame(2) + Xpath.linear(1) + Xpath.linear(1) + Xpath.text(1);
		public static String createStationButton = Xpath.base + Xpath.linear(1) + Xpath.frame(2) + Xpath.linear(1) + Xpath.linear(1) + Xpath.text(3); ;
		public static String albumCover = Xpath.base + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) + Xpath.linear(1) + Xpath.image(1);
		public static String PauseButton = Xpath.base + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(1) + Xpath.imageButton(1);
		
		//same button as above but values with 'connectid' did not work
	public static String playerParentContainerId = Page.connectId + "player_view_container";
	public static String albumnArtworkId = Page.connectId + "cover_image";
	public static String playerStateContainer = Page.connectId + "player_state_container";
	public static String playPauseButton = Xpath.base + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(1) + Xpath.imageButton(1);
	 
	public static String menuHandleID = Page.connectId + "menu_handle";
	public static String menuHeartButton = Page.connectId + "menu_heart_btn";
	public static String breadCrumb = Page.connectId + "bread_crumb_text";
	public static String favoriteButtonId = Page.connectId + "menu_add_favorites_btn";
	
	public static String stationNameId = Page.connectId + "meta_line_1";
	public static String songTitleId = "meta_line_2";
	public static String artistId = "meta_line_3";
	
	//public static String controlsContainerId = Page.connectId + "player_controls_container";
	public static String timeElapsedId = Page.connectId + "timeElapsed";
	public static String timeTotalId = Page.connectId + "timeTotal";
	
	public static String thumbsId = Page.connectId + "player_btn_1_text";
	public static String thumbDownId = Page.connectId + "button_player_thumbdown";
	public static String thumbUpId = Page.connectId + "button_player_thumbup";
	public static String playPauseBfferId = Page.connectId + "player_play_pause_buffer";
	public static String skipSongId = Page.connectId + "player_btn_0_text";
	public static String createStationId = Page.connectId + "player_btn_2_text";
	
	
	// Station popup
			public static String popupTitleId = Page.connectId + "title";
			public static String popupSubtitleId = Page.connectId + "subtitle";
			public static String popupShare = Page.connectId + "share_station";
	
	
	//after thumbing down
	public static String thumbedDownTrackTextId = popupSubtitleId;
	public static String thumbedDownGotItId = Page.connectId + "got_it";
	
	
	
	// Info overlay
		public static String stationInfoStationNameId = popupTitleId; // Renamed for convenience
		public static String stationInfoNowPlayingId = popupSubtitleId; // Renamed for convenience
		private static String stationInfoOptionsBaseX = "/" + Xpath.linear(1) + Xpath.frame(1) + Xpath.frame(1) 
							+ Xpath.scroll(1) + Xpath.linear(1) + Xpath.linear(1);
		public static String getStationInfoOption(int i){
			return stationInfoOptionsBaseX + Xpath.frame(i) + Xpath.text(1);
		}
		
		
/* commenting as these fields not auto related
 * 
 * //public static String playbackContainerId = Page.connectId + "layoutAboveContainer";
	//public static String songInfoContainerId = Page.connectId + "player_info_container";
	// Station popup
	public static String popupTitleId = Page.connectId + "title";
	public static String popupSubtitleId = Page.connectId + "subtitle";
	public static String popupShare = Page.connectId + "share_station";
	
	//Navigation elements
	private static String navBaseX = Xpath.base + Xpath.frame(1) + Xpath.frame(3) + Xpath.view(1);
	public static String backButtonX = navBaseX + Xpath.imageButton(1);
	public static String stationTitleX = navBaseX + Xpath.text(1);
	public static String castButtonX = navBaseX + Xpath.linearCompat(1) + Xpath.linear(1) + Xpath.view(1);
	public static String shareButtonX = navBaseX + Xpath.linearCompat(1) + Xpath.text(1);
	public static String infoButtonX = navBaseX + Xpath.linearCompat(1) + Xpath.text(2);
	
	// Info overlay
	public static String stationInfoStationNameId = popupTitleId; // Renamed for convenience
	public static String stationInfoNowPlayingId = popupSubtitleId; // Renamed for conenience
	private static String stationInfoOptionsBaseX = "/" + Xpath.linear(1) + Xpath.frame(1) + Xpath.frame(1) 
						+ Xpath.scroll(1) + Xpath.linear(1) + Xpath.linear(1);
	public static String getStationInfoOption(int i){
		return stationInfoOptionsBaseX + Xpath.frame(i) + Xpath.text(1);
	}
	public static String stationInfoArtistBioX = stationInfoOptionsBaseX + Xpath.frame(1) + Xpath.text(1);
	public static String stationInfoBuyOnGooglePlayX = stationInfoOptionsBaseX + Xpath.frame(2) + Xpath.text(1);
	public static String stationInfoBuyOnAmazonX = stationInfoOptionsBaseX + Xpath.frame(3) + Xpath.text(1);
	public static String stationInfoLyricsX = stationInfoOptionsBaseX + Xpath.frame(4) + Xpath.text(1);
	public static String stationInfoTuneX = stationInfoOptionsBaseX + Xpath.frame(5) + Xpath.text(1);

	// Artist bio
	public static String artistBioNameId = Page.connectId + "artist";
	public static String artistBioTextId = Page.connectId + "bio";
	
	// Tune Station overlay
	private static String tuneStationBaseX = "/" + Xpath.linear(1) + Xpath.frame(1) + Xpath.frame(1) + Xpath.scroll(1) + Xpath.linear(1);
	public static String tuneStationTitleX = tuneStationBaseX + Xpath.text(1);
	public static String tuneStationDescriptionX = tuneStationBaseX + Xpath.text(2);
	public static String tuneStationFooterX = tuneStationBaseX + Xpath.text(3);
	// Tune station options
	public static String tuneStationTopHitsId = Page.connectId + "familiarButton";
	public static String tuneStationMixId = Page.connectId + "mixedButton";
	public static String tuneStationVariety = Page.connectId + "lessFamiliarButton";
	// After thumbing down
	public static String thumbedDownTrackTextId = popupSubtitleId;
	public static String thumbedDownGotItId = Page.connectId + "got_it";
	*/
	
	// After skipping 6+ songs
	private static String skippedBaseX = "/" + Xpath.linear(1) + Xpath.frame(1) + Xpath.frame(1) + Xpath.linear(1);
	public static String skippedHeadingX = skippedBaseX + Xpath.text(1);
	public static String skippedInfoX = skippedBaseX + Xpath.text(2);
	public static String skippedListX = skippedBaseX + Xpath.list(1);
	private static String skippedListItemX = skippedBaseX + Xpath.list(1) + "/android.widget.LinearLayout[XXXXX]";
	public static String getSkippedListItemX(int i){
		return skippedListItemX.replace("[XXXXX]", "[" + i + "]");
	}
	public static String getSkippedListItemTitleX(int i){
		return getSkippedListItemX(i) + Xpath.linear(1) + Xpath.text(1);
	}
	public static String getSkippedListItemInfoX(int i){
		return getSkippedListItemX(i) + Xpath.linear(1) + Xpath.text(2);
	}
	public static String getSkippedListItemImageX(int i){
		return getSkippedListItemX(i) + Xpath.linear(1) + Xpath.image(1);
	}
	public static String skippedNoThanksId = Page.connectId + "dismiss";

	
	// Podcast specific controls
	public static String podcastSeekBar = Page.connectId + "seek_bar";
}



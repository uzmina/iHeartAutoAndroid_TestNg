package Elements;

public class LiveRadio extends Page {
	
	//fields specific to auto
	public static String liveRadioCard = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) + Xpath.frame(1) +Xpath.linear(1);
	
	public static String nearYouCard = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(1) + Xpath.linear(1);
	public static String byLocationCard = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(2);
	public static String byGenreCard = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(3);
	
	//auto-stations
	public static String station1 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(1);
	public static String station1text = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.text(1);
	public static String station2 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(2);
	public static String station2text = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(2) + Xpath.linear(1) + Xpath.linear(1) + Xpath.text(1);
	public static String station3 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(3);
	public static String station3text = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(3) + Xpath.linear(1) + Xpath.linear(1) + Xpath.text(1);
	
	//auto- search by location
	public static String location1 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(1);
	//by state
	public static String state1row1 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.frame(1);
	public static String state2row1 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.frame(2);
	public static String state3row1 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.frame(3);
	public static String state1row2 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(2) + Xpath.frame(1);
	public static String state1row2text = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(2) + Xpath.frame(1) + Xpath.text(1);
	
	public static String state2row2 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(2) + Xpath.frame(2);
	public static String state3row2 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(2) + Xpath.frame(3);
	//auto - by city
	public static String row1City1 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.frame(1) + Xpath.text(1);
	public static String row2City1 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(2) + Xpath.frame(1) + Xpath.text(1);
	
	//auto-genre
	public static String row1genre3 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.frame(3);
	public static String hiphop = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.frame(3) + Xpath.text(1);
			
	
	//back button
	public static String backButton = Xpath.base + Xpath.view(1) + Xpath.linear(1) + Xpath.imageButton(1);
	
	
	
	
	
	
	
	
	//flag ship from here
	private static String liveRadioNavbarBaseX = Xpath.base + Xpath.drawer(1) + Xpath.relative(1) + Xpath.frame(2) + Xpath.linear(1) 
							+ Xpath.frame(1) + Xpath.frame(1) + Xpath.linear(1) + Xpath.horizScroll(1) + Xpath.linear(1) + "/android.widget.TextView[XXXXX]";
	
	// Give static variable names because it's easier to refer to them this way, but may need to change the corresponding value if app changes
	public static String liveRadioCitiesX = liveRadioNavbarBaseX.replace("[XXXXX]", "1");
	public static String liveRadioStationsX = liveRadioNavbarBaseX.replace("[XXXXX]", "2");
	public static String liveRadioMusicEntertainmentX = liveRadioNavbarBaseX.replace("[XXXXX]", "3");
	public static String liveRadioTalkX = liveRadioNavbarBaseX.replace("[XXXXX]", "4");
	
	// Live Radio Cities List
	private static String liveRadioCitiesBaseX = Xpath.base + Xpath.drawer(1) + Xpath.relative(1) + Xpath.frame(2) + Xpath.linear(1) 
							+ Xpath.frame(1) + Xpath.frame(1) + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.frame(1)
							+ Xpath.linear(1) + Xpath.linear(1) + Xpath.list(1) + "android.widget.LinearLayout[XXXXX]" + "/android.widget.TextView[YYYYY]";
	
	
	/**
	 * Use this to find an item in the list.
	 * A label in the list will be LinearLayout[1]/TextView[1]
	 * 		For this, call the method like this: getLiveRadioCityItemX(1, 1);
	 * An item immediately after a label will look like this: LinearLayout[1]/TextView[2]
	 * Every item after those two items will be LinearLayout[X]/TextView[1], where X is it's place in the list
	 * 		An item like this would be accessed like so: getLiveRadioCityItemX(3, 1) for the third item in the list
	 * 	Examples below with values that are passed in (when these are on the view, this is not static, if the user scrolls, the top item is 1,1)
	 * 		Alaska (1, 1)
	 * 			Anchorage (1, 2)
	 * 			Fairbanks (2, 1) 
	 * 		Arizona (3, 1)
	 * 			Phoenix (3, 2)
	 * 			Tuscon (4, 1)
	 * 		Arkansas (5, 1)
	 * 			Fayetteville (5, 2)
	 * 			Fort Smith (6, 1)
	 * 			LittleRock (7, 1)
	 * 	Two labels in a row? That looks like this:
	 * 		Alabama (1, 1)
	 * 		Alaska (2, 1)
	 * 			Anchorage (2, 2)
	 * 			Fairbanks (3, 1)
	 * 		... Etc
	 * Basically, the label disrupts the flow only for the one after it, think of it as sharing the linear layout position
	 * @param x: Replaces the LinearLayout[]
	 * @param y: Replaces the TextView[]
	 * @return
	 */
	public static String getLiveRadioCityItemX(int x, int y){
		return liveRadioCitiesBaseX.replace("[XXXXX]", "[" + x + "]").replace("[YYYYY]", "[" + y + "]");
	} // That was a lot of documentation for such a small method, huh? 
	
	
	/*// Live Radio Stations Near You List
	private static String liveRadioStationsNearYouX = Xpath.base + Xpath.drawer(1) + Xpath.relative(1) + Xpath.frame(2) + Xpath.linear(1) + Xpath.frame(1) + Xpath.frame(1) + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.frame(1) + Xpath.linear(1) + Xpath.grid(1) + "/android.widget.FrameLayout[XXXXX]" + Xpath.relative(1) + Xpath.view(1);
	public static String getLiveRadioStationsListItemX(int i){
		return liveRadioStationsNearYouX.replace("[XXXXX]", "[" + i + "]");
	}
	
	// Live Radio Music & Entertainment
	//   These sort the radio stations near you list above, showing you the stations that fit your criteria
	//     Leads to pages that use the same format as the "Stations near you" list. 
	private static String liveRadioMusicEntertainmentListBaseX = Xpath.base + Xpath.drawer(1) + Xpath.relative(1) + Xpath.frame(2) + Xpath.linear(1) + Xpath.frame(1) + Xpath.frame(1) + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.list(1) + "android.widget.FrameLayout[XXXXX]" + Xpath.text(1);
	public static String getLiveRadioMEListItemX(int i){
		return liveRadioMusicEntertainmentListBaseX.replace("[XXXXX]", "[" + i + "]");
	}
	
	// Live Radio Talk Radio
	public static String liveRadioNewsTalkId = Page.controllerId + "news_and_talk_item"; // Radio stations near you view opens. 
	public static String liveRadioPublicId = Page.controllerId + "public_item"; // Opens a slightly different page, like "My Stations" page of home, but slightly different. 
	public static String liveRadioSportsId = Page.controllerId + "sports_item"; // Radio stations near you view opens. 

	private static String liveRadioPublicListItemX = Xpath.base + Xpath.relative(1) + Xpath.frame(2) + Xpath.linear(1) 
														+ Xpath.frame(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.list(1) 
														+ "/android.widget.FrameLayout[XXXXX]" + Xpath.linear(1);
	public static String getLiveRadioPublicListItemX(int i){
		return liveRadioPublicListItemX.replace("[XXXXX]", "[" + i + "]");
	}
*/
}

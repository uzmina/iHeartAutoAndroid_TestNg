package Elements;

public class GenreGame extends Page {
	// Genre Image and the Continue button
//	public static String genreGameHeadingId = Page.controllerId + "headerTitle";
	public static String genreHeadingText1 = Xpath.base + Xpath.frame(1) + Xpath.linear(1) + Xpath.text(1);
	public static String genreHeadingText2 = Xpath.base + Xpath.frame(1) + Xpath.linear(1) + Xpath.text(2);
	
	public static String genreGameHeadingId = Page.connectId + "genre_heading_container";
	public static String genreGameDoneId = Page.connectId + "done_btn";
	//genre page items
	public  static String genreGamePage1Item1 = Page.connectId +"card_0_0";
	public  static String genreGamePage1Item2 = Page.connectId +"card_0_1";
	public  static String genreGamePage1Item3 = Page.connectId +"card_1_0";
	public  static String genreGamePage1Item4 = Page.connectId +"card_1_1";
	public  static String genreGamePage1Item5 = Page.connectId +"card_2_0";
	public  static String genreGamePage1Item6 = Page.connectId +"card_2_1";
	public  static String genreGamePage2Item1 = Page.connectId +"card_0_0";
	
	
	
	//Continue button from Genre Game
		public static String GenreContinueBtn = Page.connectId + "continue_button"; // another declaration in elements.account
	    public static String GenreSelected = Page.connectId + "item_check"; //created for android auto for anonymous user workflow
	// Genres
	// By Xpath XXXXX used for the item array, replaced by method getGenreGameItemXpath(int i)
    
	//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.GridView[1]/android.widget.FrameLayout[1]/android.view.View[1]
	//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.GridView[1]/android.widget.FrameLayout[2]/android.view.View[1]
	
	//private static String genreGameBaseItemX = Xpath.base + Xpath.frame(1) + Xpath.frame(1) + Xpath.relative(1) + Xpath.grid(1) + "/android.widget.FrameLayout[XXXXX]" + Xpath.view(1);
	//private static String genreGameItemSelectedX = Xpath.base + Xpath.frame(1) + Xpath.frame(1) + Xpath.relative(1) + Xpath.grid(1) + "/android.widget.FrameLayout[XXXXX]" + Xpath.image(2);
	
	// If the position of 1 is being taken up by the heading, as it is in the latest alpha, set adjust to 1
	// Otherwise, keep adjust at 0
	//private static int adjust = 1;
	
	/*public static String getGenreGameItemX(int i){
		return genreGameBaseItemX.replace("[XXXXX]", "[" + (i + adjust) + "]");
	}
	
	public static String getGenreSelectedX(int i){
		return genreGameItemSelectedX.replace("[XXXXX]", "[" + (i + adjust) + "]");
	}*/
	
}	

package Elements;

public class AnonymousUser extends Page{

	
	//public static String mayBeLaterBtn = Page.connectId + "maybe_later_btn";
	public static String mayBeLaterBtn = Xpath.base + Xpath.linear(1) + Xpath.relative(1) + Xpath.linear(1) + Xpath.button(3);
	//sign up pop up
	public static String signUpBtn = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.button(1);
	public static String cancelBtn = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.button(2);
	public static String signupTextDesc = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.text(1); 
	
	//aux connect growl
	public static String auxConnectedGrowl = Page.connectId + "text_title";
	
	//breadcrumb station near you
	public static String breadCrumbText = Xpath.base + Xpath.view(1) + Xpath.linear(1) + Xpath.text(1);
	
	//player controls 
	//player metadata when a music streaming
	public static String songNameText = Xpath.base + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) + Xpath.linear(1) + Xpath.frame(1)+Xpath.text(1) ;
	public static String stationNameText = Xpath.base + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) +Xpath.linear(1) + Xpath.text(1);
	public static String artistNameText = Xpath.base + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) + Xpath.linear(1) + Xpath.text(2); 
	//when no station streaming
	public static String stationTaglineText = Xpath.base + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) + Xpath.linear(1) + Xpath.frame(1) + Xpath.text(2); 
	public static String favoriteButton = Xpath.base + Xpath.view(1) + Xpath.linear(1) + Xpath.imageButton(2) ;
	public static String menuButton = Xpath.base + Xpath.view(1) + Xpath.linear(1) + Xpath.imageButton(1);
	public static String thumbsButton = Xpath.base + Xpath.linear(1) + Xpath.frame(2) + Xpath.linear(1) + Xpath.linear(1) + Xpath.text(2);;
	public static String scanButton = Xpath.base + Xpath.linear(1) + Xpath.frame(2) + Xpath.linear(1) + Xpath.linear(1) + Xpath.text(1);
	public static String createStationButton = Xpath.base + Xpath.linear(1) + Xpath.frame(2) + Xpath.linear(1) + Xpath.linear(1) + Xpath.text(3); ;
	public static String albumCover = Xpath.base + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) + Xpath.linear(1) + Xpath.image(1);
    
	public static String playPauseButton = Xpath.base + Xpath.linear(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(1) + Xpath.imageButton(1);
}

package Elements;

public class LocationSetup extends Page{
	
	//public static String skipButton = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.button(1);
	public static String skipButton = connectId + "button_red_top";
	public static String setButton = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.button(2);
  
	public static String locationTextBox = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.editText(1);
	public static String locationTextDesc = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.text(1);
	
	public static String skipActivePopup = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.text(1);
	public static String okButton = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.button(1);
     
	public static String splashScreen = Xpath.base + Xpath.frame(1) + Xpath.image(1);

}

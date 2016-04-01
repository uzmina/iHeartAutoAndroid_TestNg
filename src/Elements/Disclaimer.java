package Elements;


public class Disclaimer extends Xpath{
	
	public static String acceptDisclaimerButton = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.linear(2) + Xpath.button(1);
	public static String denyDisclaimerButton = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.linear(2) + Xpath.button(2);
    
	public static String disclaimerTitle = Xpath.basePopup + Xpath.linear(1) + Xpath.text(1);
	public static String disclaimerTextDesc = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.text(1);
	
	public static String disclaimerChkBox = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.checkBox(1);
	public static String disclaimerChkBoxText = Xpath.basePopup + Xpath.linear(1) + Xpath.scrollView(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.text(1);
}

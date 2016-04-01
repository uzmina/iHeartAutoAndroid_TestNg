package Behavior;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class LocationSetup extends Page{
	static String skipButton = "Skip";
      public static boolean clickSkipButton(AndroidDriver<MobileElement> d){
    	  MobileElement location_skipbutton = waitForVisible(d, find(Elements.LocationSetup.skipButton),10);
    	  System.out.println(location_skipbutton.getText());
    	  location_skipbutton.click();
    	  System.out.println("skip button click");
    		return waitForVisible(d, MobileBy.id(Elements.LocationSetup.skipActivePopup),5) != null;
    		
      }
      
      public boolean clickOKButton(AndroidDriver<MobileElement> d){
    	  MobileElement popOKbutton = waitForVisible(d, find(Elements.LocationSetup.okButton),5);
    		popOKbutton.click();
    		return waitForVisible(d, MobileBy.id(Elements.LocationSetup.splashScreen),5) != null;
    		
      }
}

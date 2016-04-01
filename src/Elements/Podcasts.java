package Elements;

public class Podcasts extends Page {
	
	//Podcasts cards
			public static String podcastsCard = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) + Xpath.frame(3);
			public static String podcastCardText = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) + Xpath.frame(3) +Xpath.linear(1) + Xpath.text(1);
	//featured topic		
			public static String podcastTopicCard0_0 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.frame(1) ;
			public static String podcastTopicText0_0 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(1) + Xpath.frame(1) ;
			
			public static String podcastRadio0_0 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(1) ;
			public static String podcastRadio1_0 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(2) ;
			public static String podcastRadio2_0 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(3) ;
			
}

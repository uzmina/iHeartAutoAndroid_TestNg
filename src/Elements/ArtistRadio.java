package Elements;

public class ArtistRadio extends Page{
	//Artist radio cards
		public static String artistRadioCard = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) + Xpath.frame(2);
		public static String artistCardText = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(2) + Xpath.frame(2) +Xpath.linear(1) + Xpath.text(1);
		
		public static String artistGenreCard0_1 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(2) + Xpath.frame(1) ;
		public static String artistGenreText0_1= Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.linear(2) + Xpath.frame(1) ;
		
		public static String artistGenreRadio0_0 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(1) ;
		public static String artistGenreRadio1_0 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(2) ;
		public static String artistGenreRadio2_0 = Xpath.base + Xpath.view(1) + Xpath.frame(1) + Xpath.viewPager(1) + Xpath.linear(1) + Xpath.frame(3) ;
		
}

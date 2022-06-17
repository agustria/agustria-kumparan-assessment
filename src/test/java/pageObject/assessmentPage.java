package pageObject;

public class assessmentPage {
	//bug1 region
    public static String cara_menulis_di_kumparan_button = "//*[@class='Textweb__StyledText-sc-1uxddwr-0 gwpPHu sc-750vfa-0' and contains(text(), 'Cara Menulis di kumparan')]";
    public static String love_icon = "//*[@class='Textweb__StyledText-sc-1uxddwr-0 eGpPJQ']" ;
    
    //bug2 region
    public static String comment_icon = "(//*[@data-qa-id='comment-button-wrapper'])[1]";
    public static String comment_section = "//*[@data-qa-id='comment-section']";
    
    //bug3 region
    public static String mom_article = "(//*[@class='Viewweb__StyledView-sc-1ajfkkc-0 CCzVr']/*[@class='LabelLinkweb__StyledLink-sc-fupmuj-0 btFwc'])[1]";
    public static String news_button = "//*[@class='Textweb__StyledText-sc-1uxddwr-0 isuQrH sc-750vfa-0' and contains(text(), 'News')]";
    public static String news_page = "//*[@data-qa-id='channel-title' and contains(text(), 'News')]";
    
    //bug4 region
    public static String trending_button = "//*[@class='Textweb__StyledText-sc-1uxddwr-0 gwpPHu sc-750vfa-0' and contains(text(), 'Trending')]/parent::*/parent::*";
    public static String trending_page = "//*[@class='Viewweb__StyledView-sc-1ajfkkc-0 dzRhek']";
    
    //bug5 region
    public static String opini_button = "//*[@class='Textweb__StyledText-sc-1uxddwr-0 gwpPHu sc-750vfa-0' and contains(text(), 'Opini')]/parent::*/parent::*";
    public static String opini_first_article = "(//*[@data-qa-id='title'])[1]";
    
    //test-cases region
    public static String accept_alert = "//*[@id='onesignal-slidedown-allow-button']";
    public static String entertainment_page = "//*[@data-qa-id='channel-title' and contains(text(), 'Entertainment')]";
    public static String woman_page = "//*[@data-qa-id='channel-title' and contains(text(), 'Woman')]";
    public static String bisnis_page = "//*[@data-qa-id='channel-title' and contains(text(), 'Bisnis')]";
    public static String food_travel_page = "//*[@data-qa-id='channel-title' and contains(text(), 'Food & Travel')]";
    public static String tekno_sains_page = "//*[@data-qa-id='channel-title' and contains(text(), 'Tekno & Sains')]";
    public static String buzz_page = "//*[@data-qa-id='channel-title' and contains(text(), 'Buzz')]";
    public static String otomotif_page = "//*[@data-qa-id='channel-title' and contains(text(), 'Otomotif')]";
    public static String mom_page = "//*[@data-qa-id='channel-title' and contains(text(), 'Mom')]";
    public static String bola_sports_page = "//*[@data-qa-id='channel-title' and contains(text(), 'Bola & Sports')]";
}

package stepDefinitions;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.cdimascio.dotenv.Dotenv;
import pageObject.assessmentPage;
import data.assessmentData;

public class assessmentSteps {
    public static final Dotenv dotenv = Dotenv.load();

    public static WebDriver webDriver;
    public static int likeNumber;
    
    @Before
    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }
    
    @Given("user access kumparan homepage")
    public void homePage() {
        webDriver.get(dotenv.get("BASE_URL"));
        
    	try {
    		Thread.sleep(5000);
    	} catch (InterruptedException var3) {
    		var3.printStackTrace();
    	}
    	
    	webDriver.findElement(By.xpath(assessmentPage.accept_alert)).click();
    }
    
    //bug1 region
    @And("user access cara menulis di kumparan page")
    public void chooseHowToWrite() {
    	try {
            Thread.sleep(10000);
        } catch (InterruptedException var3) {
            var3.printStackTrace();
        }
        webDriver.findElement(By.xpath(assessmentPage.cara_menulis_di_kumparan_button)).click();
    }
    
    @When("user choose love icon")
    public void chooseLoveIcon() {
    	int numberOfLike = Integer.parseInt(webDriver.findElement(By.xpath(assessmentPage.love_icon)).getText());
    	assessmentData.setNumberOfLike(numberOfLike);
        webDriver.findElement(By.xpath(assessmentPage.love_icon)).click();
    }
    
    @And("user back from login page")
    public void backFromLoginPage() {
    	try {
            Thread.sleep(5000);
        } catch (InterruptedException var3) {
            var3.printStackTrace();
        }
        webDriver.navigate().back();
    }
    
    @Then("the number of like should not updated")
    public void verifyNumberOfLike() {  
    	try {
            Thread.sleep(5000);
        } catch (InterruptedException var3) {
            var3.printStackTrace();
        }
    	int numberOfLikeAfterBack = Integer.parseInt(webDriver.findElement(By.xpath(assessmentPage.love_icon)).getText());
        int numberOfLike = assessmentData.getNumberOfLike();
        Assert.assertEquals(numberOfLikeAfterBack, numberOfLike);
    }
    //bug1 end region
    
    //bug2 region
    @And("user access Opini page")
    public void accessOpiniPage() {
        webDriver.get(dotenv.get("OPINI_URL"));
        
        String opiniArticleTitle = webDriver.findElement(By.xpath(assessmentPage.opini_first_article)).getText();
        assessmentData.setOpiniArticleTitle(opiniArticleTitle);
    }
    
    @When("user choose comment icon on article")
    public void chooseCommentArticle() {
    	try {
            Thread.sleep(5000);
        } catch (InterruptedException var3) {
            var3.printStackTrace();
        }
        webDriver.findElement(By.xpath(assessmentPage.comment_icon)).click();
    }
    
    @Then("comment section should displayed")
    public void verifyCommentSectionDisplayed() {
    	webDriver.findElement(By.xpath(assessmentPage.comment_section)).isDisplayed();
    }
    //bug2 end region
    
    //bug3 region
    @And("user access Mom page")
    public void accessMomPage() {
        webDriver.get(dotenv.get("MOM_URL"));
    }
    
    @And("user choose article on Mom Page")
    public void accessArticleOnMomPage() {
    	try {
            Thread.sleep(10000);
        } catch (InterruptedException var3) {
            var3.printStackTrace();
        }
        webDriver.findElement(By.xpath(assessmentPage.mom_article)).click();
    }
    
    @And("user choose love on mom article")
    public void chooseLoveOnMomArticle() {
        webDriver.findElement(By.xpath(assessmentPage.love_icon)).click();
    }
    
    @When("user access News page from mom article")
    public void accessNewsPageFromMomArticle() {
        webDriver.findElement(By.xpath(assessmentPage.news_button)).click();
    }
    
    @Then("news page should displayed")
    public void verifyNewsPageDisplayed() {
    	webDriver.findElement(By.xpath(assessmentPage.news_page)).isDisplayed();
    }
    //bug3 end region
    
    //bug4 region
    @When("user access Trending page from mom article")
    public void accessTrendingPageFromMomArticle() {
        webDriver.findElement(By.xpath(assessmentPage.trending_button)).click();
    }
    
    @Then("trending page should displayed")
    public void verifyTrendingPageDisplayed() {
    	webDriver.findElement(By.xpath(assessmentPage.trending_page)).isDisplayed();
    }
    //bug4 end region
    
    //bug5 region
    @When("user do refresh the page")
    public void doRefresh() {
        webDriver.navigate().refresh();
    }
    
    @When("user access Opini page from mom article")
    public void accessOpiniPageFromMomArticle() {
        webDriver.findElement(By.xpath(assessmentPage.opini_button)).click();
    }
    
    @Then("article on opini page should loaded")
    public void verifyOpiniPageLoaded() {
    	webDriver.findElement(By.xpath(assessmentPage.opini_first_article)).isDisplayed();
        
        String opiniArticleTitle2 = webDriver.findElement(By.xpath(assessmentPage.opini_first_article)).getText();
        String opiniArticleTitle = assessmentData.getOpiniArticleTitle();
        Assert.assertEquals(opiniArticleTitle2, opiniArticleTitle);
    }
    //bug5 end region
    
    //test-cases region
    @When("^user access (.*) page$")
    public void accessMenuPage(String menuPage) {
    	switch (menuPage) {
        	case "News":
                webDriver.get(dotenv.get("NEWS_URL"));
        		break;
        	case "Entertainment":
                webDriver.get(dotenv.get("ENTERTAINMENT_URL"));
        		break;
        	case "Woman":
                webDriver.get(dotenv.get("WOMAN_URL"));
        		break;
        	case "Bisnis":
                webDriver.get(dotenv.get("BISNIS_URL"));
        		break;
        	case "Food & Travel":
                webDriver.get(dotenv.get("FOOD_TRAVEL_URL"));
        		break;
        	case "Tekno & Sains":
                webDriver.get(dotenv.get("TEKNO_SAINS_URL"));
        		break;
        	case "Buzz":
                webDriver.get(dotenv.get("BUZZ_URL"));
        		break;
        	case "Otomotif":
                webDriver.get(dotenv.get("OTOMOTIF_URL"));
        		break;
        	case "Mom":
                webDriver.get(dotenv.get("MOM_URL"));
        		break;
        	case "Bola & Sports":
                webDriver.get(dotenv.get("BOLA_SPORTS_URL"));
        		break;
        	default:
        		fail(String.format("%s step not implemented yet", menuPage));
        		break;
    	}
    }
    @Then("^(.*) page should displayed$")
    public void verifyMenuDisplayed(String menuPage) {
    	switch (menuPage) {
        	case "News":
            	webDriver.findElement(By.xpath(assessmentPage.news_page)).isDisplayed();
        		break;
        	case "Entertainment":
            	webDriver.findElement(By.xpath(assessmentPage.entertainment_page)).isDisplayed();
        		break;
        	case "Woman":
            	webDriver.findElement(By.xpath(assessmentPage.woman_page)).isDisplayed();
        		break;
        	case "Bisnis":
            	webDriver.findElement(By.xpath(assessmentPage.bisnis_page)).isDisplayed();
        		break;
        	case "Food & Travel":
            	webDriver.findElement(By.xpath(assessmentPage.food_travel_page)).isDisplayed();
        		break;
        	case "Tekno & Sains":
            	webDriver.findElement(By.xpath(assessmentPage.tekno_sains_page)).isDisplayed();
        		break;
        	case "Buzz":
            	webDriver.findElement(By.xpath(assessmentPage.buzz_page)).isDisplayed();
        		break;
        	case "Otomotif":
            	webDriver.findElement(By.xpath(assessmentPage.otomotif_page)).isDisplayed();
        		break;
        	case "Mom":
            	webDriver.findElement(By.xpath(assessmentPage.mom_page)).isDisplayed();
        		break;
        	case "Bola & Sports":
            	webDriver.findElement(By.xpath(assessmentPage.bola_sports_page)).isDisplayed();
        		break;
        	default:
        		fail(String.format("%s step not implemented yet", menuPage));
        		break;
    	}
    }
    //test-cases end region
    
    @After
    public void shutDown() {
        webDriver.close();
    }
    

}

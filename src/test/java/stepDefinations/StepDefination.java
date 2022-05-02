package stepDefinations;

import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import pageObject.FlossPage;
import pageObject.HomePage;
import pageObject.KidsPage;
import pageObject.ProductPage;
import pageObject.SearchPage;
import utility.BaseClass;
import utility.SnapShots;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination extends BaseClass {

		BaseClass baseclass=new BaseClass();
		HomePage homepage=new HomePage();
		KidsPage kidspage=new KidsPage();
		SearchPage searchpage=new SearchPage();
		ProductPage productpage=new ProductPage();
		FlossPage flosspage=new FlossPage();
		SnapShots snap;
		
	    @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() {
	    	baseclass.setup();
	        
	    }

	    @Then("^Verify the text kids is present in the second product$")
	    public void verify_the_text_kids_is_present_in_the_second_product() throws InterruptedException {
	    	snap=new SnapShots();
	    	Thread.sleep(3000);
	    	kidspage.clickOnShopnow();
	    	Thread.sleep(2000);
	    	homepage.acceptCookies();
	    	Thread.sleep(10000);
	       String text=kidspage.getsecondproduct();
	       if(text.contains("Kids")) {
	    	   System.out.println("wow");
	    	   snap.takeSnapShot("test 1 passed");
	       }
	       else {
	    	   snap.takeSnapShot("test 1 failed");
	       }
	       
	    }

	    @Then("^Terminate browser$")
	    public void terminate_browser() {
	    	baseclass.teardown();
	    	
	        
	    }

	    @And("^Navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) {
	        driver.get(strArg1);
	        homepage.acceptCookies();
	    }

	    @And("^Click on kids brushes$")
	    public void click_on_kid_brushes() throws InterruptedException {
	    	homepage.clickOnkidsProducts();
	    	
	    }
	    
	    @Given("^Click on search icon$")
	    public void click_on_search_icon() throws Throwable {
	        homepage.clickOnSearchIcon();
	    }
	    
	    @When("^User send (.+) in searchbox$")
	    public void user_send_in_searchbox(String text) {
	    	searchpage.sendText(text);
	        
	    }

	    @When("^Click on search button$")
	    public void click_on_search_button() {
	       searchpage.clickOnSearchBtn();
	    }

	    @Then("^Click on product filter$")
	    public void click_on_product_filter() throws Throwable {
	        searchpage.section();
	    }

	    @Then("^click on next page$")
	    public void click_on_next_page() throws Throwable {
	    	searchpage.clickOnPage2();
	        
	    }

	    @Then("^click on product$")
	    public void click_on_product() throws Throwable {
	    	Thread.sleep(4000);
	    	searchpage.clickOnResult();
	        
	    }



	    @Then("^Verify the \"([^\"]*)\" is present in details$")
	    public void verify_the_is_present_in_details(String arg1) throws InterruptedException {
	    	snap=new SnapShots();
	    	productpage.clickOnSeeMore();
	    	String des=productpage.description();
	    	Thread.sleep(2000);
	    	if(des.contains(arg1)) {
	    		snap.takeSnapShot("test 2 passed");
	    	}else {
	    		snap.takeSnapShot("test 2 failed");
	    	}
	    }
	    
	    @Given("^click on floss under shop$")
	    public void click_on_floss_under_shop() throws Throwable {
	        homepage.clickOnFloss();
	    }

	    @Then("^verify \"([^\"]*)\" is present in as heading in a category$")
	    public void verify_is_present_in_as_heading_in_a_category(String arg1) throws Throwable {
	    	snap=new SnapShots();
	        String heading=flosspage.getHeading();
	        Thread.sleep(2000);
	        if(heading.equalsIgnoreCase(arg1)) {
	        	snap.takeSnapShot("test 3 passed");
	        	 
	        }else 
	        {
	    		snap.takeSnapShot("test 3 failed");
	        }
	    }
}

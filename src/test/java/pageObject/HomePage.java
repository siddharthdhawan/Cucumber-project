package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.HomeUi;
import utility.Logs;

public class HomePage {
	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public HomePage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public void clickOnkidsProducts() {
		helper.clickOn(HomeUi.kids);
		log.info("clicked on kids products");
	}
	
	public void clickOnSearchIcon() {
		helper.clickOn(HomeUi.searchicon);
		log.info("Clicked on search icon");
	}
	public void acceptCookies() {
		helper.clickOn(HomeUi.cookies);
	}
	public void clickOnFloss() {
		helper.clickOn(HomeUi.flossshop);
		log.info("Clicked on floss");
	}
}

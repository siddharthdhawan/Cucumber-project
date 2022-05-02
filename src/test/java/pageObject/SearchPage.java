package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.SearchUi;
import utility.Logs;

public class SearchPage {
	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public SearchPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public void sendText(String text) {
		helper.sendText(SearchUi.searchbox, text);
		log.info("typed "+text+" in search box");
	}
	public void clickOnSearchBtn() {
		helper.clickOn(SearchUi.searchbtn);
		log.info("Clicked on search button");
	}
	
	public void section() {
		helper.explicitWaitForInvisibilty(SearchUi.section, 10);
		helper.clickOn(SearchUi.section);
	}
	public void clickOnPage2() {
		//helper.explicitWaitForInvisibilty(SearchUi.page2, 10);
		helper.clickOn(SearchUi.page2);
		log.info("Clicked on page 2");
	}
	public void clickOnResult() {
		helper.clickOn(SearchUi.result);
		log.info("Clicked on the result");
	}
}

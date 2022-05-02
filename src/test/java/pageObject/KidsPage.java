package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.kidsUi;
import utility.Logs;

public class KidsPage {
	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public KidsPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	public void clickOnShopnow() {
		helper.clickOn(kidsUi.shopnow);
		log.info("Clicked on shop more");
	}
	public String getsecondproduct() {
		String text=helper.getText(kidsUi.secondproduct);
		return text;
	}
}

	

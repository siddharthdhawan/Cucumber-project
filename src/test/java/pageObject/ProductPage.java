package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.ProductUI;
import utility.Logs;

public class ProductPage {
	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public ProductPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public void clickOnSeeMore() {
		helper.clickOn(ProductUI.seemore);
		log.info("Clicked on see more");
	}
	public String description() {
		String des=helper.getText(ProductUI.discription);
		return des;
	}
}

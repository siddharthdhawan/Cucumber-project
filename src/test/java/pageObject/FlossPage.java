package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.FlossUi;
import utility.Logs;

public class FlossPage {
	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public FlossPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public String getHeading() {
		String text=helper.getText(FlossUi.heading);
		log.info("Getting heading of category 1 in floss page");
		return text;
	}

}

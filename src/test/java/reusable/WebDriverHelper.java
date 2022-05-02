package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BaseClass;

public class WebDriverHelper extends BaseClass {
	
	public void sendText(By element,String text) {
		driver.findElement(element).sendKeys(text);
	}
	
	public String getText(By element) {
	String text=driver.findElement(element).getText();
	return text;
	}
	
	public void clickOn(By element) {
		driver.findElement(element).click();
	}
	public void explicitWaitForInvisibilty(By element,int time) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
}

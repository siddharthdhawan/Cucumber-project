package uiStore;

import org.openqa.selenium.By;

public class SearchUi {
	
	public static By searchbox=By.xpath("//input[@id='searchText']");
	public static By searchbtn=By.xpath("//button[@type='submit']");
	public static By section=By.xpath("//button[@data-action-detail='product']");
	public static By page2=By.xpath("//button[@data-action-detail='Next Page']");
	public static By result=By.xpath("//div[@class='ob-search-block__search-result']/descendant::a[@href='https://www.oralb.co.uk/en-gb/products/electric-toothbrushes/pro-2000-3d-white-rechargeable'][1]");
	

}

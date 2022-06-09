package org.locator;

import java.util.List;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HarveySearchPOJO extends BaseClass{
	
	public HarveySearchPOJO() {
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//div[contains(@class, 'panel_product stock-in')]")
	private List<WebElement> res;
	
	@FindBy(xpath = "//div[contains(@class, 'panel_product stock-in')]//span[@class='price']")
	private List<WebElement> prices;

	public List<WebElement> getRes() {
		return res;
	}
	
	public List<WebElement> getPrices(){
		return prices;
	}
	
}

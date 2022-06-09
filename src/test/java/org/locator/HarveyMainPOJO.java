package org.locator;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class HarveyMainPOJO extends BaseClass{
	
	public HarveyMainPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	private WebElement srch;

	@FindBy(xpath = "//button[@class=\"btn hidden-xs\"]")
	private WebElement srcBtn;
	
	public WebElement getSrch() {
		return srch;
	}

	public WebElement getSrcBtn() {
		return srcBtn;
	}

}

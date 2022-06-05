package org.locator;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HarveyMain extends BaseClass{
	
	public HarveyMain() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement Srch;
	
	@FindBy(xpath="//button[@class='btn hidden-xs']")
	private WebElement SrcBtn;
	
	@FindBy(xpath="//a[@class='btn btn_primary navbar-toggle js-browse-mobile-btn hidden-md hidden-lg strong']")
	private WebElement CatBtn;
	
	@FindBy(id="top-cart")
	private WebElement AddToCart;
	
	

}

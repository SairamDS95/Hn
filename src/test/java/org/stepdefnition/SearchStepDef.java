package org.stepdefnition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.helper.BaseClass;
import org.junit.Assert;
import org.locator.HarveyMainPOJO;
import org.locator.HarveySearchPOJO;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import gherkin.ast.DataTable;
import io.cucumber.java.en.*;

public class SearchStepDef extends BaseClass {

	HarveyMainPOJO h;
	HarveySearchPOJO hs;
	Robot r;
	
	@Given("User is in the home page")
	public void user_is_in_the_home_page() {
		chromeBrowser();
		openUrl("https://www.harveynorman.com.au/");
	}

	@When("User enters keyword in the search field")
	public void user_enters_keyword_in_the_search_field(io.cucumber.datatable.DataTable d) {
	  	
		List<String> inp = d.asList();
		h = new HarveyMainPOJO();
		h.getSrch().sendKeys(inp.get(0));
	    
	}
	
	@When("User click the search button")
	public void user_click_the_search_button() throws InterruptedException {
		h = new HarveyMainPOJO();
		h.getSrcBtn().click();
		Thread.sleep(15000);
	}

	@When("User opens the first product in the new tab")
	public void user_opens_the_first_product_in_the_new_tab() throws AWTException {
		
		driver.findElement(By.xpath("(//button[@class=\"btn btn_sm\"])[3]")).click();
		driver.findElement(By.xpath("(//li[@role='menuitem'])[13]")).click();
		
		hs = new HarveySearchPOJO();
		
		for (int i = 0; i < hs.getPrices().size(); i++) {
			String prices = hs.getPrices().get(i).getText().replace("$", "");
			System.out.println(prices);
		}	
		
		
		
	   /* r = new Robot();
		rightClick(prod);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
	}

	@Then("User takes a screenshot")
	public void user_takes_a_screenshot() throws IOException {
	    String parent = driver.getWindowHandle();
	    Set<String> all = driver.getWindowHandles();
	    
	    
	    for (String id : all) {
			
	    	if (parent != id) {
				
	    		driver.switchTo().window(id);
	    		
			}
	    	
		}
	    
	    
	}


	


}

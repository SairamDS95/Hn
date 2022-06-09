package org.main;

import java.awt.AWTException;
import java.time.Duration;
import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HarveyMain extends BaseClass {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.harveynorman.com.au/");
		
		
		WebElement srch = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		srch.sendKeys("Mobile");
		
		driver.findElement(By.xpath("//button[@class='btn hidden-xs']")).click();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[contains(@class, 'panel_product stock-in')])[2]"))));
		
		/*WebElement items = driver.findElement(By.xpath("(//div[contains(@class, 'panel_product stock-in')])[2]"));
		items.click();*/
		
		System.out.println("Done");
	
		
	}

}
package com.noorteck.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoLocator extends Hooks{
	public static void main(String[] args) {
		setUp("chrome");
		
		System.setProperty("webDriver.chrome.driver", "/Users/chuchu/Downloads/chromedriver-mac-arm64\\ 2/chromedriver");
		driver.get("https://www.letskodeit.com/practice");

		// Locate the Element using ID locator then store in webElement object
		WebElement textField = driver.findElement(By.id("autosuggest"));

		textField.sendKeys("Zaid Al Ramadhani");
		
	
		
		tearDown();
	}
	
	
	

}

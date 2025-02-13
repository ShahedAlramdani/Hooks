package com.noorteck.selenium.day1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
public class DemoTest {
	
	public static void main(String args []) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/chuchu/Desktop/driver/geckodriver");
		
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
	}
	 
}

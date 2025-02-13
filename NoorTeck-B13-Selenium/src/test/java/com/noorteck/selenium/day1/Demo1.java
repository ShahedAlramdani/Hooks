package com.noorteck.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {

		String browserName = "safari"; // safari, edge, firefox
		// step 2. create object of webDriver
		WebDriver driver = null;

		if (browserName.equals("chrome")) {
			// set up edge for webdriverManager
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browserName.equals("safari")) {
			WebDriverManager.safaridriver().setup();

			driver = new SafariDriver();

		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
		}

		// navigate to URL
		driver.get("https://www.google.com/");

		Thread.sleep(5000);
		driver.quit();

	}

}

/**
 * 
 * Windows: > Chrome --> Selenium has an issue chrome browser so we dont open
 * our script in chrome > Edge > Firefox
 * 
 * 
 * 
 * 
 * 
 * Mac: > Chrome --> Selenium has an issue opening chrome browser so we dont
 * open our script in chrome > Safari --> for some of you, you might not be able
 * to use safari because of xuz reason > Firefox
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
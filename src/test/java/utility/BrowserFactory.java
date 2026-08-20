package com.coforge.utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {



	public static WebDriver BrowserOptions(WebDriver driver, String browser, String url) {
		if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("GC")
				|| browser.equalsIgnoreCase("Google Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge") || browser.equalsIgnoreCase("EG")
				|| browser.equalsIgnoreCase("Microsoft Edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("FireFox") || browser.equalsIgnoreCase("EG")
				|| browser.equalsIgnoreCase("Mozilla Firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(url);
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
}
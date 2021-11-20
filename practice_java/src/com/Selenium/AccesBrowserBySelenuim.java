package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AccesBrowserBySelenuim {
	WebDriver driver;
	public void launchBrowser(String BROWSER) throws InterruptedException {
		switch (BROWSER) {
		case"chorme":
			System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case"firefox":
		System.setProperty("webdriver.gecko.driver", "./browsers/geckodriver.exe");
		driver=new FirefoxDriver();
		break;
		case"ie":
		System.setProperty("webdriver.ie.driver", "./browsers/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		break;
		
		default:	
			System.out.println("In Valied Brower..........");
			break;
			
		}
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.quit();
		
		}
	
	public static void main(String[] args) throws InterruptedException {
		AccesBrowserBySelenuim abbs=new AccesBrowserBySelenuim();
		abbs.launchBrowser("ie");

	}

}

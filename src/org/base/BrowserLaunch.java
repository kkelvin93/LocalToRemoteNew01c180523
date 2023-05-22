package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KELVIN KAVIN\\eclipse-workspace\\GITHub01c180523\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("Browser launched successfully");
		
		System.out.println("I worked in Dev branch");
		
		System.out.println("Automation Testing");
		

	}

}

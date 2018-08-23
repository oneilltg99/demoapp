package com.devopsmaniac.mania;

import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.junit.Test;
public class SeleniumTest {
	
	@Test
	public void checkRamdonSite() throws InterruptedException {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.google.com");
		
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website google.com");
        assertEquals("Google", driver.getTitle());
        
		//Wait for 5 Sec
		Thread.sleep(5000);
		
        // Close the driver
        driver.quit();
	}
}

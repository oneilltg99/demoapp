package com.devopsmaniac.mania;

import static org.junit.Assert.*;
import org.junit.Ignore;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.junit.Test; 

@Ignore
public class SeleniumTest { 
	
	@Test
	public void checkRandomSitePass() throws InterruptedException, MalformedURLException {

		RemoteWebDriver driver = new RemoteWebDriver(
                new URL("http://selenium.sndevops.xyz:4444/wd/hub"),
                DesiredCapabilities.firefox());
		
        //Launch the Online Store Website
		driver.get("http://www.google.com"); 
		 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website google.com"); 
        assertEquals(driver.getTitle(), "Google");
        
		//Wait for 5 Sec
		Thread.sleep(5000); 
		
        // Close the driver
        driver.quit();
	}

	/*@Test
	public void checkRandomSiteFail() throws InterruptedException, MalformedURLException {

		RemoteWebDriver driver = new RemoteWebDriver(
                new URL("http://selenium.sndevops.xyz:4444/wd/hub"),
                DesiredCapabilities.firefox());
		
        //Launch the Online Store Website
		driver.get("http://www.google.com");
		
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website google.com");
        assertEquals(driver.getTitle(), "Yahoo");
        
		//Wait for 5 Sec
		Thread.sleep(5000);
		
        // Close the driver
        driver.quit();
	}*/

}

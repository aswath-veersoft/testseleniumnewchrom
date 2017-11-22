package test.java.com.vs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.TestCase;

public class GoogleSearchTest extends TestCase {
	
	public void testNewChrome() {
	    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");;
	    
	    // Create object of ChromeOptions class
	    ChromeOptions options = new ChromeOptions();
	     
	    // add parameter which will disable the extension
	    options.addArguments("--disable-extensions");
	    
	    WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("http://google.com");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		driver.quit();
	}

}

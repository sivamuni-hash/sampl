package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGFirst {

	/**
	 * @param args
	 */
	@BeforeTest
	
	public void methodBefore(){
		
	System.out.println("Before test case");
	}
	
	@Test
	public void beforeMethod(){
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		dc.setCapability("initialBrowserUrl", "www.facebook.com");				
		System.setProperty("webdriver.ie.driver", "E://IE//IEDriverServer_64Bit.exe");
		WebDriver driver = new InternetExplorerDriver(dc);
		
	}
}

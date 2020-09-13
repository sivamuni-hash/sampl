import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Day5 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		dc.setCapability("initialBrowserUrl", "www.facebook.com");
				
		System.setProperty("webdriver.ie.driver", "E://IE//IEDriverServer_64Bit.exe");
		WebDriver driver = new InternetExplorerDriver(dc);
		//driver.manage().
		//driver.get("http://atgtraining.com");
		
	}

}

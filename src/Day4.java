import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Day4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*WebDriver driver = new InternetExplorerDriver();
		driver.get("http://atgtraining.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());*/
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		dc.setCapability("initialBrowserUrl", "www.facebook.com");
				
		System.setProperty("webdriver.ie.driver", "E://IE//IEDriverServer_64Bit.exe");
		WebDriver driver = new InternetExplorerDriver(dc);
		//driver.get("http://atgtraining.com");
		
		/*driver.manage().timeouts().implicitlyWait(5,siva);
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.textToBePresentInElement(locator, text))
		*/
		}
	

}

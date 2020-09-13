import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DropDown {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "E://IE//IEDriverServer_64Bit.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.goindigo.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[contains(text(),'Round Trip')]")).click();
		System.out.println(driver.findElement(By.xpath(".//*[contains(text(),'One Way')]")).isSelected());
		//.//*[contains(text(),'Round Trip')]
	}

}

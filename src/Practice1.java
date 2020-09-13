import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice1 extends Super1 {
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver",
				"C://Users//SIVAMUNI//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		*/
		Super1 sss= new Super1();
		driver=sss.getDriver();
		driver.get("https://www.google.com");
		org.openqa.selenium.support.ui.Select s= new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath(".//*[@value='Google Search']")));
		//get.get("https://www.google.com");
		s.getOptions();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(.//*[@class='gsfi'])[1]")).sendKeys("NTR");
		driver.findElement(By.xpath(".//*[@value='Google Search']")).click();
		driver.close();
	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Super1 {
	public static WebDriver driver;

	public Super1() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//SIVAMUNI//Downloads//chromedriver.exe");
		driver = new ChromeDriver();

	}
	public static WebDriver getDriver(){
		if(driver==null){
			driver=new ChromeDriver();
			return driver;
		}else{
		return driver;
		}
		
	}

}

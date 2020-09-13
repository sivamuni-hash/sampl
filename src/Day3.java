import com.google.common.collect.Sets.SetView;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


public class Day3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Selenium selenium = new DefaultSelenium("localhost", 4444, "firefox", "http://www.google.com");
 selenium.start();
 selenium.open("/");
 selenium.windowMaximize();
 
 selenium.type("id=Ist-ib", "serach for selenium");


selenium.click("name =btnG");
		
	}

}

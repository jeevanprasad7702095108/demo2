package mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class accessflipkartonline {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chrome-win32");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	}

}

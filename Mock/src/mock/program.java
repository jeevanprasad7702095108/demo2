package mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class program {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chrome-win32.chrome.exe");
		ChromeOptions co=new ChromeOptions();
		 co.setBinary("E:\\selenium folder\\chromedriver-win32.chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}

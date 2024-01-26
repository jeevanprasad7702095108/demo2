package mock;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		Dimension d=new Dimension(200,200);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p=new Point(200,200);
		driver.manage().window().setPosition(p);
		

	}

}

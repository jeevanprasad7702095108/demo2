package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement element=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	element.sendKeys("iphone11");
	element.submit();
	}

}

package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access_flipkartt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone11");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String product=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 64 GB)']")).getText();
		System.out.println(product);
		
		
	}

}

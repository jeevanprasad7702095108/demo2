package mock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allproduct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone11");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	List<WebElement> product=driver.findElements(By.xpath("//div[@class='_4rR01T']/../../div[2]/div//div[@class='_30jeq3 _1_WHN1']"));
	for(WebElement data:product)
	{
		System.out.println(data.getText()+"--------"+data.getText());
	}
		
	}

}

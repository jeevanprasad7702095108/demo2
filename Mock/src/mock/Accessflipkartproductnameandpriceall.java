package mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accessflipkartproductnameandpriceall {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone11");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> product=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> price=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for(int i=0;i<=product.size()-1;i++)
		{
			System.out.println(product.get(i).getText()+' '+price.get(i).getText());
		}

	}

}

package mock;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		element.sendKeys("iphone11");
		element.submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']")).click();
		Set<String> parentid=driver.getWindowHandles();
		for(String id:parentid)
		{
			//System.out.println("parent id"+id);
			
			String a=driver.switchTo().window(id).getTitle();
			//System.out.println(a);
			
		}
		
		

	}

}

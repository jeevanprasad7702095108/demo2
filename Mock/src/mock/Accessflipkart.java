package mock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accessflipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Navigation nav=driver.navigate();
		
		//driver.navigate().to("https://www.amazon.in/");
		//driver.navigate().to("https://www.flipkart.com/");
		//nav.back();
		//nav.forward();
		//nav.refresh();
		//driver.close();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		//element.sendKeys("iphone");
		//element.submit();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		

	}

	}
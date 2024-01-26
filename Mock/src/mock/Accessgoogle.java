package mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accessgoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
		element.sendKeys("viratkohli");
		List<WebElement> product=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		Thread.sleep(2000);
		for(WebElement ref:product)
		{
			String element1=ref.getText();
			System.out.println(element1);
		}
		//element.submit();

	}
}

package mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestionhandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("software");
		List<WebElement> element=driver.findElements(By.xpath("(//div[@class='OBMEnb'][1])/ul/li"));
		for(WebElement data:element)
		{
			
		String a=data.getText();
		System.out.println(a);
		}
		


	}

}

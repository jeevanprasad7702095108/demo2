package mock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datafromnotepad {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("E:\\datafromnotepad.txt");
		Properties pobj=new Properties();
		pobj.load(fis);
		String username=pobj.getProperty("user");
		String password=pobj.getProperty("password");
		String url=pobj.getProperty("url");
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		System.out.println("url:"+url);
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		
		
	}
	
	

}

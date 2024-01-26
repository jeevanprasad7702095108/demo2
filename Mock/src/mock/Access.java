package mock;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Access {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("jeevan");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kompally");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("engineer");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jeevan@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("123454678910");
		driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		WebElement element1=driver.findElement(By.xpath("//div[@id='msdd']"));
		element1.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement element=driver.findElement(By.xpath("//select[@type='text'][1]"));
		Select a=new Select(element);
		a.selectByIndex(40);
		System.out.println(a.getOptions().size());
		driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();
		
		//Robot r=new Robot();
		
		
		
	}

}



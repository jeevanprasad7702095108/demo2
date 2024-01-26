package mock;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		//String parentid=driver.getWindowHandle();//it return only one window id
		//System.out.println(parentid);
		Set<String> id=driver.getWindowHandles();//it return the multiple browser id's
		Iterator it=id.iterator();
		String parentid=(String) it.next();
		String childid=(String) it.next();
		System.out.println(parentid);
		System.out.println(childid);
		//driver.switchTo().window(parentid);//how to use window id's for switching
		//System.out.println("parent window id:"+driver.getTitle());
		//driver.switchTo().window(childid);
		//System.out.println("child window id:"+driver.getTitle());
		for(String winid:id)//for each
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
			
		}
		
		
		
		
		
		
		
		
		
		
		//System.out.println(childid);
		
		
	}

}

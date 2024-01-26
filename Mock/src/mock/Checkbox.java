package mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		//driver.findElement(By.xpath("//input[@id='monday']")).click();//click only specific element
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));//click all check box
		//for(int i=0;i<checkbox.size();i++)
		//{
			//checkbox.get(i).click();
		//}
		//for(WebElement checkb:checkbox)//click only monday and sunday
		//{
			//String checkboxname=checkb.getAttribute("id");
			//if(checkboxname.equals("monday")||checkboxname.equals("sunday"))
			//{
				//checkb.click();
			//}
		//}
		int totalcheckbox=checkbox.size();//click only last two elements
		//for(int i=totalcheckbox-2;i<totalcheckbox;i++)
		//{
			//checkbox.get(i).click();
		//}
		for(int i=0;i<totalcheckbox;i++)
		{
			if(i<2)
			{
				checkbox.get(i).click();
			}
		}
	}

}




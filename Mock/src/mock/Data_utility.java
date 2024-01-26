package mock;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Data_utility {

	public String getdatafromproperties(String data) throws IOException{
		FileInputStream fis=new FileInputStream("E:\\datafromnotepad.txt");
		Properties pobj=new Properties();
		pobj.load(fis);
		String a=pobj.getProperty(data);
		return a;

	}

}
class Baseclassutility
{
	WebDriver driver;
	Data_utility du=new Data_utility();
	@BeforeClass
	public void launchbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println(du.getdatafromproperties("username"));
		System.out.println(du.getdatafromproperties("password"));
		System.out.println(du.getdatafromproperties("url"));
		driver.get(du.getdatafromproperties("url"));
		
		
	}

public void login()
{
	
}
}

package mock;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandlingcalander {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("MM//dd/yy");
		String modifiedDate=sdf.format(d);
		System.out.println(modifiedDate);
		
		
		
		
		
		
	}

}

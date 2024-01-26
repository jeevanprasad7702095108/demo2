package mock;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nopcommerce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		Set<Cookie> cookiesobj=driver.manage().getCookies();//how to capture cookies from browser
		System.out.println("size of cookies:"+cookiesobj.size());
		for(Cookie cookies:cookiesobj)//how to print cookies details
		{
			System.out.println(cookies.getName()+"--"+cookies.getValue());
		}
		Cookie cookies=new Cookie("cookie1","12345678910");//how to add cookies to the browser
		driver.manage().addCookie(cookies);
		Set<Cookie> cookie=driver.manage().getCookies();
		System.out.println("size of cookies:"+cookie.size());
		driver.manage().deleteCookie(cookies);//how to delete cookies
		Set<Cookie> cookiesobject=driver.manage().getCookies();
		System.out.println("size of cookies:"+cookiesobject.size());
		driver.manage().deleteCookieNamed("cookie1");
		driver.manage().deleteAllCookies();
		cookiesobj=driver.manage().getCookies();
		System.out.println("size of cookies:"+cookiesobj.size());
		
		
	}

}

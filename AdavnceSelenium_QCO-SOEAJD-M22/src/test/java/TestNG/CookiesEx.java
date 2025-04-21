package TestNG;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesEx {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Set<Cookie> cookies = driver.manage().getCookies();
	
		for (Cookie cookie : cookies)
		{
			System.out.println("cookies name="+cookie.getName()+"\t"+"value= "+cookie.getValue());
		}
	
	driver.manage().deleteAllCookies();
	if(driver.manage().getCookies().isEmpty())
		
	{
		System.out.println("cookies cleared");
	}
	else
	{
		System.out.println("Cookies not cleared");
	}
	}

}

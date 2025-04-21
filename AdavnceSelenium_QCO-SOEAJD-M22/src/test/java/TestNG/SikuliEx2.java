package TestNG;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliEx2 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");

		Screen scr = new Screen();

		Pattern ele1 = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\maxiScreen.png");
		scr.click(ele1);

		Pattern ele = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\ELe1.png");
		scr.click(ele);

		Pattern ele2 = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\bar12.png");
		scr.type(ele2, "iphone");

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

	}

}

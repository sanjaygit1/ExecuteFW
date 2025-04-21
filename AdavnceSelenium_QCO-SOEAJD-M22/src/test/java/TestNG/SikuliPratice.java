package TestNG;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliPratice {

	public static void main(String[] args) throws Throwable {

   Screen scr = new Screen();

   Pattern miniBar = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\imgMiniBar.png");
   scr.click(miniBar);
	
	
	Pattern searchBar = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\ImgSearch.png");
	scr.type(searchBar, "paint");
	
	Robot rob = new Robot();
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	Pattern ele = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\imgELe.png");
	scr.click(ele);
	
	Pattern page = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\imgPage1.png");
	scr.type(page, "QSPIDERS");
	
	
	
	}

}

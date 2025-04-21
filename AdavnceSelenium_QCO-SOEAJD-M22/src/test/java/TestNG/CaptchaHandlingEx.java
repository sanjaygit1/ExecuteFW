package TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.sourceforge.tess4j.Tesseract;

public class CaptchaHandlingEx {

	public static void main(String[] args) throws Throwable {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");

		driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();

		WebElement captcha = driver.findElement(By.xpath("//img[@class='captcha-img']"));

		TakesScreenshot ts = (TakesScreenshot) captcha;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./captcha.png");
		FileUtils.copyFile(src, dest);

		// tess4j download
		Tesseract tss = new Tesseract();
		
		 tss.setDatapath("C:\\Users\\Shobha\\Downloads\\Tess4J-3.4.8-src (6)\\Tess4J\\tessdata");
		 String img = tss.doOCR(dest);
		String captchaimg = img.replace(" ", "");
	
		driver.findElement(By.id("captcha")).sendKeys(captchaimg);
		System.out.println(captchaimg);
	}

}

package miniproject_OrangeHRM.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class OrangeHRM_Requirements {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("Vasanthi");
		driver.findElement(By.name("middleName")).sendKeys("S");
		driver.findElement(By.name("lastName")).sendKeys("Harish");
		
		driver.findElement(By.xpath("//div[@tabindex='0']")).click();
		Thread.sleep(2000);		
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@placeholder='Type here'])[1]")).sendKeys("vasanthi1409@gmail.com");
		driver.findElement(By.xpath("(//input[@placeholder='Type here'])[2]")).sendKeys("6369920818");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter comma seperated words...']")).sendKeys("JAVA, JS, HTML");
		driver.findElement(By.xpath("//textarea[@placeholder='Type here']")).sendKeys("OrangeHRMDemo");
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(20000);
				
		TakesScreenshot ts = (TakesScreenshot) driver;
		File SRC = ts.getScreenshotAs(OutputType.FILE);
		File DES = new File("C:\\Users\\inbaraj\\eclipse-workspace\\Selenium_Demo\\src\\miniproject_OrangeHRM\\com\\Addrec_capture.png");
		FileUtils.copyFile(SRC, DES);
		
	}

}

package miniproject_OrangeHRM.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class OrangeHRM_Adduser {

		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window() .maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Admin']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()=' Add ']")).click();		
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//div[@tabindex='0'])[1]")).click();
			Thread.sleep(2000);
			
			Robot R = new Robot();
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyRelease(KeyEvent.VK_DOWN);
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyRelease(KeyEvent.VK_DOWN);
			R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ravi");
			Thread.sleep(4000);
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyRelease(KeyEvent.VK_DOWN);
			R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.xpath("(//div[@tabindex='0'])[2]")).click();
			Thread.sleep(2000);
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyRelease(KeyEvent.VK_DOWN);
			R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]")).sendKeys("vasanthiSHarishS@123");
			driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("Harish@123");
			driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("Harish@123");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			Thread.sleep(20000);
			
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("vasanthiSHarishS@123");
			
			driver.findElement(By.xpath("(//div[@tabindex='0'])[1]")).click();
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyRelease(KeyEvent.VK_DOWN);
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyRelease(KeyEvent.VK_DOWN);
			R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ravi");
			Thread.sleep(4000);
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyRelease(KeyEvent.VK_DOWN);
			R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.xpath("(//div[@tabindex='0'])[2]")).click();
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyRelease(KeyEvent.VK_DOWN);
			R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,100)");
			Thread.sleep(2000);
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File SRC = ts.getScreenshotAs(OutputType.FILE);
			File DES = new File("C:\\Users\\inbaraj\\eclipse-workspace\\Selenium_Demo\\src\\miniproject_OrangeHRM\\com\\Adduser_capture.png");
			FileUtils.copyFile(SRC, DES);
			
	}

}

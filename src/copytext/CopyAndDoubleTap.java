package copytext;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndDoubleTap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/edit");

		WebElement rr = driver.findElement(By.id("fullName"));
		rr.sendKeys("Shoe");

		Thread.sleep(2000);

		Actions act = new Actions(driver);

		// act.keyDown(Keys.CONTROL);
		// act.sendKeys("a");
		// act.keyUp(Keys.CONTROL);      // Copy all text without double tap
		// act.build().perform();

		act.doubleClick(rr).build().perform();  // directly double tap and copy.
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();

		Thread.sleep(2000);

		driver.findElement(By.id("join")).click();
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		WebElement ff= driver.findElement(By.linkText("Work-Space"));
         
		Actions at= new Actions(driver);
		at.contextClick(ff).build().perform();
		
		
	}

}

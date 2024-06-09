package framework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameModel {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		WebElement dd=driver.findElement(By.xpath("//input[@name='fname']"));
		dd.sendKeys("Hari");
		
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Haran");
		*/
		/* 
		 		driver.get("https://www.demo.co-vin.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//WebElement ff= driver.findElement(By.xpath("//h1[contains(text(),'Get Vaccinated ')]"));
		//js.executeScript("arguments[0].scrollIntoView();",ff);
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		
		WebElement state=driver.findElement(By.id("mat-select-4"));
		state.click();
		
		WebElement uu=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),' Tamil Nadu ')]"));
		uu.click();
		
		Thread.sleep(2000);
		
		WebElement city=driver.findElement(By.xpath("//mat-select[@id='mat-select-6']"));
		city.click();
		
		Thread.sleep(2000);
		
		WebElement hn=driver.findElement(By.xpath("//span[text()=' Madurai ']"));
		hn.click();
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		JavascriptExecutor js2= (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0 1500)");
		 */
		
		
		
	
		
		

		
		
		
		

	
	
		
		
		
	}

}

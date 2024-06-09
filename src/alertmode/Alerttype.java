package alertmode;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttype {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");	
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(1000);	
		Alert ar=driver.switchTo().alert();
		ar.accept();
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(1000);
		Alert as=driver.switchTo().alert();
		as.dismiss();
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert ad=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(ad.getText());
		ad.sendKeys("hello");
		ad.accept(); 
		
		driver.quit(); 
		
		
		
		
		
			
		}  
			
		
		
	}



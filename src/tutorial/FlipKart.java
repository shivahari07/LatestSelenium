package tutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("flipkart"+Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();

		
		driver.findElement(By.xpath("//div[@aria-label='Fashion']")).click();
		driver.findElement(By.xpath("//a[text()='Men Footwear']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
		
		WebElement ra=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select"));
		Select sa= new Select(ra);                
		sa.selectByValue("10000");
		WebElement am=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select"));
		Select se= new Select(am);
		se.selectByValue("30000");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement dw=driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 5s (Gold, 16 GB)')]"));
		js.executeScript("arguments[0].scrollIntoView();",dw);
		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[8]")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[8]/div[2]/div/div[2]/div/label")).click();
		List<WebElement> df=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(df.size());
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[8]")).click();
		
		
		
		
		
		
		
		
		
		
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//WebElement dw=driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 5s (Silver, 16 GB)')]"));
		//js.executeScript("arguments[0].scrollIntoView();",dw);
		//js.executeScript("window.scrollBy(0,2000)");
		

		
		
		
		
		
		
		
		

	}

}

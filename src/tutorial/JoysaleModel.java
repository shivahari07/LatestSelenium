package tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JoysaleModel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    driver.get("https://joysale.appkodes.in/");
	    
	    String old = driver.getWindowHandle();
	    
	    WebElement mm=driver.findElement(By.xpath("//a[text()='Electronics']"));
	    mm.click();
	    
	   driver.findElement(By.linkText("Sell")).click();
	   
	   driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div[2]/a")).click();
	    
	   JavascriptExecutor ja= (JavascriptExecutor) driver;
	   ja.executeScript("window.scrollBy(0,2500)");
	   
	   WebDriverWait wait=new WebDriverWait(driver, 20);
	   WebElement rt=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[20]/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[1]/a")));
	   rt.click();
	   
	  
	   ja.executeScript("window.scrollBy(0,400)");
	 //  ja.executeAsyncScript("arguments[0].scrollIntoView();",ee);
	   WebElement ee=driver.findElement(By.xpath("//a[text()='Details']"));
	   ee.click();
	   driver.navigate().back();
	   
	   driver.findElement(By.xpath("//a[text()='Fashion']")).click();
	   driver.findElement(By.xpath("//div[@class='item-img productimage filter-img']//span[text()='2 years ago']")).click();
	  
	   Set<String> nm=driver.getWindowHandles();
	   for (String win1 : nm) {
		driver.switchTo().window(win1);
	}
	   JavascriptExecutor js= (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,400)");
	   driver.findElement(By.xpath("//a[text()='Details']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[text()='Comments']")).click();
	   WebElement box=driver.findElement(By.xpath("//textarea[@id='comment']"));
	   box.sendKeys("A paragraph is defined as “a group of sentences or a single sentence that forms a unit” (Lunsford and Connors 116).");
	   
	   driver.findElement(By.xpath("//div[contains(@class,'seller-name col-xs-12')]//a[text()='karthika']")).click();

	   driver.findElement(By.xpath("//a[text()='Recent Activities']")).click();
	   
	   driver.findElement(By.xpath("//li[@id='follow_active']//a[@id='followerclk']")).click();
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//a[@id='followingclk']")).click();
	   driver.navigate().back();
	   
	   driver.findElement(By.xpath("//*[@id=\"sn-bar__inner-wrap\"]/li[1]/span/a/img")).click();
	   
	   driver.findElement(By.xpath("//span[@class='for-sale-heading filters-title' and text()='Category']")).click();
	   
	   js.executeScript("window.scrollBy(0,1500)");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//div[@class='load-more-icon']")).click();

	   
	   driver.findElement(By.xpath("//*[@id=\"fh5co-board\"]/div[2]/div[13]/div/div/div/a/div/img")).click();
	   Set<String> ne2=driver.getWindowHandles();
	   for (String nw2 : ne2) {
		driver.switchTo().window(nw2);
	}
	   js.executeScript("window.scrollBy(0,400)");
	   driver.findElement(By.xpath("//a[text()='Details']")).click();
	   Thread.sleep(1000);
	   js.executeScript("window.scrollBy(0,3000)");
	   
	   WebElement la=driver.findElement(By.id("language_select"));
	   Select ss= new Select(la);
	   ss.selectByValue("fr");
	   
	   List<String>jj= new ArrayList<String>(ne2);
	   driver.switchTo().window(jj.get(0));
	   
	   driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div[2]/a/img")).click();
	    
	   
	}

}

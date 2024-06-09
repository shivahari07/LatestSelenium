package pratical;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PraticesMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String old=driver.getWindowHandle();
    driver.get("https://gardencatch.com/");
    driver.findElement(By.xpath("//div[@class='dropdowns cust_select']")).click();
    List<WebElement> tot=driver.findElements(By.xpath("//ul[@class='list-unstyled']"));
    System.out.println(tot.size());
    Thread.sleep(2000);
    driver.findElement(By.xpath("//li[@data-value='Product']")).click();
    
    Actions ac= new Actions(driver);
    WebElement ff=driver.findElement(By.xpath("//div[@class='columncls']/descendant::a[text()='Herbal Wine Making Workshop']"));
    ac.keyDown(Keys.CONTROL).contextClick(ff).click().perform();
    
   Set<String> nww= driver.getWindowHandles();
	List<String> man= new ArrayList<String>(nww);
	driver.switchTo().window(man.get(1));
	
	driver.findElement(By.xpath("//a[@id='reportflag']")).click();
	driver.findElement(By.xpath("//a[@id='reportflagcancel']")).click();
	WebElement dr=driver.findElement(By.xpath("//a[text()='Natural soda demonstration']"));
	dr.click();
	//ac.keyDown(Keys.CONTROL).contextClick(dr).click().perform();
	
	
}
    
     
	
}
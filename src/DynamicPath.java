import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	/*	driver.get("https://www.leafground.com/table.xhtml");
		
		List<WebElement> tot= driver.findElements(By.xpath("//table[@role='grid']//tr/td"));
		System.out.println(tot.size());
		
		
		
		WebElement rt= driver.findElement(By.xpath("//span[text()='Amy Elsner']/ancestor::td/preceding-sibling::td[1]//span[3]"));
	    System.out.println(rt.getText());
	    
	    WebElement dr=driver.findElement(By.xpath("//span[text()='Elwin Sharvill']/ancestor::td/preceding-sibling::td[1]//span[3]"));
	    System.out.println(dr.getText()); */
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
		
//WebElement dd= driver.findElement(By.xpath("//div[@data-id='MOBGTAGPYYWZRUJX']/descendant::div[13]/parent::div/following-sibling::div/descendant::div[3]"));
		//dd.click();   // This Xpath is based on Block of full Iphone like[First phone, Scecond phone]
		
     WebElement ff= driver.findElement
   (By.xpath("//div[contains(text(),'Apple iPhone 15 (Pink, 128 GB)')]/parent::div/following-sibling::div/descendant::div[text()='₹65,999']"));
		ff.click();
		
		//Explict wait
		/*WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='h_2']//a[text()='Bed']"))).click();
		*/

	}

}

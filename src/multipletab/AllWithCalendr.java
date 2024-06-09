package multipletab;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AllWithCalendr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/");
		String rr=driver.getWindowHandle();
		System.out.println(rr);
		WebElement yy=driver.findElement(By.linkText("Selenium Practice"));
		Actions ac=new Actions(driver);
		ac.moveToElement(yy).build().perform();
		
		driver.findElement(By.linkText("Window Handles")).click();
				Thread.sleep(2000);
		driver.findElement(By.id("newWindowBtn")).click();
		//------------------New Window
		Set<String>ne=driver.getWindowHandles();
		Thread.sleep(2000);
		for (String ne1 : ne) {
			driver.switchTo().window(ne1);
		System.out.println(ne1);
		driver.manage().window().maximize();
		}
		WebElement yp=driver.findElement(By.linkText("Selenium Practice"));
		Actions at=new Actions(driver);
		ac.moveToElement(yp).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Dropdowns")).click();
		
		WebElement dp=driver.findElement(By.id("course"));
		Select ss= new Select(dp);
		List<WebElement>db=ss.getOptions();
		for (WebElement fg : db) {
			String sa=fg.getText();
			if(sa.equals("Dot Net")) {
				fg.click();
				break;
			}
			
		}
		
		driver.close();
		
		driver.switchTo().window(rr);
		
		driver.findElement(By.id("newTabBtn")).click();
		
		Set<String>ne1=driver.getWindowHandles();
		for (String put : ne1) {
			driver.switchTo().window(put);
		}
		
		WebElement ym=driver.findElement(By.linkText("Selenium Practice"));
		Actions ac2=new Actions(driver);
		ac.moveToElement(ym).build().perform();
		
		driver.findElement(By.linkText("Calendars Practice")).click();
		
		driver.findElement(By.id("third_date_picker")).click();
		
		WebElement three=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sd=new Select(three);
		sd.selectByVisibleText("Aug");
		Thread.sleep(2000);
		WebElement yr=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sf= new Select(yr);
		sf.selectByValue("2015");
		Thread.sleep(1000);
		List<WebElement>dy=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for (WebElement ind : dy) {
			if(ind.getText().equals("24")){
				ind.click();
				break;
			}
		}
				
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ry=driver.findElement(By.xpath("//td[text()='Fourth Date']"));
		js.executeScript("arguments[0].scrollIntoView();", ry);
		Thread.sleep(1000);
		
		driver.findElement(By.id("first_date_picker")).click();
		
		String month="May";
		String years="2019";
		String dd="30";
		
		while(true) {
			
			String ro=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			 String[] arr=ro.split(" ");
			    String mon=arr[0];
			    String yrs=arr[1];
			    
			   if(mon.equals(mon) && yrs.equals(years)) {
				   break;
			   }
			   else {
				   driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();
			   }
		}
		
		List<WebElement> ds=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for (WebElement li : ds) {
			if(li.getText().equals(dd)) {
				li.click();
				break;
			}
		}
		
	}

}

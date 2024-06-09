package calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//img[@title='Calendar-icon']")).click();
	   String mon="July";
	   String yea="2024";
	   String date="15";
	   
	  
	   
	   while(true) {
		   Thread.sleep(2000);
		  String rr=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	       String arr[]=rr.split(" ");
	      
		    String month=arr[0];
		    String year=arr[1];
		     
		    if(month.equals(mon) &&year.equals(yea)) {
		    	break;
		    }
		    else {
		    	driver.findElement(By.xpath("//a[@title='Next']")).click();
		    }
	   }
		List<WebElement>dd= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		 for (WebElement ele : dd) {
			String ra=ele.getText();
			if(ra.equals(date)) {
				ele.click();
				break;
			}
		}
		 
		 
	}

}

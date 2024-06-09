package alertmode;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class letcode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//ChromeOptions options= new ChromeOptions();
		//options.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

         WebDriver driver= new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.get("https://letcode.in/test");
         
         WebElement sel= driver.findElement(By.linkText("Drop-Down"));
         sel.click();
         
         WebElement dr1=driver.findElement(By.id("fruits"));
         Select se= new Select(dr1);
         List<WebElement>op=se.getOptions();
         System.out.println("Enter how many options "+op.size());
         for (WebElement web : op) {
        	if( web.getText().equals("Orange")) {
        		web.click();
        		break;
        	}
			
		}
         Thread.sleep(2000);
         
        WebElement ff=driver.findElement(By.id("superheros"));
        Select dd= new Select(ff);
            List<WebElement>dr2= dd.getOptions();
            System.out.println("Enter how many options are in 2nd drop down"+dr2.size());
           for (WebElement spa : dr2) {
        	   String dt=spa.getText();
        	  if(dt.equals("Batman") ||dt.equals("Captain America") ||dt.equals("Doctor Strange")) {
        		  spa.click(); 
        	   }
			
		}  
           
           Thread.sleep(2000);
           
           driver.navigate().back();
           
           driver.findElement(By.linkText("Dialog")).click();
           
           WebElement singlepop= driver.findElement(By.xpath("//button[@class='button is-link']"));
           singlepop.click();
           Thread.sleep(2000);
           Alert al1=driver.switchTo().alert();
           al1.accept();
           
          WebElement confirm= driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
          confirm.click();
          Thread.sleep(2000);
          Alert al2=driver.switchTo().alert();
          al2.dismiss();
          
          driver.findElement(By.xpath("//button[@id='prompt']")).click();
          Thread.sleep(2000);
          Alert al3=driver.switchTo().alert();
          al3.getText();
          al3.sendKeys("Hello");
          al3.dismiss();
          
          driver.navigate().back();
          
          WebElement fd=driver.findElement(By.xpath("//p[text()=' Forms ']"));
          
          JavascriptExecutor js= (JavascriptExecutor)driver;
          js.executeScript("arguments[0].scrollIntoView();",fd);
           
     
         
           
         
      
	}
	
	

}

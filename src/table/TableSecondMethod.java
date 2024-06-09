package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TableSecondMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/test");
		
		WebElement link1=driver.findElement(By.linkText("Courses"));
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		
		act.moveToElement(link1).build().perform();
		Thread.sleep(2000);
		
		WebElement link2= driver.findElement(By.linkText("Grooming"));
		act.moveToElement(link2).build().perform();
		
		driver.findElement(By.linkText("Work-Space")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1600)");
		
		driver.findElement(By.linkText("Simple table")).click();
		
		driver.get("https://letcode.in/table");
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		WebElement rr=driver.findElement(By.xpath("//label[text()='Sortable Tables']"));
		js1.executeScript("arguments[0].scrollIntoView();",rr);
		
		List<WebElement> table=driver.findElements(By.xpath("//table[contains(@class,'mat-sort table')]//tr/td"));
		System.out.println("Total number of rows and coloumn - "+table.size());
		
		List<WebElement> heading=driver.findElements(By.xpath("//table[contains(@class,'mat-sort table')]/thead/th"));
		System.out.println("Enter total heading "+ heading.size());
		
		 WebElement sp=driver.findElement(By.xpath("//table[contains(@class,'mat-sort table')]//tr[3]/td[4]"));
		 System.out.println("Get the text and value from table - "+sp.getText());
		
		List<WebElement> only =driver.findElements(By.xpath("//table[contains(@class,'mat-sort table')]//thead/th"));
		for (WebElement web : only) {
			String rt=web.getText();
			System.out.print(rt);
			
		}
		System.out.println();
		System.out.println("-------------------");
		
		
		  List<WebElement> tables=driver.findElements(By.xpath("//table[contains(@class,'mat-sort table is-bordered')]//tr/td"));
		    System.out.println(tables.size());
		    int rows = tables.size();
		    
		    List<WebElement> head=driver.findElements(By.xpath("//table[contains(@class,'mat-sort table is-bordered')]//thead/th"));
		    System.out.println(head.size());
		    int cols = head.size();
		    
		    for(int i=1; i<=rows; i++) {
		    	for(int j=1; j<=cols; j++) {
		    	WebElement dd=driver.findElement(By.xpath("//table[contains(@class,'mat-sort table is-bordered')]//tr["+ i +"]/td["+ j +"]"));
		    	System.out.print(dd.getText());
		    	System.out.print(" ");
		    	}
		    	System.out.println();
		    }
		    
		    

}
}
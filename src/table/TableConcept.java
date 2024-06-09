package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://leetcode.com/tag/hash-table");
		
		Thread.sleep(2000);
		List<WebElement> total=driver.findElements(By.xpath("//table[@class='table table__XKyc']/tbody/tr/td"));
			System.out.println("Total number of rows and coloum in table "+ total.size());
			
			 List<WebElement> cl=driver.findElements(By.xpath("//table[@class='table table__XKyc']/tbody/tr"));
			  System.out.println("Total number of column - "+cl.size());  // Another way to print size by using List
			  
			
			Thread.sleep(2000);
		  
		  WebElement heading= driver.findElement(By.xpath("//table[@class='table table__XKyc']/thead/tr[1]/th[3]"));
			System.out.println("Print the heading - "+heading.getText());

		  Thread.sleep(2000);
	    WebElement single= driver.findElement(By.xpath("//table[@class='table table__XKyc']/tbody/tr[2]/td[3]"));
		System.out.println("Print the pointing columns - "+single.getText());
		
		int head=driver.findElements(By.xpath("//table[@class='table table__XKyc']//thead/tr/th")).size();
		  System.out.println("Total number of heading in table "+ head);
		  
		int col= driver.findElements(By.xpath("//table[@class='table table__XKyc']/tbody/tr")).size();
		System.out.println("Total number of coloumn "+col);
		
		
		
		WebElement tt=driver.findElement(By.xpath("//td[normalize-space()='Roman to Integer']//following::td[1]"));
		String has=tt.getText();
		System.out.println("find percentage - "+has);
	 
		 Thread.sleep(5000);
		  for(int r=1;r<=head;r++) {
			  for(int c=1; c<=col; c++) {
				String cx=  driver.findElement(By.xpath("//table[@class='table table__XKyc']//tr["+r+"]/td["+c+"]")).getText();
				System.out.println("The value"+cx);
			  }
			
		  }
		  
	}

}

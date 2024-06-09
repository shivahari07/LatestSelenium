package tutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MiniProject {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String old = driver.getWindowHandle();
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		driver.findElement(By.id("menuform:j_idt40")).click();
		
		WebElement li=driver.findElement(By.xpath("//li[@id='menuform:m_input']/a"));
		li.click();
		
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Hariharan Shiva Guru");
		Actions ac= new Actions(driver);
		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	    ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	    
	    driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
	    driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).click();
	    ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		/*driver.findElement(By.xpath("//button[@aria-label='Show Calendar']")).click();
		
		String month="July";
		String year="2023";
		String day="15";
		
		while(true) {
			
			String tt=driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-header')]")).getText();
			
			    String[] arr=tt.split(" ");
			    String mon=arr[0];
			    String yr=arr[1];
			   if(mon.equals(month) &&(yr.equals(year))){
				   break;
			   }
			   else {
				   driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();
			   }                               
		}
	     List<WebElement>dy=driver.findElements(By.xpath("//div[@class='ui-datepicker-calendar-container']//tr/td"));
	     for (WebElement pick : dy) {
			if(pick.getText().equals(day)){
				pick.click();
				break;
			}
		}
			*/
	     driver.findElement(By.id("menuform:j_idt38")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.id("menuform:m_link")).click();
	     
	     driver.findElement(By.linkText("How many links in this page?")).click();
		
		
		List<WebElement> tb=driver.findElements(By.xpath("//div[@class='ui-datatable-tablewrapper']//table/tbody/tr/td"));
		System.out.println(tb.size());
		
		List<WebElement> hed=driver.findElements(By.xpath("//div[@class='ui-datatable-tablewrapper']//thead/tr/th"));
		System.out.println(hed.size());
		for (WebElement tet : hed) {
			System.out.print(tet.getText());
			
		}
		
		System.out.println();
		
		WebElement ro=driver.findElement(By.xpath("//div[@class='ui-datatable-tablewrapper']//tr[3]/td[6] "));
		System.out.println("Category for blue brand - "+ro.getText());
		
		
		
		driver.findElement(By.id("form:j_idt90")).click();
		driver.findElement(By.id("form:name")).sendKeys("Mahi");
		driver.findElement(By.id("form:description")).sendKeys("Quality and Offered price");
		
		List<WebElement>rd=driver.findElements(By.xpath("//div[@class='ui-g']"));
		System.out.println("Total Radio button = "+rd.size());
		
		driver.findElement(By.xpath("//label[text()='Electronics']")).click();
		
		WebElement cl=driver.findElement(By.id("form:price_input"));
		cl.clear();
		cl.sendKeys("300");
		
		WebElement qt=driver.findElement(By.id("form:quantity_input"));
		qt.clear();
		qt.sendKeys("10");
		
		driver.findElement(By.id("form:j_idt153")).click();
		
		
		List<WebElement> tic=driver.findElements(By.xpath("//div[@role='checkbox']"));
		System.out.println("Total check box = "+tic.size());
		
		//driver.findElement(By.id("form:dt-products_1002_checkbox")).click();
		driver.findElement(By.xpath("//a[@aria-label='Page 7']")).click();	
		Thread.sleep(1000);
		driver.findElement(By.id("form:dt-products:globalFilter")).sendKeys("mahi");
		Thread.sleep(1000);
		WebElement at=driver.findElement(By.xpath("//button[@id='form:dt-products:0:j_idt115']"));
		at.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='form:j_idt156']")).click();
		
		driver.findElement(By.xpath("//li[@id='menuform:j_idt38']")).click();
		driver.findElement(By.id("menuform:m_dropdown")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']")).sendKeys("Selenium");
		List<WebElement> gt=driver.findElements(By.xpath("//li[contains(@class,'ui-autocomplete-item')]"));
		 System.out.println("Based on Selenium results - "+gt.size());
	      for (WebElement web : gt) {
			if(web.getText().equalsIgnoreCase("Selenium WebDriver")) {
				web.click();
			}
		}

		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		
		//driver.findElement(By.xpath("//li[@data-label='Tamil']")).click();
		Robot rt= new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
	    rt.keyPress(KeyEvent.VK_DOWN);
	    rt.keyRelease(KeyEvent.VK_DOWN);
	    rt.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt87:country_label")).click();
		List<WebElement>cou=driver.findElements(By.xpath("//li[contains(@class,'ui-selectonemenu-item')]"));
		System.out.println("Total Size of country = "+cou.size());
		driver.findElement(By.xpath("//li[@data-label='India']")).click();
		
		driver.findElement(By.xpath("//li[@id='menuform:j_idt38']")).click();
		driver.findElement(By.id("menuform:m_checkbox")).click();
		Thread.sleep(2000);
		
		WebElement cb=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']"));
	     cb.click();
		
	    driver.findElement(By.id("menuform:j_idt40")).click();
	    
	    driver.findElement(By.id("menuform:m_list")).click();
	    
	    driver.findElement(By.xpath("//div[@class='ui-button ui-button-icon-only ui-state-default']")).click();

	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(1000);
	    
	    WebElement drag=driver.findElement(By.xpath("//li[@data-item-label='San Francisco']"));
	    WebElement drop=driver.findElement(By.xpath("//ul[@aria-label='To']"));
	    Actions acc= new Actions(driver);
	    acc.dragAndDrop(drag, drop).build().perform();
	    
	    driver.findElement(By.id("menuform:j_idt39")).click();
	    driver.findElement(By.id("menuform:m_table")).click();
	    
	   WebElement tt= driver.findElement(By.xpath("//div[contains(@class,'ui-datatable')]//tr[4]/td[3]"));
	    System.out.println("Name of client = "+tt.getText());
	    
	    List<WebElement> row=driver.findElements(By.xpath("//div[contains(@class,'ui-datatable')]//tbody/tr/td"));
	    System.out.println("Total size of rows - "+row.size());
	    int rows=row.size();
	    
	    List<WebElement> col=driver.findElements(By.xpath("//div[contains(@class,'ui-datatable')]//tr/th"));
	    System.out.println("Total size of column - "+col.size());
	    int cols=col.size();
	    
	 /*   for(int i=1; i<=rows; i++) {
	    	for(int j=1; j<=cols; j++) {
	    	WebElement dd=driver.findElement(By.xpath("//div[contains(@class,'ui-datatable')]//tr["+ i +"]/td["+ j +"]"));
	    	System.out.println(dd.getText()+" ");
	    	}
	    	System.out.println();
	    }  */
	    
	    
	    driver.findElement(By.id("menuform:j_idt38")).click();
	    
	    driver.findElement(By.id("menuform:m_window")).click();
	    
	    driver.findElement(By.xpath("//button[@id='j_idt88:new']")).click();
	    
	    Set<String> nee = driver.getWindowHandles();
	    for (String wel : nee) {
			driver.switchTo().window(wel);
		}
	    driver.findElement(By.id("menuform:j_idt40")).click();
	    
	    driver.findElement(By.id("menuform:m_radio")).click();
	    
		driver.findElement(By.id("menuform:j_idt38")).click();
		
		WebElement pp=driver.findElement(By.id("menuform:m_input"));
		Actions ar= new Actions(driver);
		ar.contextClick(pp).click().perform();
		
		Robot rt1= new Robot();
		rt1.keyPress(KeyEvent.VK_DOWN);
		rt1.keyRelease(KeyEvent.VK_DOWN);
		rt1.keyPress(KeyEvent.VK_ENTER);
		rt1.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> nm = driver.getWindowHandles();
		for (String ss : nm) {
			driver.switchTo().window(ss);
		}
		
		driver.findElement(By.id("j_idt88:name")).sendKeys("hari");
		Thread.sleep(2000);
		driver.close();
		Set<String> few = driver.getWindowHandles();
		List<String>women= new ArrayList<String>(few);
		driver.switchTo().window(women.get(0));
		
		if(!women.equals(women)) {
			driver.close();
		}
		
		
	    

	}

}

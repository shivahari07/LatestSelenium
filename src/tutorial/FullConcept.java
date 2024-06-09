package tutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FullConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		WebElement site=driver.findElement(By.name("q"));
		site.sendKeys("hyr tutorials"+Keys.ENTER);
		
		driver.findElement(By.xpath("//h3[text()='H Y R Tutorials - H Y R Tutorials']")).click();
		WebElement li=driver.findElement(By.linkText("Selenium Practice"));
		
		Actions ac= new Actions(driver);
		ac.moveToElement(li).build().perform();
		
		driver.findElement(By.linkText("Basic Controls")).click();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//.executeScript("window.scrollBy(0,1000)");
		WebElement rr=driver.findElement(By.xpath("//b[text()='First Name']"));
		js.executeScript("arguments[0].scrollIntoView();",rr);
		
		WebElement first=driver.findElement(By.id("firstName"));
		first.sendKeys("HariHaran");
		
		Actions act= new Actions(driver);
		
		act.doubleClick(first).build().perform();
		
		Thread.sleep(1000);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("lastName")).click();
		act.keyDown(Keys.CONTROL).sendKeys("v");
		act.keyUp(Keys.CONTROL).build().perform();
		
		WebElement radio=driver.findElement(By.xpath("//input[@id='femalerb']"));
		radio.click();
		
		System.out.println("Point out radio option is selected - "+radio.isSelected());
		
        List<WebElement> check= driver.findElements(By.xpath("//input[@class='bcCheckBox' and contains(@name,'language')]"));
        
		System.out.println("Total number of check box - "+check.size());
		Thread.sleep(2000);
		for (WebElement web : check) {
			String ff=web.getAttribute("id");
			if(ff.equalsIgnoreCase("englishchbx") ||ff.equalsIgnoreCase("chinesechbx")) {
				web.click();
			}
			
		}
		
		driver.findElement(By.id("email")).sendKeys("hari@gmail.com");
		
		WebElement Register=driver.findElement(By.id("registerbtn"));
		Register.click();
		
		WebElement succ=driver.findElement(By.xpath("//label[@id='msg']"));
		System.out.println(succ.getText());
		
		WebElement up=driver.findElement(By.linkText("Selenium Practice"));
		js.executeScript("window.scrollBy(0,-500)");
		
		WebElement um=driver.findElement(By.linkText("Selenium Practice"));
		Actions ss= new Actions(driver);
		ss.moveToElement(um).build().perform();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Dropdowns")).click();
		
		WebElement dr1=driver.findElement(By.id("course"));
		Select sc=new Select(dr1);
		List<WebElement>io=sc.getOptions();
		System.out.println("Option in drop down"+io.size());
		for (WebElement drop : io) {
			if(drop.getText().equals("Dot Net")) {
				drop.click();
				break;
			}
			
		}
		Thread.sleep(1000);
		
		WebElement dr2=driver.findElement(By.id("ide"));
		Select scc=new Select(dr2);
		List<WebElement>hn=scc.getOptions();
		for (WebElement all : hn) {
			all.click();
			
		}
		
		driver.findElement(By.linkText("Home")).click();
		
		
		//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		
		
		
		
		
		
		
	}


}



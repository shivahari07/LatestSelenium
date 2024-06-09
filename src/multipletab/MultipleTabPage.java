 package multipletab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleTabPage {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("myntra"+Keys.ENTER);
		
		String old=driver.getWindowHandle();
		WebElement ne1=driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md' and contains(text(),'Myntra: Online Shopping' )]"));
		Actions ac= new Actions(driver);
		ac.contextClick(ne1).build().perform();
		
		Robot rt= new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement ne2=driver.findElement(By.linkText("Shop For Women Clothes ..."));
		ac.contextClick(ne2).build().perform();
		//ac.keyDown(Keys.CONTROL).contextClick(ne1).click().perform(); =>  another method for opening new tab.
		Robot rt1= new Robot();
		rt1.keyPress(KeyEvent.VK_DOWN);
		rt1.keyRelease(KeyEvent.VK_DOWN);
		rt1.keyPress(KeyEvent.VK_ENTER);
		rt1.keyRelease(KeyEvent.VK_ENTER);

		
		WebElement ne3=driver.findElement(By.xpath("//a[text()='Men Shopping Online']"));
		ac.contextClick(ne3).build().perform();
		
		Robot rt2= new Robot();
		rt2.keyPress(KeyEvent.VK_DOWN);
		rt2.keyRelease(KeyEvent.VK_DOWN);
		rt2.keyPress(KeyEvent.VK_ENTER);
		rt2.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String>nw=driver.getWindowHandles();
		System.out.println("How many window "+nw.size());
		List<String>women= new ArrayList<String>(nw);
		driver.switchTo().window(women.get(1));
		
		
		WebElement wn=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));
		Actions act= new Actions(driver);
		act.moveToElement(wn).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Sweaters']")).click();
		
		
		
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class chrome {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("hari");
	driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123456");
	driver.findElement(By.linkText("Create a Page")).click();
	driver.findElement(By.linkText("Sign Up")).click();
	driver.findElement(By.name("firstname")).sendKeys("Hari");
	driver.findElement(By.name("lastname")).sendKeys("Haran");
	driver.findElement(By.name("reg_email__")).sendKeys("8778879365");
	driver.findElement(By.id("password_step_input")).sendKeys("123456");
	WebElement se1=driver.findElement(By.id("day"));
	Select sc= new Select(se1);
	sc.selectByValue("15");
	
	WebElement se2=driver.findElement(By.id("month"));
	Select sv= new Select(se2);
	sv.selectByIndex(6);
	
	WebElement se3=driver.findElement(By.id("year"));
	Select sb= new Select(se3);
	sb.selectByVisibleText("1997");
	
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	
	driver.get("https://www.instagram.com/sem/campaign/emailsignup/");
	driver.findElement(By.xpath("//label[text()='fullName']")).sendKeys("hello");
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}

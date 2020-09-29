package NewMaven.NewMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Usingfb {
	
	WebDriver driver;
	ChromeOptions co;
	@BeforeMethod
	public void openbrowser()
	{
		co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\Azar\\SeleniumJava\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	} 
	

	@Test
	public void Enterdetails() throws InterruptedException 
	{
		
		driver.findElement(By.id("email")).sendKeys("9573705757");
		driver.findElement(By.id("pass")).sendKeys("azar5757");
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		driver.close();
		
	}
	
	@AfterMethod
	public  void CloseBrowser() {
		
		driver.close();
	}
	
	

}

package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ICICIMouseClick {
  @Test
  public void testprog() throws InterruptedException {
	  
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.icicibank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		Actions myaction = new Actions(driver);
		  WebElement prod = driver.findElement(By.linkText("Products"));
		  myaction.moveToElement(prod).perform();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  WebElement homeloan = driver.findElement(By.linkText("Home Loan"));
		 /* myaction.moveToElement(homeloan).perform();
		  myaction.click(homeloan).perform();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  System.out.println(driver.getTitle());*/
		  
		Action builderaction =  myaction.moveToElement(homeloan).click(homeloan).build();
		builderaction.perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
  }
}

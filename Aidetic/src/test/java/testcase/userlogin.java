package testcase;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class userlogin {
	@SuppressWarnings("deprecation")
	public static void main(String[]args) throws InterruptedException {
		   //WebDriverManager.edgedriver().setup();
		   //WebDriver driver = new EdgeDriver();
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://auth.dev.vntech.io/");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//button[text()=\"Accept All\"]")).click();
		  
		 
		  
		  //for sign up click on continue with google
		 
		  driver.navigate().refresh();
		  	  
		  //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  //driver.switchTo().frame("gsi_709566_805248");
		  driver.switchTo().frame(driver.findElement(By.xpath("//*[contains(@title, 'Sign in with Google Button')] ")));
		  
		  driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();
		  Thread.sleep(5000);
		  String phandle=driver.getWindowHandle();
		  System.out.println("parent window -"+phandle);
		  
		  
		  Set <String> handles = driver.getWindowHandles();
		  for(String handle : handles) {
		  System.out.println(handle);
		  if (!handle.equals(phandle)) {
		  driver.switchTo().window(handle);
		  //enter email id 
		  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("atrangi.awara123321@gmail.com");
		  driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		  Thread.sleep(1000);
		  //enter password
		  driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Awara@123");
		  Thread.sleep(100);
		  driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		  
		  Thread.sleep(500);
		  }
		  }
		  
		  //driver.quit();
		  
	}

}

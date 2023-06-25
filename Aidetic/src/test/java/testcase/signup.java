package testcase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class signup {
	public static void main(String[]args) throws InterruptedException {
		   //WebDriverManager.edgedriver().setup();
		   //WebDriver driver = new EdgeDriver();
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://auth.dev.vntech.io/");
		   
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   driver.findElement(By.xpath("//button[text()=\"Accept All\"]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//a[@href='/signup']")).click();
		   
		  
		   
		   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		   
		   driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiInput-input css-qyehkn'])[1]")).sendKeys("Akshay");
		   driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiInput-input css-qyehkn'])[2]")).sendKeys("Kadam");
		   driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiInput-input css-qyehkn'])[3]")).sendKeys("atrangi.awara123321@gmail.com");
		   driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		   
		   driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S319442424%3A1687628839775742&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=Af_xneGpz5naPj2RhtQ_xJEghXfuxr-ZPGotpCU6H0vYZMfBKjJzVCdjYqotxyyduD6j1ovI9Fqs4w&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		   driver.findElement(By.xpath("//input[@type='email']")).sendKeys("atrangi.awara123321@gmail.com");
		   driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Awara@123");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		   
		   Thread.sleep(2000);
		   driver.get("https://u27329899.ct.sendgrid.net/ls/click?upn=mOKjWo5MO0KHbtjcflDj4IAQ25b9nxiF7uBWMokOwovoTU8jPj6ZFbDxaHjpQxtIjLM1tlHrMyN3L1eDd2n2fUuKdYNyQBnXg2WrZNXEF9QHFtFbAlxRYO9yjc2DCWSs7KHFql02K5hFXzXQaBDBWS8IIhU9lS6TIl5g1GNZnOEmF77t1nwTkyugUZYYKNd0nGEWX8lZ0TXsjOQMNsDivIkFRllaGKiCQSSNTvkUE-2FNsrcqX2QCbTIUFhN-2F4ONUsd5PbyvvcYofk41CRgTQNlDvtd8QnKkDP5-2Fm3ouUojpk-3DNmIz_8I7e39v3-2BkV6hfKotR4j4qqw6nyBJYrxE7AGiktUJfrAY5OKxNNDWX5hW7ClKcUK1kTPGjFhoZCgkd6UEQGFol-2BE1LH8M9uBxueaRe2pozFWc1gjgBG8QSgcIc2CqgwFfZAPi5ydgk5UZ1tuoFtq1r1sLunVu9wPi1D2rS70-2FCBzy7hHjVlp5yOYnRBFyVjwfGarBtVgnP-2F8JOd5mFBx4FlGWZoboCH6LV6k9Sx0LPU-3D");		   

		   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input css-qyehkn']")).sendKeys("atrangi.awara123321@gmail.com");
		   driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd css-qyehkn']")).sendKeys("Awara@123");
		   Thread.sleep(1000);

		   driver.findElement(By.xpath("//button[@id='signin']")).click();
	}
}
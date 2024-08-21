package demo_assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google 
{
	WebDriver driver;//creating a webdriver instance globally
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();//running a chromedriver setup
		driver=new ChromeDriver();//creating an object for the chromedriver
		driver.get("https://www.google.com/");//Opens the google homepage
		driver.manage().window().maximize();//code to maximize the window
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);//implicit wait 
	}
	@Test
	public void searchfield() throws InterruptedException
	{
	driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Android mobiles");//enters the text "android mobiles" in the search field
	driver.findElement(By.cssSelector("input[name='btnK']")).click();//clicks on the search button
	Thread.sleep(3000);//extra wait given to load the window 
	JavascriptExecutor js=(JavascriptExecutor)driver;//creating an object of the javascript interface because webdriver cannot perform these actions
	int n=3;
	for(int i=0;i<n;i++)
	{
	js.executeScript("window.scrollBy(0,100)");//code to scroll down the web page
	}
	Thread.sleep(3000);
	}
	@AfterTest
	public void at() 
	{
		driver.close();//Closes the current browser 
	}
}

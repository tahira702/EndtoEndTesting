package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;
	@Test
	public void webdriver()
	{	 
	      WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();     
	}
	
  @Test
  @Parameters({"url"})
  public void Setup(String uri) {
	  webdriver();       
      driver.get(uri);
  }  
  @Parameters("url")
  @Test
  public void nevigations(String uri) 
  	{
	 
	  Setup(uri);
	  String url = driver.getCurrentUrl();    // current URL
	  System.out.println(url);
	  driver.navigate().back();   // back to home
	  driver.navigate().forward();   // forward
	  driver.navigate().refresh();  
	  String title = driver.getTitle(); // get title
	  System.out.println(title);
	  String windowid = driver.getWindowHandle();   // get window handle
	  System.out.println(windowid);
	  assert driver.getWindowHandles().size() == 1;  // apply assertion if the window size is 1
	  driver.switchTo().newWindow(WindowType.TAB);    // open new tab
	  driver.switchTo().newWindow(WindowType.WINDOW); // open new window
	  driver.close();
	 }
  @Test
  public void pageload() {
  }
  @Test
  public void shortsleep() {
	  
  }
  @Test
  public void longsleep() {
	  
  }
  @Test
  public void driverquit() {
	  driver.quit();
	  
  }
}

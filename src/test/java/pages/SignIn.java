package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn extends Base {
	
	
@Parameters("url")	
  @Test
    public void landingpage(String url) 
  { 
	  Setup(url);
 }
  @Test
  public void verifySignInscreen()
  {
	  //webdriver();
	  super.driver = driver ;
	  
	  WebElement id = driver.findElement(By.StandardLocator.id("u_0_d_gZ"));
	  WebElement password =driver.findElement(By.StandardLocator.id("u_0_d_gZ"));
	  
	  
  }
 /* // not working correctly ad blocker is not allowing to find iframes
  @Test
  public void iframe()   // iframes doesn't work when there is ad blocker in browser
  
  {
	  WebDriver dv;
	  WebDriverManager.chromedriver().setup();
	  dv = new ChromeDriver();   
	  dv.get("https://www.guru99.com/handling-iframes-selenium.html");
	  WebElement iframe = dv.findElement(By.tagName("iframe"));
	  dv.switchTo().frame(0);
	  dv.findElement(By.tagName("infoscroller"));
	  dv.quit();
	  
  }*/
  
}

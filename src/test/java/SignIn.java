import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn {
	
	
	
  @Test
  public void MoveToDocumentation() {
	  WebDriver driver;
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();        
      driver.get("https://www.selenium.dev");
      WebElement Documentation  = driver.findElement(By.ByTagName.linkText("Documentation"));
      Documentation.click();
      
      driver.quit();
}
  @Test
  public void Browsersbasics()
  {
	  WebDriver dv;
	  WebDriverManager.chromedriver().setup();
	  dv = new ChromeDriver();   
	  dv.get("https://www.selenium.dev");
      WebElement Documentation  = dv.findElement(By.ByTagName.linkText("Documentation"));
      Documentation.click();
	  String url = dv.getCurrentUrl();    // current URL
	  System.out.println(url);
	  dv.navigate().back();   // back to home
	  dv.navigate().forward();   // forward
	  dv.navigate().refresh();  
	  String title = dv.getTitle(); // get title
	  System.out.println(title);
	  String windowid = dv.getWindowHandle();   // get window handle
	  System.out.println(windowid);
	  assert dv.getWindowHandles().size() == 1;  // apply assertion if the window size is 1
	  dv.switchTo().newWindow(WindowType.TAB);    // open new tab
	  dv.switchTo().newWindow(WindowType.WINDOW); // open new window
	  dv.close();
	  dv.quit();
	  
  }
  @Test
  public void iframe()
  
  {
	  WebDriver dv;
	  WebDriverManager.chromedriver().setup();
	  dv = new ChromeDriver();   
	  dv.get("https://www.guru99.com/handling-iframes-selenium.html");
	  WebElement iframe = dv.findElement(By.tagName("iframe"));
	  dv.switchTo().frame(0);
	  dv.findElement(By.tagName("infoscroller"));
	  dv.quit();
	  
  }
  
}

package eCommerceProject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void AmazonTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening Amazon", true );
	  driver.get("https://www.Amazon.com/");
	  Thread.sleep(7000);
	  driver.close();
  }
  }
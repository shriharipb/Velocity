package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Snapdeal {
  @Test
  public void SnapdealTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening Snapdeal", true );
	  driver.get("https://www.snapdeal.com/");
	 // Assert.fail();
	  Thread.sleep(7000);
	  driver.close();
  }
}

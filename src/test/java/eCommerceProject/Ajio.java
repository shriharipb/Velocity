package eCommerceProject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void AjioTest() throws InterruptedException {
		  
		  WebDriver driver = new ChromeDriver();
		  Reporter.log("Opening Ajio", true );
		  driver.get("https://www.ajio.com/");
		
		 // Assert.fail();
		  Thread.sleep(7000);
		  driver.close();
	  }
}
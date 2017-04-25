package Facebook;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MercuryTours extends LaunchBrowser {
	
	
  @Test
  public void VerifyHomePage() {
	  
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @AfterTest
  public void terminateBrowser(){
      driver.close();
  }
}

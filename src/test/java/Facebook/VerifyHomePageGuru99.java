package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class VerifyHomePageGuru99  extends LaunchBrowser {
  @Test(priority=0)
  public void VerifyHomePage() {
	  
	String  expectedTitle ="Guru99 Bank";
	String  actualTitle = driver.findElement(By.xpath("/html/body/div[1]/h2")).getText();
	
	Assert.assertEquals(actualTitle, expectedTitle);
	 }
  @Test(priority=1)
  public void loginVerification() throws Exception {
	  
		
			LoginFunctionality cr= new LoginFunctionality(driver);
		    cr.setUserName("mngr75804");
		    cr.setPassword("nUvAmAs");
		    cr.clickLogin();
		
	  
	  
  }
  
  @AfterTest
  public void terminateBrowser(){
      driver.close();
  }
}

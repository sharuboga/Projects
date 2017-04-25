package Facebook;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Facebook extends LaunchBrowser {
	
	@Test
	public void LoginFacebook() throws Exception
	{
		LoginFunctionality cr= new LoginFunctionality(driver);
	    cr.setUserName("sharuboga");
	    cr.setPassword("sharu");
	    cr.clickLogin();
	
	}
	
	 @AfterTest
     public void terminateBrowser(){
         driver.close();
     }
}

package Facebook;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Facebook extends LaunchBrowser {
	
	@Test
	public void LoginFacebook() throws Exception
	{
	Credentials cr= new Credentials(driver);
	cr.Login("sharuboga", "password");
	
	}
	
	 @AfterTest
     public void terminateBrowser(){
         driver.close();
     }
}

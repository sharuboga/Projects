package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFunctionality extends CredentialsGuru99  {
	
	
	public LoginFunctionality(WebDriver driver2) {
		this.driver=driver2;
	}
          //Set user name in textbox

		    public void setUserName(String strUserName){

		        driver.findElement(useremail).sendKeys(strUserName);;

		    }

		    

		    //Set password in password textbox

		    public void setPassword(String strPassword){

		         driver.findElement(userpassword).sendKeys(strPassword);

		    }

		    

		    //Click on login button

		    public void clickLogin(){

		    	WebDriverWait wait = new WebDriverWait(driver, 3);

		    	wait.until(ExpectedConditions.invisibilityOfElementLocated(loginbutton));
		            driver.findElement(loginbutton).click();

		    }
		 
	}

	




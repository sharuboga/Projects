package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Credentials {
	
 public	WebDriver driver;
	
 By	useremail = By.id("email");
 By userpassword = By.name("pass");
 By loginbutton = By.cssSelector("#u_0_q");
	public Credentials(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	
	}
	public void Login(String userName, String password) throws Exception
	{
		Thread.sleep(3000);
		   driver.findElement(useremail).clear();
		 driver.findElement(useremail).sendKeys(userName);
		 driver.findElement(userpassword).clear();
		 driver.findElement(userpassword).sendKeys(password);
		driver.findElement(loginbutton).click();
		 System.out.println(userName);
		 System.out.println(password);

		 
	}

}

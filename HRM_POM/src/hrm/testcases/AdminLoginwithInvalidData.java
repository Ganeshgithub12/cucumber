package hrm.testcases;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utills.AppUtills;
import hrm.pages.LoginPage;

public class AdminLoginwithInvalidData extends AppUtills
{
     @Test
	public void checkAdminLogin()
	{
		
    	LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
    	lp.login("abc", "xyz");
    	boolean res = lp.isErrMsgDisplayed();
    	Assert.assertTrue(res); 
    	   	 
	}
	
	
	
	
	
}

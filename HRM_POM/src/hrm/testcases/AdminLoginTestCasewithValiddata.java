package hrm.testcases;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utills.AppUtills;
import hrm.pages.LoginPage;

public class AdminLoginTestCasewithValiddata extends AppUtills
{
	
	
	@Test
    public void checkAdminLogin()
    {
       
		 LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		 lp.login("Admin", "Qedge123!@#");
		 boolean res = lp.isAdminModuleDisplayed();
		 Assert.assertTrue(res);
		 lp.logout();
		
		
    }
	
	
	
	
	
}

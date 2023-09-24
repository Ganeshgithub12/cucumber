package OrangeLibrary;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utills.AppUtills;

public class AdminUtils extends AppUtills
{
	String adminuid = "Admin";
	String adminpwd = "Qedge123!@#";
	
	 Loginpage lp;
	
	@BeforeTest
	public void adminLogin()
	{
	    lp = new Loginpage();
	    lp.login(adminuid,adminpwd);
	    
	}

	@AfterTest
	public void adminLogout()
	{
	 lp.logout();	
	}
}

package OrangeTestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.beust.jcommander.Parameter;

import OrangeLibrary.Loginpage;
import Utills.AppUtills;

public class AdminLoginTestwithInvalidInputs extends AppUtills
{
	@Parameters({"uid","pwd"})
	@Test
	public void checkAdminLogin(String uid,String pwd)
	{
		Loginpage lp = new Loginpage();
		lp.login(uid, pwd);
		boolean result = lp.isErrMsgDisplayed();
		Assert.assertTrue(result);
	}
	
		
		
	
}

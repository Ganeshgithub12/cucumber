package OrangehrmTestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Orangehrmlibrary.Login;

public class AdminLoginWithInvalidInputs {
@Parameters({"uid","pwd"})
	@Test
	public void checkAdminLogin(String uid, String pwd ) {
		Login lp = new Login();
		lp.login(uid, pwd);
	boolean res=	lp.IsErrmsgDisplayed();
	Assert.assertTrue(res);
	}
	
	
	
}

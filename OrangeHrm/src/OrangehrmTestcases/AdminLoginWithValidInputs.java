package OrangehrmTestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Orangehrmlibrary.Login;
import Utils.AppUtils;

public class AdminLoginWithValidInputs extends AppUtils {
	@Parameters({"uid","pwd"})
	@Test
	public void checklogin(String uid,String pwd) {
		 Login lp = new Login();
		  lp.login(uid, pwd);
		boolean res=  lp.AdminmoduleDisplayed();
		Assert.assertTrue(res);
		lp.logout();
	}
}

package orangeHRM.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import OrangeLibrary.Loginpage;
import Utills.AppUtills;
import Utills.XLUtils;

public class AdminLoginTestCasewithInvalidInputs extends AppUtills 
{
	String datafile = "C:\\Users\\DELL\\Downloads\\selenium-java-4.10.0\\HRM_DDT\\Testdata\\xl.xlsx";
	String datasheet = "AdminLogin_InvalidData";
	
	
   @Test
   public void checkAdminLogin() throws IOException
   {
	 int rowcount = XLUtils.getRowCont(datafile, datasheet);
	 
	 String uid,pwd;
	 Loginpage lp = new Loginpage();
	 
	 for(int i=1;i<=rowcount;i++)
	 {
		uid = XLUtils.getStringData(datafile, datasheet, i, 0);
		pwd = XLUtils.getStringData(datafile, datasheet, i, 1);
		lp.login(uid, pwd);
		Boolean res = lp.isErrMsgDisplayed();
		Assert.assertTrue(res);
		if(res)
		{
			XLUtils.setData(datafile, datasheet, i, 2, "pass");
			XLUtils.fillGrencolor(datafile, datasheet, i, 2);
		}else
		{
			XLUtils.setData(datafile, datasheet, i, 2, "fail");
			XLUtils.fillRedcolor(datafile, datasheet, i, 2);
		}
		
		
		
		
		
	 }
	   
	   
	   
	   
   }
	
}

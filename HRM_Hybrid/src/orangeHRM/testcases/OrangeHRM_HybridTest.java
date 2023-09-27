package orangeHRM.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import OrangeLibrary.Employee;
import OrangeLibrary.Loginpage;
import Utills.AppUtills;
import Utills.XLUtils;

public class OrangeHRM_HybridTest extends AppUtills
{

	
	String tcfile = "C:\\Orange AdminLogin\\OrangeData.xlsx";
	String tcsheet = "Sheet1";
	String tssheet = "Sheet2";
	
	
	@Test
  public void checkOrangeHRM() throws IOException
  {
	
		int tccount = XLUtils.getRowCont(tcfile, tcsheet);
		int tscount = XLUtils.getRowCont(tcfile, tssheet); 
		
		String tcexeflag,tcid, tsid,keyword;
		String uid,pwd ;
		String Stepres, tcres ;
		String fname,lname;
		Loginpage lp = new Loginpage();
		Employee emp = new Employee();
		boolean res = false;
		for(int i=1;i<=tccount;i++)
		{
			tcexeflag = XLUtils.getStringData(tcfile, tcsheet, 1, 2);
			if(tcexeflag.equalsIgnoreCase("y"))
			{
				tcid = XLUtils.getStringData(tcfile, tcsheet, i, 0);
				for(int j=1;j<=tscount;j++)
				{
					tsid = XLUtils.getStringData(tcfile, tssheet, j, 0);
				if(tsid.equalsIgnoreCase(tcid)) {
					keyword = XLUtils.getStringData(tcfile, tssheet, j, 4);
					switch (keyword.toLowerCase()) {
					case "adminlogin":
					uid =	XLUtils.getStringData(tcfile, tssheet, j, 5);
					pwd =  XLUtils.getStringData(tcfile, tssheet, j, 6);
						lp.login(uid, pwd);
					res =	lp.isAdminModuleDisplayed();
						
						break;

					case "logout" :
					res =	lp.logout();
						break;
						
					case "invalid":	
					uid =	XLUtils.getStringData(tcfile, tssheet, j, 5);
					pwd = XLUtils.getStringData(tcfile, tssheet, j, 6);
					lp.login(uid, pwd);
				   res =	lp.isErrMsgDisplayed();
						break;
					case "empreg":	
						
					fname =	XLUtils.getStringData(tcfile, tssheet, j, 5);
					lname = XLUtils.getStringData(tcfile, tssheet, j, 6);
				res =	emp.addEmployee(fname, lname);
						break;
						
						
					}
					if(res) {
						Stepres = "Pass";
						XLUtils.setData(tcfile, tssheet, j, 3, Stepres);
						XLUtils.fillGrencolor(tcfile, tssheet, j, 3);
					}else {
						Stepres = "Fail";
						XLUtils.setData(tcfile, tssheet, j, 3, Stepres);
						XLUtils.fillRedcolor(tcfile, tssheet, j, 3);
					}
				tcres =	XLUtils.getStringData(tcfile, tcsheet, i, 3);
				if(!tcres.equalsIgnoreCase("fail")) {
					
					XLUtils.setData(tcfile, tcsheet, i, 3, Stepres);
				}
				tcres = XLUtils.getStringData(tcfile, tcsheet, i, 3);
				 if(tcres.equalsIgnoreCase("pass")) {
					 XLUtils.fillGrencolor(tcfile, tcsheet, i, 3);
				 }else {
					 XLUtils.fillRedcolor(tcfile, tcsheet, i, 3);
				 }
				
				
				}
				
				}
			
			}else
			{
				XLUtils.setData(tcfile, tcsheet, i, 3, "Blocked");
				XLUtils.fillRedcolor(tcfile, tcsheet, i, 3);
			}
		}
		
		
  }
	
	
	

	
	
}

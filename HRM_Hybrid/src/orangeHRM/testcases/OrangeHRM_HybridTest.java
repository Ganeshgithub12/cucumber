package orangeHRM.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Utills.AppUtills;
import Utills.XLUtils;

public class OrangeHRM_HybridTest extends AppUtills
{

	String tcfile = "./testcasefiles/OrangeHRMKeywords.xlsx";
	String tcsheet = "TestCases";
	String tssheet = "TestSteps";
	
	
	@Test
  public void checkOrangeHRM() throws IOException
  {
	
		int tccount = XLUtils.getRowCont(tcfile, tcsheet);
		int tscount = XLUtils.getRowCont(tcfile, tssheet); 
		
		String tcexeflag,tcid,keyword;
		
		for(int i=1;i<=tccount;i++)
		{
			tcexeflag = XLUtils.getStringData(tcfile, tcsheet, 1, 2);
			if(tcexeflag.equalsIgnoreCase("y"))
			{
				tcid = XLUtils.getStringData(tcfile, tcsheet, i, 0);
				for(int j=1;j<=tscount;j++)
				{
					keyword = XLUtils.getStringData(tcfile, tssheet, j, 4);
				}
			}else
			{
				XLUtils.setData(tcfile, tcsheet, i, 3, "Blocked");
				XLUtils.fillRedcolor(tcfile, tcsheet, i, 3);
			}
		}
		
		
  }
	
	
	
	
	
	
}

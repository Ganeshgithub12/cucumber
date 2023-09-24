
package OrangeTestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;

import OrangeLibrary.AdminUtils;
import OrangeLibrary.Employee;
import Utills.AppUtills;

public class EmployeeRegestrationTest extends AdminUtils
{
	@Parameters({"fname","lname"})
	@Test
	public void checkEmployeeRegestration(String fname,String lname)
	{
	 Employee emp = new Employee();
	 boolean res = emp.addEmployee(fname,lname);
	 Assert.assertTrue(res);
	 
	}

}


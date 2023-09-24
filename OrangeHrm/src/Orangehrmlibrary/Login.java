package Orangehrmlibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.AppUtils;

public class Login extends AppUtils {

public void login( String uid, String pwd) {
	
	driver.findElement(By.id("txtUsername")).sendKeys(uid);
	driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	driver.findElement(By.id("btnLogin")).click();
	
	
}

public boolean AdminmoduleDisplayed() {
 boolean result =	driver.findElement(By.linkText("Admin")).isDisplayed();
  
    if(result) {
    	return true;
    }else {
    	return false;
    }
 
}

public void logout() {
	
	driver.findElement(By.partialLinkText("Welcome")).click();
	driver.findElement(By.linkText("Logout")).click();
	
	
	
}

public boolean IsErrmsgDisplayed() {
	String errormsg = driver.findElement(By.id("spanMessage")).getText().toLowerCase();

if(errormsg.contains("invalid")||errormsg.contains("empty")) {
	return true;
}else {
	return false;
}
}

public boolean EmpReg(String fname,String lname) {
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys(fname);
	driver.findElement(By.id("lastName")).sendKeys(lname);
String empid =	driver.findElement(By.id("employeeId")).getAttribute("value");
	driver.findElement(By.id("btnSave")).click();
	driver.findElement(By.linkText("Employee List"));
	driver.findElement(By.id("empsearch_id")).sendKeys(empid);
	driver.findElement(By.id("searchBtn")).click();
	WebElement tb= driver.findElement(By.id("resultTable"));
	List<WebElement> rows = driver.findElements(By.tagName("tr"));
	boolean Empreg= false;
	for(int i=1;i<=rows.size();i++) {
		List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
		if(cols.get(i).getText().equals(empid)) {
		Empreg = true;
		break;
	}
	
	return Empreg;
	
	
	
	
	
	
	
}
	return Empreg;




}
}

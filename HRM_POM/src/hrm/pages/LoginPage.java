package hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
    @FindBy(id = "txtUsername")
	WebElement uid_element;
    
    @FindBy(name = "txtPassword")
    WebElement pwd_element;
    
    @FindBy(xpath = "//input[@value='LOGIN']")
    WebElement login_element;
	
    @FindBy(linkText = "Admin")
    WebElement adminlink;
    
    @FindBy(partialLinkText = "Welcome")
    WebElement welcomelink;
    
    @FindBy(linkText = "Logout")
    WebElement logoutlink;
    
    @FindBy(id = "spanMessage")
    WebElement errmsg_elment;
    
	public void login(String uname,String pword)
	{
		uid_element.sendKeys(uname);
		pwd_element.sendKeys(pword);
		login_element.click();
		
	}
	
	public boolean isAdminModuleDisplayed()
	{
		if(adminlink.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public void logout()
	{
		welcomelink.click();
		logoutlink.click();
	}
	public boolean isErrMsgDisplayed()
	{
	
		String errmsg = errmsg_elment.getText().toLowerCase();
		if(errmsg.contains("invalid")||errmsg.contains("empty"))
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	
	
}

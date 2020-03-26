package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Browser_waits;


//login page
public class Login_page extends  Browser_waits{          
	
	
	By USR=By.xpath("//input[@id='user-name']");
	By PWD=By.xpath("//input[@id='password']");
	By CLICK=By.xpath("//input[@class='btn_action']");
	
	 WebDriver dr;

	public Login_page(WebDriver dr)
	{
		this.dr=dr;
	}
	
	
	//   Entering the Username
	public void Username(String  name)       
	{
		WebElement wt1=WaitForElement(USR,20);         
		wt1.sendKeys(name);
	}
	
	
	// Entering the Password
	public void Password(String  password)     
	{
		WebElement wt2=WaitForElement(PWD,20);
		wt2.sendKeys(password);
	}
	
	
	//  Clicking the Login Button
	public void CLICK_BTN()                    
	{
		WebElement wt3=WaitForElement(CLICK,20);
		wt3.click();
	}
	
	//  Calling all the Login methods
	public  void Total_Login(String Usrname,String Pswd)      
	{
		System.out.println(Usrname+" "+Pswd);
		this.Username(Usrname);
		this.Password(Pswd);
		this.CLICK_BTN();
		
		
	}

 

}

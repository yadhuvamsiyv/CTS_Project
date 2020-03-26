package Test_Cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Get_excel.Read_excel;
import Pages.AboutPage_to_tryitfree;
import Pages.AddtoCart_Page;
import Pages.Login_page;
import utilities.Browser_waits;

public class Project_TestNg2 extends Read_excel{
 static WebDriver dr;
	 
	 @BeforeClass
	  public void beforeMethod()
	 {
		 get_Excel();
		 }
 
	 
	 @Test(dataProvider="logindata")
  public void Logindata(String Username,String Password) throws InterruptedException {
	 System.out.println("Hey its working");
	 dr=Browser_waits.Launch_browser("FIREFOX","https://www.saucedemo.com/");      //opening the firefox browser and url given.
	 Login_page Ln=new Login_page(dr);
	   System.out.println(Username+" "+Password);
	Ln.Total_Login(Username,Password);                  //Entering username, password and clicking login button were happening here.
  }
  
	 
	 @DataProvider(name="logindata")
  public String[][] data_Provider() 
   {
	  
	  return testdata;
  }
  
  //Adding products to cart
  public void search_L2H()
  {
	  AddtoCart_Page a1=new AddtoCart_Page(dr);
	  a1.SearchL2H();
	  a1.Addtocart_btn();
  }
  
  //Going about page and clicking tryforfree
  public void About_Page() throws InterruptedException
  {
	  AboutPage_to_tryitfree a2=new AboutPage_to_tryitfree(dr);
	  a2.link_for_aboutpage();
	  a2.About_Saucedemo();
	  a2.tryforfree();
	  a2.signin();
  }

  //selecting low to high adding products to cart and going to about page taking screenshot
  @AfterMethod()
  public void hd() throws  IOException, InterruptedException
  {
	  search_L2H();
		About_Page(); 
		Browser_waits.screen_shot();
		dr.close();
  }
}
  
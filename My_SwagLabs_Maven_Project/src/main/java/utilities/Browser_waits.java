package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser_waits {
	static WebDriver dr;
	WebElement we;
	static int count=1;
	
//launching Browsers
	public static WebDriver Launch_browser(String browser,String url)
	{
	   switch(browser)
		{
		case "CHROME":
			System.setProperty("webdriver.chrome.driver","src\\test\\resources\\DRIVER\\chromedriver.exe");
			dr=new ChromeDriver();
		break;
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver","src\\test\\resources\\DRIVER\\geckodriver.exe");
			dr=new FirefoxDriver();
		break;
			
		}
		dr.get(url);
		return dr;
	}
	
	
	//adding wait for element
	public WebElement WaitForElement(By locator,int time_out)
	{
		
		try
		{
		WebDriverWait WDW= new WebDriverWait(dr,time_out);
		 we=WDW.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 return we;
		}
		catch (Exception e)
		{
			System.out.println("No_element_found");
					return null;
		}
		}
	
	
	//adding wait for clicking function
	public WebElement WaitForClickable(By locator,int time_out)
	{
		
		try
		{
		WebDriverWait WDW= new WebDriverWait(dr,time_out);
		 we=WDW.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 return we;
		}
		catch (Exception e)
		{
			System.out.println("No_element_found");
			return null;
		}
		
	}
	
	
	//Taking Screenshot 
	public static void screen_shot() throws IOException
	{
		String Path="src//test//resources//screenshots//";
	
		String file_name="ss"+count+".png";
		File f1=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		File f2= new File(Path+file_name);
		FileUtils.copyFile(f1,f2);
		count++;
	}
}




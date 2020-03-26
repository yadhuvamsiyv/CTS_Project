package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddtoCart_Page {

	WebDriver dr;
	public AddtoCart_Page(WebDriver dr)
	{
		this.dr=dr;
	}
	
	 // selecting = Price (low to high) 
	public void SearchL2H()
	{  
		
		WebElement wb=dr.findElement(By.xpath("//select[@class='product_sort_container']"));        
		Select DD=new Select(wb);
		DD.selectByVisibleText("Price (low to high)");       
		
	}
	
//  Clicking the Add to Cart Buttons
	public void Addtocart_btn() {         
	for(int i=1;i<=4;i++)
		{
			dr.findElement(By.xpath("//div[@class='inventory_item']["+i+"]//following::button")).click();
		}
		
	}

}



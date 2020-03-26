package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage_to_tryitfree {
	WebDriver dr;

	public AboutPage_to_tryitfree(WebDriver dr)
	{
		this.dr=dr;
	}
	//clicking corner button
	public void link_for_aboutpage() {
		System.out.println("link clicked");
		dr.findElement(By.xpath("//div[@class='bm-burger-button']")).click();	
	}
	
	//clicking About
	public void About_Saucedemo() throws InterruptedException {
		
		Thread.sleep(100);
		dr.findElement(By.xpath("//nav[@class='bm-item-list']//child::a[2]")).click();
		
	}
	
	//click Try For Free
	public void tryforfree()
	{
		dr.findElement(By.xpath("//a[@class='button is-rounded is-secondary']")).click();
		
	}
	
	//clicking signin
	public void signin()
	{
		dr.findElement(By.xpath("//a[@class='button is-rounded is-primary is-small']")).click();
	}

}

//div[@class='content-container']//following::a[1]
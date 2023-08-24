package Nykaapageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productSelection {

WebDriver driver;
	
	public productSelection (WebDriver driver1)
	{
		 this.driver = driver1;
		 PageFactory.initElements(driver1,this);
		
	}
	@FindBy(xpath="//a[normalize-space()='men']")

	 WebElement MenBar;
	
	@FindBy(xpath="//a[text()='Face Wash']")
	
	 WebElement facewashbtn ;
	
	
	
	
	  public void Products() throws InterruptedException  {
		   Actions a = new Actions(driver);
		  Thread.sleep(3000);
		  a.moveToElement(MenBar).build().perform();
	   	Thread.sleep(3000);
	   	a.moveToElement(facewashbtn).click().build().perform();
	
}



}
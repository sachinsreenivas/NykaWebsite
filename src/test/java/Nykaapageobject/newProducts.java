package Nykaapageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newProducts {

	
WebDriver driver;
	
	public newProducts (WebDriver driver1)
	{
		 this.driver = driver1;
		 PageFactory.initElements(driver1,this);
		
	}
	
	@FindBy(xpath="(//button[@type='button'])[5]")
    WebElement cartbtn;

	@FindBy(xpath="(//a[@class='css-qlopj4'])[5]")
    WebElement prodselebtn;

	@FindBy(xpath="(//button[@type='button'])[5]")
    WebElement cartbtn2;


	//@FindBy(xpath="(//button[@type='button'])[5]")
    //WebElement cartbtn3;
	
    public void newProdSelect() throws InterruptedException {
	
	Thread.sleep(3000);
   cartbtn.click();
}

    public void newProdSelect1() throws InterruptedException 
{
	Thread.sleep(3000);
	   prodselebtn.click();
	
	
}
    public void newProdSelect2() throws InterruptedException {
    	
    	cartbtn2.click();
    	Thread.sleep(3000);
}
}

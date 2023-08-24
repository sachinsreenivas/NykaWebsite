package Nykaapageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalProductsel {

	
	
WebDriver driver;
	
	public FinalProductsel (WebDriver driver1)
	{
		 this.driver = driver1;
		 PageFactory.initElements(driver1,this);
		
	}
	@FindBy(xpath="(//*[name()='svg'])[5]")
    WebElement homebtn;
	
	@FindBy(xpath="//a[normalize-space()='men']")
    WebElement chartbtn;
	
	@FindBy(xpath="(//a[normalize-space()='Razors & cartridges'])[1]")
    WebElement chartsel;
	
	@FindBy(xpath="(//div[@class='css-i9shm8'])[2]")
    WebElement selProd;

	@FindBy(xpath="(//span[contains(@class,'btn-text')])[2]")
    WebElement cartbtns;

	public void chartprods() throws InterruptedException {
		
		 Actions a = new Actions(driver);
		
		  Thread.sleep(3000);
          homebtn.click();
		a.moveToElement(chartbtn).build().perform();
		 Thread.sleep(3500);
		 a.moveToElement(chartsel).click().build().perform();
		 Thread.sleep(3000);
	}

	public void finalprods() throws InterruptedException {

		 Actions a = new Actions(driver);
		 a.moveToElement(selProd).build().perform();
		 Thread.sleep(3000);
		 cartbtns.click();
}
}

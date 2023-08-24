package Nykaapageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class brandSelection {

	
	
	
	
WebDriver driver;
	
	public brandSelection (WebDriver driver1)
	{
		 this.driver = driver1;
		 PageFactory.initElements(driver1,this);
		
	}
	
	@FindBy(xpath="//div/div/span[.='Brand']")

	 WebElement brandbtn;
	
	@FindBy(xpath="(//label[@for='checkbox_WOW_2454'])[1]")
	
	 WebElement checkboxbtn;
	
	@FindBy(xpath="(//div[@class='control-value'])[5]")
	
	 WebElement checkboxbtn1;
	
	@FindBy(xpath="(//a[@class='css-1zi560'])[1]")
	 WebElement prodbtn;
	 
	@FindBy(xpath="(//a[@target='_blank'])[915]")
	
	 WebElement prodbtn1;
	
	public void Brands()
	  {
		brandbtn.click();
			checkboxbtn.click();
			checkboxbtn1.click();  
		  }

	
	public void selectProd() throws InterruptedException 
	{
		Actions a = new Actions(driver);
		prodbtn.click();
		Thread.sleep(3000);
	    a.moveToElement(prodbtn1).click().build().perform();

	
	
	}



	}



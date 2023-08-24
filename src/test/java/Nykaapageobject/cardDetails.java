package Nykaapageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cardDetails {

	
WebDriver driver;
	
	public cardDetails (WebDriver driver1)
	{
		 this.driver = driver1;
		 PageFactory.initElements(driver1,this);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Card Number']")
    WebElement cardnumber;
	
	@FindBy(css="//input[@placeholder='Expiry (MM/YY)']")
    WebElement Expirydate;
	
	@FindBy(css="input[placeholder='CVV']")
    WebElement cvv;
	
	@FindBy(xpath="//button[@class='css-v61n2j e8tshxd0']")
    WebElement paymentbtn;
	
	public void cardPayment() throws InterruptedException {
		
		Thread.sleep(2000);
		cardnumber.sendKeys("123412345567");
		Expirydate.sendKeys("0912");
		cvv.sendKeys("123");
		paymentbtn.click();
		
	}
}

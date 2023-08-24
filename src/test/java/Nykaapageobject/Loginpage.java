package Nykaapageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TextComponents.BaseTest;

public class Loginpage extends BaseTest {

	public WebDriver driver;
	
	public Loginpage (WebDriver driver1)
	{
		driver=driver1;
				PageFactory.initElements(driver1,this);
		
	}
 @FindBy(xpath="//button[normalize-space()='Sign in']")
 WebElement Signinbtn;

  @FindBy(css="div[class='css-14tqohr'] button:nth-child(1)")
  WebElement emailbtn;

  @FindBy(css="input[placeholder='Enter Email ID or Phone Number']")
  WebElement txtUserName;

  @FindBy(xpath="//button[@type='submit']")
  WebElement Proceedbtn;

  @FindBy(xpath="//button[.='send otp to email']")
  WebElement Otpclk;

  @FindBy(css="input[placeholder='OTP']")
  WebElement OTP;

  @FindBy(css="button[type='submit']")
  WebElement Verifybtn;

 //public void login(String email, String OTPno)
//{
	//Signinbtn.click();
	//emailbtn.click();
	//txtUserName.sendKeys(email);
	//Proceedbtn.click();
	//Otpclk.click();
	//OTP.sendKeys(OTPno);
	//Verifybtn.click();
	
//}
   public void goTo()
{
	driver.get("https://www.google.co.in/");
	driver.navigate().to("https://www.nykaa.com/");
}

	
}



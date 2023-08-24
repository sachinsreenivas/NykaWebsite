package Nykaapageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addresspage {

WebDriver driver;
	
	public addresspage (WebDriver driver1)
	{
		 this.driver = driver1;
		 PageFactory.initElements(driver1,this);
		
	}
	
	@FindBy(xpath="(//input[contains(@class,'input-element')])[1]")
    WebElement pincode;
	
	@FindBy(css="textarea[placeholder='Road Name/ Area /Colony']")
    WebElement extrabtn;
	
	@FindBy(xpath="//input[contains(@placeholder,'House/ Flat/ Office No.')]")
    WebElement Houseno;
	
	@FindBy(css="textarea[placeholder='Road Name/ Area /Colony']")
    WebElement address;

	@FindBy(xpath="(//input[contains(@class,'input-element')])[5]")
    WebElement Name;
	
	@FindBy(xpath="(//input[contains(@class,'input-element')])[6]")
    WebElement Phoneno;
	
	@FindBy(xpath="(//input[contains(@class,'input-element')])[7]")
    WebElement Email;
	
	@FindBy(xpath="//button[contains(.,'Ship to this address')]")
    WebElement Proceedbtn;

public void address() throws InterruptedException {
	
	 Thread.sleep(3000);
	 pincode.sendKeys("572102");
	 Thread.sleep(5000);
	 extrabtn.sendKeys("s s puram 8th cross 3rd main");
	 Thread.sleep(3000);
	 Houseno.sendKeys("6012");
	 Thread.sleep(3000);
	 address.sendKeys("s s puram 8th cross 3rd main");
	 Name.sendKeys("ruther");
	 Phoneno.sendKeys("8088219989");
	 Email.sendKeys("ruthershop96@gmail.com");
	 Proceedbtn.click();
}
}

package Nykaapageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {

	
	
WebDriver driver;
	
	public cartpage (WebDriver driver1)
	{
		 this.driver = driver1;
		 PageFactory.initElements(driver1,this);
		
	}
	
	@FindBy(xpath="(//button[@class='css-aesrxy'])[1]")
    WebElement bagbtn;
	
	@FindBy(xpath="//iframe[contains(@class,'css-acpm4k')]")
    WebElement Intoframe;
	
	@FindBy(xpath="(//button[contains(@class,'css-1h4559r')])[4]")
    WebElement proceedbtn;
	
	@FindBy(xpath="(//button[contains(@class,'css-tzuruw')])[2]")
    WebElement addnewbtn;

	@FindBy(xpath="//div[contains(@class,'css-nr5sgr e1iuq4411')]")
    WebElement Intopage;
	
	public void Lastproceedings() throws InterruptedException {
		
		Actions a = new Actions(driver);
		a.moveToElement(bagbtn).click().build().perform();
		driver.switchTo().frame(Intoframe);
		Thread.sleep(3000);
		a.moveToElement(proceedbtn).click().build().perform();
	    addnewbtn.click();
	    Thread.sleep(3000);
	    a.moveToElement(Intopage).build().perform();
	
	}
}

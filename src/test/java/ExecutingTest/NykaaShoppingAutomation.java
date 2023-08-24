package ExecutingTest;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import Nykaapageobject.FinalProductsel;
import Nykaapageobject.Loginpage;
import Nykaapageobject.addresspage;
import Nykaapageobject.brandSelection;
import Nykaapageobject.cardDetails;
import Nykaapageobject.cartpage;
import Nykaapageobject.newProducts;
import Nykaapageobject.productSelection;
import TextComponents.BaseTest;





@SuppressWarnings("unused")
public class NykaaShoppingAutomation extends BaseTest  {

@Test

	public void NykaShopping() throws InterruptedException, IOException {

	
	 productSelection Products= new productSelection(driver);
      Products.Products();
      utilitypackage.switchWindow switchToWindow= new utilitypackage.switchWindow(driver);
      switchToWindow.switchToWindow();
      brandSelection brands =new brandSelection(driver);
      brands.Brands();
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,3500)");
      brandSelection selectProd= new brandSelection(driver);
      selectProd.selectProd();
      utilitypackage.switchWindow getCurrentWindowHandles = new utilitypackage.switchWindow(driver);
      getCurrentWindowHandles.getCurrentWindowHandles();
      newProducts newProdSelect= new newProducts(driver);
      newProdSelect.newProdSelect();
      utilitypackage.switchWindow getCurrentWindowHandles1 = new utilitypackage.switchWindow(driver);
      getCurrentWindowHandles1.getCurrentWindowHandles1();
      newProducts newProdSelect1= new newProducts(driver);
	  newProdSelect1.newProdSelect1(); 
	  utilitypackage.switchWindow getCurrentWindowHandles2 = new utilitypackage.switchWindow(driver);
	  getCurrentWindowHandles2.getCurrentWindowHandles2();	 
	  newProducts newProdSelect2= new newProducts(driver);
      newProdSelect2.newProdSelect2();  
	  FinalProductsel  chartprods = new FinalProductsel(driver);
	  chartprods.chartprods();
	  utilitypackage.switchWindow getCurrentWindowHandles3 = new utilitypackage.switchWindow(driver);
	  getCurrentWindowHandles3.getCurrentWindowHandles3();
	  FinalProductsel finalprods = new FinalProductsel(driver);
	  finalprods.finalprods();
	  cartpage Lastproceedings= new cartpage(driver);  
	  Lastproceedings.Lastproceedings();
      addresspage address= new addresspage(driver);
      address.address();
	 // cardDetails cardPayment = new cardDetails(driver);
	  //cardPayment.cardPayment();
	
	  
	  
	  
	}

		
	}



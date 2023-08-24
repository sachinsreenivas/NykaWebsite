package utilitypackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class switchWindow {

	    WebDriver driver;

	    public switchWindow(WebDriver driver1) {
	        driver = driver1;
	
	    
	    }
	    @SuppressWarnings("unused")
		public void switchToWindow() {
	     
	       Set<String> handles=driver.getWindowHandles();  
	        Iterator<String> it=handles.iterator();
	      String parentWindowId=it.next();
	       String childWindow=it.next();
	       driver.switchTo().window(childWindow);
	       
	    }

	     public void getCurrentWindowHandles() {
		   Set<String> windowHandles= driver.getWindowHandles();
		  List<String> windowHandlesList = new ArrayList<>(windowHandles);
		    driver.switchTo().window(windowHandlesList.get(2));
		    }
	        
	  public void getCurrentWindowHandles1() {
	  Set<String> windowHandles1= driver.getWindowHandles();
	     List<String> windowHandlesList1 = new ArrayList<>(windowHandles1);
	    driver.switchTo().window(windowHandlesList1.get(1));

	  }
	    
	  
	   public void getCurrentWindowHandles2() {
	  Set<String> windowHandles2= driver.getWindowHandles();
	   List<String> windowHandlesList2 = new ArrayList<>(windowHandles2);
		driver.switchTo().window(windowHandlesList2.get(3));
	    }
	
	   public void getCurrentWindowHandles3() {
	    Set<String> windowHandles3= driver.getWindowHandles();
	    List<String> windowHandlesList3 = new ArrayList<>(windowHandles3);
		 driver.switchTo().window(windowHandlesList3.get(4));
		
        }

	   
	   
	   
}
	    	    
	    	    

		


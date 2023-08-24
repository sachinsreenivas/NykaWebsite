package TextComponents;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Nykaapageobject.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {


public WebDriver driver;
public  Loginpage LoginPage;
	
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//utilitypackage//GlobalData.properties");
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\sachin sreenivas\\eclipse-workspace\\part-2\\Drivers\\Edgedriver\\msedgedriver.exe");
		 driver = new EdgeDriver();
	}	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
		return driver;
	
	
	}

	public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"//reports//"+ testCaseName+ ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"//reports//"+ testCaseName +".png";
		
	}
	
	
	@BeforeMethod(alwaysRun=true)
   public  void LaunchApplication() throws IOException {

  	 driver = initializeDriver();
    LoginPage = new Loginpage(driver);
    LoginPage.goTo(); 
}

  @AfterMethod(alwaysRun=true)
   public void tearDown()
{
	driver.close();
}
}
	
	
	
	
	
	
	
	
	
	


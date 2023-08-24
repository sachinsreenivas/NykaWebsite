package ExecutingTest;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class demoreports {
	ExtentReports extent;
	
	@BeforeTest
	public void config() 
	{
	
	String path= System.getProperty("user.dir")+"//reports//index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation Results");
	reporter.config().setDocumentTitle("Test Results");
	
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester","Nyka UI");
	
    
}
	
	
	@Test
	public void demo()
	{
		
	extent.createTest("Demo");
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\sachin sreenivas\\eclipse-workspace\\ExtentReport\\Drivers\\Cromedriver\\chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	driver.get("https://www.nykaa.com/");
	System.out.println(driver.getTitle());
	extent.flush();
	}
	
}
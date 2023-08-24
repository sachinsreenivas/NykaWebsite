package TextComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;

import utilitypackage.ExtentReportNG;

@SuppressWarnings("unused")
public class Listeners implements ITestListener
{
ExtentTest test;
	ExtentReports extent = ExtentReportNG.getReportObject();
	

	@Override
public void onTestStart(ITestResult result) {
	extent.createTest(result.getMethod().getMethodName());
}

@Override
public void onTestSuccess(ITestResult result) {
	test.log(Status.PASS, "Passed");
}

@Override
public void onTestFailure(ITestResult result) {
	test.fail(result.getThrowable());
  
}

@Override
public void onTestSkipped(ITestResult result) {
	extent.flush();
}




}

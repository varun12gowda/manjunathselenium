package genericLibraries;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenerIplementation implements ITestListener {
	ExtentSparkReporter reporter=new ExtentSparkReporter("./reports/suite11.html");
	ExtentReports report=new ExtentReports();
	 static public  ExtentTest logger;
			
	@Override
	public void onTestStart(ITestResult result) {
		logger=report.createTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS,"This test is passes "+result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
	logger.log(Status.FAIL, "this test is failed"+result.getMethod().getMethodName());
	logger.addScreenCaptureFromPath(TakingScreenshots.takingScreenShot(result.getMethod().getMethodName()));
	System.out.println(TakingScreenshots.takingScreenShot(result.getMethod().getMethodName()));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.log(Status.SKIP,"This test is OnTestSkipped "+result.getMethod().getMethodName());

	}

	@Override
	public void onStart(ITestContext context) {
		report.attachReporter(reporter);

	}

	@Override
	public void onFinish(ITestContext context) {
	report.flush();
	}
	

}

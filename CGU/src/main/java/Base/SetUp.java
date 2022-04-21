package Base;


import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.apache.commons.io.FileUtils;




import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
// i wrote sumthing
public class SetUp {
	
	public static WebDriver driver;
	public static ExtentReports extentreports;
	public static ExtentTest extentTest;
	
	@BeforeTest
	public void setExtent()
	{
		extentreports = new ExtentReports(System.getProperty("user.dir")+"/Reports/ExtentReport.html", true);
		extentreports.addSystemInfo("Host Name", "MamatHa Sreepada, Host");
		extentreports.addSystemInfo("User Name", "MamatHa Sreepada");
		extentreports.addSystemInfo("Environment", "QA");
	}
	
	@AfterTest
	public void endReport()
	{
		extentreports.flush();
	}
	
	public static String getscreenshot(WebDriver driver, String screenshotName) throws IOException
	{
		String dateName = new SimpleDateFormat("yyyyMMdd").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// After execution you could see a folder "FailedTestScreenshots"
		//under src folder
		//String destination = System.getProperty("user.dir") + "/Reports/" + screenshotName + dateName + ".png";
		String destination = System.getProperty("user.dir") + "/ScreenShot/" + "ABC.png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source,finalDestination);
		return destination;
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException 
	{
		if(result.getStatus()== ITestResult.FAILURE)
		{
			extentTest.log(LogStatus.FAIL," TEST CASE FAILED IS "+ result.getName());// to add name in extent reports
			extentTest.log(LogStatus.FAIL," TEST CASE FAILED IS "+ result.getThrowable());// to add error/exception
			String screenshotpath = SetUp.getscreenshot(driver, result.getName()); 
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotpath));// to add the screenshot in extentreports
			//extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotpath)); // to add screencast/video
		}
		else if(result.getStatus()== ITestResult.SKIP)
		{
			extentTest.log(LogStatus.SKIP," TEST CASE SKIPPED IS "+ result.getName());
			
		}
		else if(result.getStatus()== ITestResult.SUCCESS)
		{
			extentTest.log(LogStatus.PASS," TEST CASE PASSED IS "+ result.getName());
			
		}
		extentreports.endTest(extentTest); // ending test and ends the current test and prepare to create html report
		driver.quit();
		
	}
	
	@BeforeMethod
	public void BrowserStart() 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pavan\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.cgu.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void BrowserClose()
	{
	 driver.quit();	
	}


}

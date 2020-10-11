package Qaclickacademy.mavenJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	ExtentReports extent;

	@BeforeTest

	public void config()

	{
		// ExtentReports , ExtentSparkReporter it is the mandatory class
String path = System.getProperty("user.dir") + "\\reports\\index.html";
// it is used for configuration of the reports
		ExtentSparkReporter a1 = new ExtentSparkReporter(path);
        a1.config().setReportName("Automation updated");
		a1.config().setTheme(Theme.STANDARD);
       a1.config().setDocumentTitle("Test output");
		
		// it is mainly used for the execution of the reports.
		extent = new ExtentReports();
		// sent the configuration details to the execution class
        extent.attachReporter(a1);
		// it is used to give the tester name
   extent.setSystemInfo("automation engineer in 2020", "roy Automation");
}

	@Test
public void initialDemo() {
		
 //if it is pass, it will update as pass otherwise if is is fail, it will update as fail.
		      //anywhere we can give the below code.              
		ExtentTest test=extent.createTest("Initial automation practice updates"); 

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		//explicility we are making it as fail.
		//test.fail("result does not match");
		
//it is mandatory to give the flash at the end, if we give flash, it will understand that the test is done and it will stop monitoring it.
		extent.flush();

	}

}

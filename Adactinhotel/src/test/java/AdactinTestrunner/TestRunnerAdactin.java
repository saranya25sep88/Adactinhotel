package AdactinTestrunner;

	import java.io.File;
	import java.io.IOException;

	import org.junit.AfterClass;
	import org.junit.BeforeClass;
	import org.junit.runner.RunWith;
	import org.openqa.selenium.WebDriver;

	import com.cucumber.listener.Reporter;
import AdactinBaseclass.BaseClass;
import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				features = "src\\test\\java\\AdactinFeaturefiles\\Loginpage.feature",
	            glue =   {"AdactinStepdefinition"},
	            plugin = {"pretty","json:src\\test\\resource\\ReportsAdactin\\reports\\reports.json",
	                      "html:src\\test\\resource\\ReportsAdactin\\reports",
	                      "junit:src\\test\\resource\\com\\ReportsAdactin\\reports"},
	            strict=true,	            
	            monochrome=true,
	            dryRun=false)

		public class TestRunnerAdactin extends BaseClass{

		
              //  public static WebDriver driver;
		
		@BeforeClass
		public static void SetupIntialization() throws Exception 
		{
			
			driver = launchBrowser("chrome");
		}
		
	/*	@AfterClass
		public static void quit() throws IOException {
			driver.quit();*/
}
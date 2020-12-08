package MyStrore.Test.base;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import MyStrore.util.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
     
     
     public ExtentReports EReport = ExtentManager.getInstance();
     public ExtentTest ETest = null;

     public WebDriver driver = null;
     
     

     public void openbrowser(String browsertype)
     {
          if (browsertype.equalsIgnoreCase("chrome"))
          {

               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
          } 
          else if (browsertype.equalsIgnoreCase("firefox"))
          {
               WebDriverManager.firefoxdriver().setup();
               driver = new FirefoxDriver();
          } 
          else if (browsertype.equalsIgnoreCase("Edge")) 
          {
               WebDriverManager.edgedriver().setup();
               driver = new EdgeDriver();
          }

          ETest.log(LogStatus.INFO, "Browser opened the succcessfully" + browsertype);

          driver.manage().window().maximize();
          ETest.log(LogStatus.INFO, "Browser Maximised");


          driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

     }

     
     public void reportpass(String message)
     {
          ETest.log(LogStatus.PASS, message);
     }
     
     public void reportfail(String message)
     {
          ETest.log(LogStatus.FAIL, message);
          takeScreenshot();
          Assert.fail(message);
     }
     
public void takeScreenshot(){
          
          // fileName of the screenshot
          Date d=new Date();
          String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
          // store screenshot in that file
          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          try {
               FileUtils.copyFile(scrFile, new File("screenshots//"+screenshotFile));
          } catch (IOException e) {
               e.printStackTrace();
          }
          //put screenshot file into the reports
          ETest.log(LogStatus.INFO,"Screenshot-> "+ ETest.addScreenCapture(System.getProperty("user.dir")+"//screenshots//"+screenshotFile));
               
     }
}

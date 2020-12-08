package MyStrore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import MyStrore.base.basepage;
import MyStrore.util.Constants;

public class Launchpage extends basepage{
     
     
     @FindBy(className="login")
     public WebElement signin;
     
     @FindBy(linkText="Contact us")
     public WebElement contactus;
     
     
     //Reusable methods of launch page
     
     //Create constructor
     public Launchpage(WebDriver driver, ExtentTest ETest)
     {
          this.driver = driver;
          this.ETest = ETest;
          
     }
     
     public boolean gotosignin()
     {
          //Selenium code for login page
          driver.get(Constants.APP_URL);
          ETest.log(LogStatus.INFO, "App url started successfully"+Constants.APP_URL+"Opened");
          
          
          signin.click();
          ETest.log(LogStatus.INFO, "Signin module is clicked successfully");
          
          Loginpage loginpage = new Loginpage(driver,ETest);
          PageFactory.initElements(driver, loginpage);
          boolean loginstatuss = loginpage.dosignin();
          return loginstatuss;
          
          
     }

}

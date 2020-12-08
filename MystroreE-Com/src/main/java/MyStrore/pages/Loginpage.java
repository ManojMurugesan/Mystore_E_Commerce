package MyStrore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import MyStrore.base.basepage;
import MyStrore.util.Constants;

public class Loginpage extends basepage{
     
     
     @FindBy(id="email")
     public WebElement emailid;
     
     @FindBy(id="passwd")
     public WebElement password;
     
     @FindBy(css="body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.row div.col-xs-12.col-sm-6:nth-child(2) form.box div.form_content.clearfix p.submit:nth-child(4) button.button.btn.btn-default.button-medium > span:nth-child(1)")
     public WebElement signin;
     
     //Any other element
     
     
     //Constructor method
      public Loginpage(WebDriver driver, ExtentTest ETest)
      {
           this.driver = driver;
           this.ETest = ETest; 
      }
     
     
     //Reusable methods
     
     public boolean dosignin()
     {
          emailid.sendKeys(Constants.USER_NAME);
          ETest.log(LogStatus.INFO, "User name got enetered in the emailid filed");
          
          password.sendKeys(Constants.USER_PASSWORD);
          ETest.log(LogStatus.INFO, "Password got enetered in the Password filed");
          
          signin.click();
          ETest.log(LogStatus.INFO, "Signin got clicked successfully");
          
          Homepage homepage = new Homepage(driver, ETest);
          PageFactory.initElements(driver, homepage);
          boolean displaystatus = homepage.landingpage();
          return displaystatus;
          
     }

     //Any other reusable method
}

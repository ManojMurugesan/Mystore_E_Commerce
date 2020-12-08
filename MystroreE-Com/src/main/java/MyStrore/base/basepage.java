package MyStrore.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentTest;

public class basepage {

     public ExtentTest ETest = null;

     public WebDriver driver = null;
     
     public Actions actions = null;
     
     
     public boolean iselementpresent(WebElement Element)
     
     {
          boolean displaystate = Element.isDisplayed();
          
          if(displaystate)
          {
               return true;
          }
          else
          {
               return false;
          }
     }
}

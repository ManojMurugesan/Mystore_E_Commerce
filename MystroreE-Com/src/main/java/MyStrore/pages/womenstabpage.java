package MyStrore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import MyStrore.base.basepage;

public class womenstabpage extends basepage{

     //Find the casual dress option in womenstab
     @FindBy(css="a[title='Women']")
     public WebElement casualdress;
     
     //More elements to be found
     
     
     //Constructor method
     public womenstabpage(WebDriver driver, ExtentTest ETest )
     {
         this.driver = driver;
         this.ETest = ETest;
     }
     
     
     //Reusable methods
     public void casualdres()
     {
          actions = new Actions(driver);
          actions.moveToElement(casualdress).click().build().perform();
          ETest.log(LogStatus.INFO, "Casual dress sub module is clicked from womens tab");
     }
}

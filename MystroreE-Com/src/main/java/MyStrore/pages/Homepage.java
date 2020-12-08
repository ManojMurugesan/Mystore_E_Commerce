package MyStrore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import MyStrore.base.basepage;

public class Homepage extends basepage {
     
  
     
     @FindBy(xpath="//span[contains(text(),'Order history and details')]")
     public WebElement Orderhistory;
     
     @FindBy(linkText="My credit slips")
     public WebElement mycreditslip;
     
     @FindBy(linkText="My addresses")
     public WebElement myaddress;
     
     @FindBy(linkText="My personal information")
     public WebElement mypersonalinfo;
     
     @FindBy(linkText="My wishlists")
     public WebElement mywishlists;
     
     @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/span[1]")
     public WebElement Homebtn;
     
     //Find the womens tab in homepage
     @FindBy(css="a[title='Women']")
     public WebElement womenstab;
     
     //Find the Dresses tab in homepage
     @FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
     public WebElement dressestab;
     
     //Find the t-shirt tab in homepage
     @FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
     public WebElement Tshirttab;
     
     
     //Resuable method to navigate to order history and details
     
     //Resuable method to navigate mycredditslip
     
   //Resuable method to navigate myaddress
     
   //Resuable method to navigate mypersonalinfo
     
   //Resuable method to navigate mywishlists
     
   //Resuable method to navigate Homebtn


     //Constaructors 
     public Homepage(WebDriver driver,ExtentTest ETest)
     {
         this.driver = driver;
         this.ETest = ETest;
     }
     
     
     //Reusable method for verifying the homepage
     public boolean landingpage()
     {   
          //Method called from basepage for iselementpresent
          return (iselementpresent(Orderhistory));
     }
     
     public void homescreen()
     {
          Homebtn.click();  
          ETest.log(LogStatus.INFO, "Home button got clicked");
     }
     
     public boolean mycreditslip()
     {
          return (iselementpresent(mycreditslip));
     }
     
     public void womenstabb()
     {
          actions = new Actions(driver);
          actions.moveToElement(womenstab).perform();
          ETest.log(LogStatus.INFO, "womenstab is hovered by mouse");
     }
     
     public void Dressestabb()
     {
          actions = new Actions(driver);
          actions.moveToElement(dressestab).perform();
          ETest.log(LogStatus.INFO, "Dresses is hovered by mouse");
     }
     
     public void Tsgirtstabb()
     {
          actions = new Actions(driver);
          actions.moveToElement(Tshirttab).perform();
          ETest.log(LogStatus.INFO, "Tshirtstab is hovered by mouse");
     }
}

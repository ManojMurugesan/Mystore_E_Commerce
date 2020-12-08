package MyStrore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import MyStrore.base.basepage;

public class Myaccountpage extends basepage {
    
     
     @FindBy(css="img[class='logo img-responsive']")
     public WebElement youlogo;
     
     @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
     public WebElement FadedShortSleeveImage;
     
     @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]")
     public WebElement FadedShortSleeveTshirtsaddcart;
     //first item
     
     @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
     public WebElement BlouseAddcartImage;
     
     @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]/span[1]")
     public WebElement BlouseAddcart;
     //Second item
     
     @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
     public WebElement printeddress1Image;
     
     @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[2]/div[2]/a[1]/span[1]")
     public WebElement printeddress1addcart;
     //Third item
     
     @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/div[1]/a[1]/img[1]")
     public WebElement printeddress2Image;
     
     @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[2]/div[2]/a[1]/span[1]")
     public WebElement printeddress2addcart;
     //Fourth item
     
     @FindBy(xpath="//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]")
     public WebElement continueshopping;
     
     @FindBy(css="a[title='View my shopping cart']")
     public WebElement Mycart;
     
     //Checkout button in mycart dropdown
     @FindBy(css="a[id='button_order_cart']")
     public WebElement checkoutmycart;
     
     

     
     
     //More elements to be found
     
     
     //Constructor to be developed
     public Myaccountpage(WebDriver driver, ExtentTest ETest)
     {
          this.driver = driver;
          this.ETest = ETest;
     }
     
     
     
     //Reusable methods
     public boolean logo()
     {
          return (iselementpresent(youlogo)); 
     }
     
     public void itemstoadd()
     {
          actions = new Actions(driver);
          actions.moveToElement(FadedShortSleeveImage).perform();
          FadedShortSleeveTshirtsaddcart.click();
          ETest.log(LogStatus.INFO, "First faded short sleeve item added to cart");
          continueshopping.click();
          ETest.log(LogStatus.INFO, "Continue shopping for 1st item clicked");
          
          actions.moveToElement(BlouseAddcartImage).perform();
          BlouseAddcart.click();
          ETest.log(LogStatus.INFO, "Blouse item added to cart");
          continueshopping.click();
          ETest.log(LogStatus.INFO, "Continue shopping for 2nd item clicked");
          
          actions.moveToElement(printeddress1Image).perform();
          printeddress1addcart.click();
          ETest.log(LogStatus.INFO, "Printed dress1 item added to cart");
          continueshopping.click();
          ETest.log(LogStatus.INFO, "Continue shopping for 3rd item clicked");
          
          actions.moveToElement(printeddress2Image).perform();
          printeddress2addcart.click();
          ETest.log(LogStatus.INFO, "Printed dress2 item added to cart");
          continueshopping.click();
          ETest.log(LogStatus.INFO, "Continue shopping for 4th item clicked");
          
          
     }
     
     public void mycart()
     {
          actions.moveToElement(Mycart).perform();
          ETest.log(LogStatus.INFO, "Mouse hovered over the mycart");
          
          checkoutmycart.click();
          ETest.log(LogStatus.INFO, "Checkout button is clicked in mycart drop down");
          
     }

}

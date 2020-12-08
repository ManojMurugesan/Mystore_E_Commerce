package MyStrore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import MyStrore.base.basepage;

public class Orderpage extends basepage {
    
     //Find the Delete the first item in the order page
     @FindBy(css="a[id='1_1_0_414632'][title='Delete']")
     public WebElement Delete;
     
     @FindBy(css="a[id='cart_quantity_up_2_7_0_414632'][class='cart_quantity_up btn btn-default button-plus']")
     public WebElement plus1item;
     
     @FindBy(css="a[id='cart_quantity_up_3_13_0_414632'][class='cart_quantity_up btn btn-default button-plus']")
     public WebElement plus2item;
     
     @FindBy(css="a[id='cart_quantity_up_4_16_0_414632'][class='cart_quantity_up btn btn-default button-plus']")
     public WebElement plus3item;
     
   //Proceed to checkout button in address tab
     @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
     public WebElement addressproceedtocheckout;
     
     //Proceed to checkout button in summary tab
     @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")
     public WebElement proceedtocheckout;
     
     //Use this address checkbox
     @FindBy(css="input[type='checkbox']")
     public WebElement Usethisaddresscheckbox;
     
     //Add a new address
     @FindBy(css="a[class='button button-small btn btn-default'][title='Add']")
     public WebElement Addnewaddress;
     
     //Add test message in address tab area
     @FindBy(css="textarea[name='message']")
     public WebElement message;
     
   //Check the I aggree checkbox in shipping tab
     @FindBy(css="input[type='checkbox'][id='cgv']")
     public WebElement Iagreecheckbox;
     
   //Proceed to checkout button in shipping tab
     @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")
     public WebElement proceedtocheckoutbtnshippingtab;
     
   //Finding the payment blackwire button
     @FindBy(css="a[class='bankwire']")
     public WebElement Blackwirepayment;
     
   //Finding the I confirm my order button
     @FindBy(css="button[class='button btn btn-default button-medium']")
     public WebElement confirmmyorder;
     
   //Finding the your order confirm text
     @FindBy(xpath="//strong[contains(text(),'Your order on My Store is complete.')]")
     public WebElement yourordertextconfirm;
     
     //Finding the home icon in payment tab
     @FindBy(css="i[class='icon-home']")
     public WebElement homeicon;
     
     //More elements to be found
     
     //Constructor method
     public Orderpage(WebDriver driver, ExtentTest ETest)
     {
          this.driver = driver;
          this.ETest = ETest;
     }
     
     //Reusable methods here
     public void checkoutpage()
     {
          Delete.click();
          ETest.log(LogStatus.INFO, "First item deleted from cart");
          plus1item.click();
          ETest.log(LogStatus.INFO, "Added one more quantity in 1st item");
          plus2item.click();
          ETest.log(LogStatus.INFO, "Added one more quantity in 2nd item");
          plus3item.click();
          plus3item.click();
          ETest.log(LogStatus.INFO, "Added two more quantity in 2nd item");
          proceedtocheckout.click();
          ETest.log(LogStatus.INFO, "Proceed to checkout button clicked on the oreder page");
          
     }
     
     
     public void proceedtocheckoutcmn()
     {
          proceedtocheckout.click();
          ETest.log(LogStatus.INFO, "Proceed to checkout button clicked on the oreder page");
     }
     
     public void addressproceedtocheckoutc()
     {
          addressproceedtocheckout.click();
          ETest.log(LogStatus.INFO, "Proceed to checkout button clicked on the summary");
     }
     
     public void checkbox()
     {
          Usethisaddresscheckbox.click();
          ETest.log(LogStatus.INFO, "use thois address Checkbox is checked");
     }

     public boolean addnewaddressvis()
     {
          return(iselementpresent(Addnewaddress));
     }
     
     public void IAgreecheckbox()
     {
          Iagreecheckbox.click();
          ETest.log(LogStatus.INFO, "I Agree Checkbox is checked");
     }
     public void blacwirepaymntbtn()
     {
          Blackwirepayment.click();
          ETest.log(LogStatus.INFO, "Black wire payment button is clicked");
          
     }
     public void confirmmyorderbtn()
     {
          confirmmyorder.click();
          ETest.log(LogStatus.INFO, "Confirm My order button is clicked");
     }
     
     public boolean yourorderconfirmtxt()
     {
          return(iselementpresent(yourordertextconfirm));  
          
     }
     
     /*public void addresstabproceedtocheckout()
     {
          addressproceedtocheckout.click();
          ETest.log(LogStatus.INFO, "proceed to checkout btn in address is clicked");
     }*/
     
     public void shippingtabproceedtocheckout()
     {
          proceedtocheckoutbtnshippingtab.click();
          ETest.log(LogStatus.INFO, "proceed to checkout btn in shippingtab is clicked");
     }
     
     public void textmessageaddrestab()
     {
          message.sendKeys("If you would like to add a comment about your order, please write it in the field below.");
          ETest.log(LogStatus.INFO, "Test got printed in the message text box");
     }
     
     public void homeiconclick()
     {
          homeicon.click();
          ETest.log(LogStatus.INFO, "Home icon got clicked in the payment tabd");
     }

}

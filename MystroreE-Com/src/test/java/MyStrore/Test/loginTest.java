package MyStrore.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import MyStrore.Test.base.BaseTest;
import MyStrore.pages.Homepage;
import MyStrore.pages.Launchpage;
import MyStrore.pages.Myaccountpage;
import MyStrore.pages.Orderpage;
import MyStrore.pages.womenstabpage;
import MyStrore.util.Constants;

public class loginTest extends BaseTest{
     
     @Test(priority = 1)
     public void testlogin() 
     { 
          ETest = EReport.startTest("loginTest");

          ETest.log(LogStatus.INFO, "Login test has started");

          openbrowser(Constants.BROWSER_TYPE1);
        
          Launchpage launchpage =new Launchpage(driver,ETest);
          PageFactory.initElements(driver, launchpage);
          boolean loginstatus = launchpage.gotosignin();
          
          if(loginstatus)
          {
              //Pass the test case
               reportpass("Login test has passed");
          }else
          {
               //fail the test case
               reportfail("Login Test has failed");
          }
          
          Homepage home = new Homepage(driver,ETest);
          PageFactory.initElements(driver, home);
          home.landingpage();
          ETest.log(LogStatus.INFO, "Order history is displayed");
          
          home.mycreditslip();
          ETest.log(LogStatus.INFO, "My credit slip details is displayed");
          
          String title = driver.getTitle();
          System.out.println(title);
          
          if(title.contentEquals("My account - My Store"))
          {
               reportpass("Title matched");
               ETest.log(LogStatus.INFO, "Actual title matched with expected title");
          }else
          {
               reportfail("Title not matched");
               ETest.log(LogStatus.INFO, "Actual title not matched with expected title");
          }
        
     }
     
     @Test(priority = 2)
     public void homepagescreen()
     {
          Homepage home = new Homepage(driver,ETest);
          PageFactory.initElements(driver, home);
          home.homescreen();
          
          Myaccountpage myaccount = new Myaccountpage(driver,ETest);
          PageFactory.initElements(driver, myaccount);
          myaccount.logo();
          ETest.log(LogStatus.INFO, "your logo is displayed");
       
     }
     @Test(priority = 3)
     public void addingitem()
     {
          Myaccountpage addcart = new Myaccountpage(driver,ETest);
          PageFactory.initElements(driver, addcart);  
          addcart.itemstoadd();
          //Hovering mouse over the mycart
          addcart.mycart();
          
     }

     @Test(priority = 4)
     public void ordercheckoutpage()
     {
          Orderpage order = new Orderpage(driver,ETest);
          PageFactory.initElements(driver, order);
          order.checkoutpage();
     }
     
     @Test(priority = 5)
     public void checkboxandaddress() 
     {
          Orderpage order = new Orderpage(driver,ETest);
          PageFactory.initElements(driver, order);
          order.checkbox();
          boolean addadressbtn = order.addnewaddressvis();
          if(addadressbtn)
          {
               reportpass("Address add button is  visible");
               ETest.log(LogStatus.INFO, "Address add button is  visible");
          }else
          {
               reportfail("Address add button not visible");
               ETest.log(LogStatus.INFO, "Address add button not visible");
          }
          order.checkbox();
          order.textmessageaddrestab();
          order.addressproceedtocheckoutc();
          order.IAgreecheckbox();
          order.shippingtabproceedtocheckout();
          order.blacwirepaymntbtn();
          order.confirmmyorderbtn();
          boolean ordertxt =order.yourorderconfirmtxt();
          
          if(ordertxt)
          {
               reportpass("Your Order text is displayed");
          }
          else
          {
               reportfail("Your order test is not displayed");
          }
          
          order.homeiconclick();
     }
     @Test(priority = 6)
     public void womenstab()
     {
          Homepage home = new Homepage(driver,ETest);
          PageFactory.initElements(driver, home);
          home.womenstabb();
          
          womenstabpage tab =new womenstabpage(driver,ETest);
          PageFactory.initElements(driver, tab);
          tab.casualdres();
     }
     
     @AfterTest
     public void testclosure() 
     {
          if (EReport != null) {
               EReport.endTest(ETest);
               EReport.flush();
          }
          if (driver != null) {
               
              //driver.quit();

          }
     }
}

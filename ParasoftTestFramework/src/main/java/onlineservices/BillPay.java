package onlineservices;

import com.parasoft.Browser;
import com.parasoft.pages.Pages;

public class BillPay {

    static String url= "https://parabank.parasoft.com/parabank/services/bank?_wadl&_type=xml";

    public void clickBillPayText(){
        Pages.homePage().goTo();
        Browser.billPay();
    }

    public boolean isAt(){
        return Browser.getUrl().equals(url);
    }
}

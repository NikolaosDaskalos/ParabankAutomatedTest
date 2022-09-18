package onlineservices;

public class OnlineServices {

    public static BillPay billPay(){
        BillPay billPay = new BillPay();
        return billPay;
    }

    public static AccountHistory accountHistory(){
        AccountHistory accountHistory = new AccountHistory();
        return accountHistory;
    }

    public static TransferFundsOnlineServices transferFunds(){
        TransferFundsOnlineServices transferFunds = new TransferFundsOnlineServices();
        return transferFunds;
    }
}
package com.parasoft.atmservices;

import com.parasoft.menu.Menu;
import org.checkerframework.checker.i18nformatter.qual.I18nMakeFormat;

public class ATMServices {

    public static WithdrawFunds withdrawFunds(){
        WithdrawFunds withdrawFunds = new WithdrawFunds();
        return withdrawFunds;
    }

    public static TransferFunds transferFunds(){
        TransferFunds transferFunds = new TransferFunds();
        return transferFunds;
    }

    public static CheckBalances checkBalances(){
        CheckBalances checkBalances = new CheckBalances();
        return checkBalances;
    }

    public static MakeDeposits makeDeposits(){
        MakeDeposits makeDeposits = new MakeDeposits();
        return makeDeposits;
    }
}

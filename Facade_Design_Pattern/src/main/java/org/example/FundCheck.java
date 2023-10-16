package org.example;

import java.sql.SQLOutput;

public class FundCheck {
    private int cashInAccount = 100;

    private int getCashInAccount() {
        return cashInAccount;
    }

    private void increaseCashAmount(int cashDeposited) {
        cashInAccount += cashDeposited;
    }

    private void decreaseCashAmount(int cashWithdraw) {
        cashInAccount = cashInAccount - cashWithdraw;
    }

    public boolean haveEnoughMoney(int cashWithdraw) {
        if (cashWithdraw > getCashInAccount()) {
            System.out.println("Sorry!!! You don't have enough money");
            return false;
        } else {
            decreaseCashAmount(cashWithdraw);
            System.out.println("Cash Withdrawn Successfully!!! Total Remaining Balance : "+ cashInAccount);
            return true;
        }
    }
    public void makeDeposits(int cashDeposit){
        System.out.println("Cash desposited successfully");
        increaseCashAmount(cashDeposit);
        System.out.println("Total Bank Balance : "+ cashInAccount);
    }
}

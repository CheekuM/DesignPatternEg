package org.example;

import java.sql.SQLOutput;

public class BankFacadeDesignPattern {
    private int accountNumber;
    private int securityCode;
    AccountCheck accountCheck;
    WelcomeToBank welcomeToBank;
    FundCheck fundCheck;
    SecurityCheck securityCheck;

    BankFacadeDesignPattern(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;
        accountCheck = new AccountCheck();
        welcomeToBank = new WelcomeToBank();
        fundCheck = new FundCheck();
        securityCheck = new SecurityCheck();
    }

    private int getAccountNumber() {
        return accountNumber;
    }

    private int getSecurityCode() {
        return securityCode;
    }

    public void cashWithdraw(int cashWithdraw) {
        if (accountCheck.isValidAccountNumber(getAccountNumber()) && securityCheck.isCorrectCode(getSecurityCode())) {
            fundCheck.haveEnoughMoney(cashWithdraw);
        } else {
            System.out.println("Invalid AccountNumber and Security Code");
        }
    }

    public void cashDeposit(int cashDeposit) {
        if (accountCheck.isValidAccountNumber(getAccountNumber()) && securityCheck.isCorrectCode(getSecurityCode())) {
            fundCheck.makeDeposits(cashDeposit);
        } else {
            System.out.println("Invalid Account Number and Security Code");
        }

    }

}

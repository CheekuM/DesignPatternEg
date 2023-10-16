package org.example;

public class AccountCheck {
    private int accountNumber=12345;
    public int getAccountNumber(){
        return accountNumber;
    }

    public boolean isValidAccountNumber(int accountNumber){
        if(accountNumber==getAccountNumber()) return true;
        else return false;
    }
}

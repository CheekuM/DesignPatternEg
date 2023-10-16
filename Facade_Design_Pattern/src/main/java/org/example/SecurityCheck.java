package org.example;

public class SecurityCheck {
    private int securityCode=12345;
    public int getSecurityCode(){
        return securityCode;
    }

    public boolean isCorrectCode(int securityCode){
        if(securityCode==getSecurityCode()) return true;
        else return false;
    }
}

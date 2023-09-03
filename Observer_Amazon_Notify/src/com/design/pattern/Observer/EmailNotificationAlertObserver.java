package com.design.pattern.Observer;

import com.design.pattern.Observable.IphoneStockObservable;
import com.design.pattern.Observable.OnePlusStockObservable;
import com.design.pattern.Observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{
    String email;
    StockObservable observable;
    public EmailNotificationAlertObserver(String email, StockObservable observable){
        this.email=email;
        this.observable=observable;
    }
    @Override
    public void update() {
     sendEmailNotification(observable);
    }

    private void sendEmailNotification(StockObservable observable){
         String productName = null;
        if(observable instanceof IphoneStockObservable){
            productName = "Iphone";
        }else if (observable instanceof OnePlusStockObservable)

        System.out.println("Email Alert: "+productName+" is available now!!!");
    }

}

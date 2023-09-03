package com.design.pattern.Observer;

import com.design.pattern.Observable.IphoneStockObservable;
import com.design.pattern.Observable.OnePlusStockObservable;
import com.design.pattern.Observable.StockObservable;

public class TextNotificationObserver implements NotificationAlertObserver {

    StockObservable observable;

    public TextNotificationObserver(StockObservable observable) {
        this.observable = observable;
    }


    @Override
    public void update() {
        sendTextNotification();
    }

    public void sendTextNotification() {
        String productName = "";

        if (observable instanceof IphoneStockObservable) {
            productName = "Iphone";
        } else if (observable instanceof OnePlusStockObservable) {
            productName = "OnePlus";
        }
        System.out.println("Text Alert: " + productName + " is available now!!");
    }

}

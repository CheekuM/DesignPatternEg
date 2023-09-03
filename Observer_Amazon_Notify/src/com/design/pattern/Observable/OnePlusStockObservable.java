package com.design.pattern.Observable;

import com.design.pattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class OnePlusStockObservable implements StockObservable{
    List<NotificationAlertObserver> notificationAlertObserverList=new ArrayList<>();
    int stockCount=0;
    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObserverList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
       for(NotificationAlertObserver e: notificationAlertObserverList){
           e.update();
       }
    }

    @Override
    public void setStock(int stockCount) {
        if(stockCount == 0){
            notifySubscribers();
        }
        this.stockCount = this.stockCount + stockCount;

    }

    @Override
    public int getStock() {
        return stockCount;
    }
}

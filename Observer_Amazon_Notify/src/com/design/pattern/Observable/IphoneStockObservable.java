package com.design.pattern.Observable;

import com.design.pattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{
    public List<NotificationAlertObserver> notificationAlertObserverList=new ArrayList<>();
    public int stock =0;
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
        for(NotificationAlertObserver e:notificationAlertObserverList){
            e.update();
        }

    }

    @Override
    public void setStock(int stockCount) {
        if(stock == 0){
            notifySubscribers();
        }
        stock = stock + stockCount;
    }

    @Override
    public int getStock() {
        return stock;
    }
}

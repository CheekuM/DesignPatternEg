package com.design.pattern.Observable;

import com.design.pattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStock(int stockCount);
    public int getStock();


}

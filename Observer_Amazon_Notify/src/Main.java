import com.design.pattern.Observable.IphoneStockObservable;
import com.design.pattern.Observable.OnePlusStockObservable;
import com.design.pattern.Observable.StockObservable;
import com.design.pattern.Observer.EmailNotificationAlertObserver;
import com.design.pattern.Observer.NotificationAlertObserver;
import com.design.pattern.Observer.TextNotificationObserver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {



    public static void main(String[] args) {
        StockObservable iphoneStockObservable=new IphoneStockObservable();
        iphoneStockObservable.add(new TextNotificationObserver(iphoneStockObservable));
        iphoneStockObservable.add(new EmailNotificationAlertObserver("xyz@abc.com",iphoneStockObservable));

        iphoneStockObservable.setStock(20);

        StockObservable onePlusStockObservable = new OnePlusStockObservable();
        onePlusStockObservable.add(new TextNotificationObserver(onePlusStockObservable));
        onePlusStockObservable.add(new EmailNotificationAlertObserver("aman@xyz.com",onePlusStockObservable));
        onePlusStockObservable.setStock(10);

    }

}
package ObserverPatternExample;

import java.util.ArrayList;

public class StockMarket implements Stock {
    ArrayList<Observer> observer = new ArrayList<>();
    private int price;

    public void registerObserver(Observer ob) {
        observer.add(ob);
    }

    public void removeObserver(Observer ob) {
        observer.remove(observer.indexOf(ob));
    }

    public void notifyObservers() {
        for (Observer obs : observer) {
            obs.update(price);
        }
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }

}

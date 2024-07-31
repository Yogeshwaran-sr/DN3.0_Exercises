package ObserverPatternExample;

public class TestClass {
    public static void main(String[] args) {
        StockMarket stk = new StockMarket();

        Observer mob = new MobileApp("bob");
        Observer web = new WebApp("alice");

        stk.registerObserver(mob);
        stk.registerObserver(web);

        stk.setPrice(100);

        stk.removeObserver(mob);
        stk.setPrice(150);

    }
}

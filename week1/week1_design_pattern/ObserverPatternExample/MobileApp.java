package ObserverPatternExample;

public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    public void update(int price) {
        System.out.println(name + "bought using mobile app of price " + price);
    }

}

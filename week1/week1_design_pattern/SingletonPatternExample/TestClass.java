package SingletonPatternExample;

public class TestClass {
    public static void main(String args[]) {
        Logger logger = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if (logger == logger2) {
            System.out.println("object created using singleton");
        } else {
            System.out.println("object is not created using singleton");
        }
    }
}

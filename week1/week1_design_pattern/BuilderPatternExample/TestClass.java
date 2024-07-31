package BuilderPatternExample;

public class TestClass {
    public static void main(String[] args) {
        Computer computer = new Builder().setCpu("intel i9").setRam("8GB ram").setStorage("1TB SSD").build();

        Computer pc = new Builder().setCpu("intel i5").setRam("16GB ram").setStorage("2TB SSD").build();

        System.out.println("computer specs" + computer);
        System.out.println("pc specs" + pc);
    }
}

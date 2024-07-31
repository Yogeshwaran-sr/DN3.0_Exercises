package FactoryMethodPatternExample;

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("excel document opening");
    }

    public void close() {
        System.out.println("excel document closing");
    }
}

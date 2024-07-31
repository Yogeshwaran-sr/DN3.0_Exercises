package FactoryMethodPatternExample;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("pdf document opening");
    }

    public void close() {
        System.out.println("pdf document closing");
    }

}

package FactoryMethodPatternExample;

public class WordDocument implements Document {

    public void open() {
        System.out.println("word document opening");
    }

    public void close() {
        System.out.println("word document closing");
    }

}

package FactoryMethodPatternExample;

public class TestClass {
    public static void main(String[] args) {
        DocumentFactory execldoc = new ExcelDocumentFactory();
        Document execl = execldoc.createDocument();
        execl.open();
        execl.close();

        DocumentFactory pdfdoc = new PdfDocumentFactory();
        Document pdf = pdfdoc.createDocument();
        pdf.open();
        pdf.close();

        DocumentFactory worddoc = new WordDocumentFactory();
        Document word = worddoc.createDocument();
        word.open();
        word.close();
    }
}

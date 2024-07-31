package ProxyPatternExample;

public class RealImage implements Image {
    public void display(String image) {
        System.out.println("the image is:" + image);
    }
}

package ProxyPatternExample;

public class ProxyImage implements Image {
    public void display(String image) {
        RealImage rl = new RealImage();
        rl.display(image);
    }
}

package Various_Patterns_Proxy_Pattern;

public class Client {
    public static void main(String[] args) {
        // Using the ImageProxy to control access to the RealImage
        Image image = new ImageProxy("example.jpg");

        // The actual loading and displaying of the image happens here
        image.display();
    }
}

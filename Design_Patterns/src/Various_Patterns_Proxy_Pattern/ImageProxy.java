package Various_Patterns_Proxy_Pattern;

//ImageProxy class implementing the Image interface
class ImageProxy implements Image {
 private RealImage realImage;
 private String filename;

 public ImageProxy(String filename) {
     this.filename = filename;
 }

 @Override
 public void display() {
     if (realImage == null) {
         realImage = new RealImage(filename);
     }
     realImage.display();
 }
}

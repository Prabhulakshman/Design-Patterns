package Various_Patterns_Proxy_Pattern;

//RealImage class implementing the Image interface
class RealImage implements Image {
 private String filename;

 public RealImage(String filename) {
     this.filename = filename;
     loadImageFromDisk();
 }

 private void loadImageFromDisk() {
     System.out.println("Loading image: " + filename);
 }

 @Override
 public void display() {
     System.out.println("Displaying image: " + filename);
 }
}


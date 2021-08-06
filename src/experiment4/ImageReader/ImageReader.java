package experiment4.ImageReader;

public abstract class ImageReader {
   public abstract void read();
}

class GifReader extends ImageReader{

    @Override
    public void read() {
        System.out.println("Reade Gif");
    }
}

class JpgReader extends ImageReader{

    @Override
    public void read() {
        System.out.println("Reade Jpg");
    }
}

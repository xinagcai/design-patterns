package experiment4.ImageReader;

public class test {
    public static void main(String[] args) {
        ImageReaderFactory imageReaderFactory = new GifReaderFactory();
        ImageReader imageReader = imageReaderFactory.maker();
        imageReader.read();

        imageReaderFactory = new JpgReaderFactory();
        imageReader = imageReaderFactory.maker();
        imageReader.read();
    }
}

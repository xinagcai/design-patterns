package experiment4.ImageReader;

public interface ImageReaderFactory {
    public ImageReader maker();
}

class GifReaderFactory implements ImageReaderFactory {

    @Override
    public ImageReader maker() {
        return new GifReader();
    }
}

class JpgReaderFactory implements ImageReaderFactory {

    @Override
    public ImageReader maker() {
        return new JpgReader();
    }
}
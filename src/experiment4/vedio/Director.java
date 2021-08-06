package experiment4.vedio;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Vedio construct() {
        builder.setVedio();
        return builder.getResult();
    }
}

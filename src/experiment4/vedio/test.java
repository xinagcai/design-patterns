package experiment4.vedio;

public class test {


    public static void main(String[] args) {
        Builder builder = new CompletePattern();
        Director director = new Director(builder);
        Vedio vedio = director.construct();
        vedio.display();


        builder = new SimplePattern();
        director = new Director(builder);
        vedio = director.construct();
        vedio.display();

        builder = new MemoryPattern();
        director = new Director(builder);
        vedio = director.construct();
        vedio.display();

    }
}

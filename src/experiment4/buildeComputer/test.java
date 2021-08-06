package experiment4.buildeComputer;

public class test {
    public static void main(String[] args) {
        Builder builder = new Builder1();
        Director director = new Director(builder);
        Computer computer = director.construct();
        computer.display();


        builder = new Builder2();
        director = new Director(builder);
        computer = director.construct();
        computer.display();
    }
}

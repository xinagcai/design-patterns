package experiment4.multiton;

import java.util.Random;

public class Multiton {
    private static Multiton[] array = {new Multiton(), new Multiton(), new Multiton(), new Multiton()};

    private Multiton() {
    }

    public static Multiton getInstance() {
        return array[random()];
    }

    public static int random(){
        Random random = new Random();
        int value = Math.abs(random.nextInt());
        value = value%4;
        return value;
    }

    public static void main(String args[]){
        Multiton m1,m2,m3,m4;
        m1 = Multiton.getInstance();
        m2 = Multiton.getInstance();
        m3 = Multiton.getInstance();
        m4 = Multiton.getInstance();

        System.out.println(m1==m2);
        System.out.println(m1==m3);
        System.out.println(m1==m4);

    }
}

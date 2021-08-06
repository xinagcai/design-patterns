package experiment6.decorate;

public interface Component {
    public void display();
}

class Phone implements Component {

    @Override
    public void display() {
        System.out.println("发出声音");
    }
}

abstract class Decorate implements Component {
    public abstract void display();
}

class Vibration extends Decorate {

    private Component phone;

    public Vibration(Component phone) {
        this.phone = phone;
    }

    @Override
    public void display() {
        phone.display();
        System.out.println("产生振动");

    }
}

class Flashing extends Decorate {

    private Component phone;

    public Flashing(Component phone) {
        this.phone = phone;
    }

    @Override
    public void display() {
        phone.display();
        System.out.println("闪烁");

    }
}

class Client{
    public static void main(String[] args) {
        Component phone = new Phone();
        System.out.println("\n基础款：");
        phone.display();

        phone = new Vibration(phone);
        System.out.println("\n带震动款：");
        phone.display();

        phone = new Flashing(phone);
        System.out.println("\n带闪烁款：");
        phone.display();

    }
}

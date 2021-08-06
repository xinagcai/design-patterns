package experiment5.pig;

import experiment1.A;

public interface Animal {
    public void display();
}

class Pig implements Animal {

    @Override
    public void display() {
        System.out.println("我是一只猪");
    }
}

abstract class Decorate implements Animal {
    public abstract void display();
}

class RedApple extends Decorate{

    private Animal animal;
    public RedApple(Animal animal){
        this.animal = animal;
    }

    @Override
    public void display() {
        animal.display();
        System.out.println("加上保护罩");
    }
}

class GreenApple extends Decorate{

    private Animal animal;
    public GreenApple(Animal animal){
        this.animal = animal;
    }

    @Override
    public void display() {
        animal.display();
        System.out.println("加快奔跑速度");
    }
}
class YellowApple extends Decorate{

    private Animal animal;
    public YellowApple(Animal animal){
        this.animal = animal;
    }

    @Override
    public void display() {
        animal.display();
        System.out.println("趟着水跑");
    }
}

class Client{
    public static void main(String[] args) {
        Animal pig = new Pig();
        System.out.println("基础款：");
        pig.display();
        pig = new RedApple(pig);
        System.out.println("\n吃红苹果：");
        pig.display();
        pig = new GreenApple(pig);
        System.out.println("\n吃绿苹果：");
        pig.display();
        pig = new YellowApple(pig);
        System.out.println("\n吃黄苹果：");
        pig.display();

    }
}
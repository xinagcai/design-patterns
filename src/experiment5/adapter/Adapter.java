package experiment5.adapter;

public class Adapter implements Cat, Dog {
    private Cat cat;
    private Dog dog;

    Adapter(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }


    @Override
    public void miao() {
        dog.wang();//猫学狗叫
    }

    @Override
    public void wang() {
        dog.wang();
    }

    @Override
    public void action() {
        cat.catchMouse();//狗学猫捉老鼠
    }

    @Override
    public void catchMouse() {
        cat.catchMouse();
    }
}

class Test{
    public static void main(String[] args) {
        Dog dog = new ConcrateDog();
        Cat cat = new ConcrateCat();
        Adapter adapter = new Adapter(cat,dog);
        System.out.println("猫学狗叫");
        adapter.miao();
        System.out.println("狗学猫捉老鼠");
        adapter.catchMouse();
    }
}

interface Cat {
    public void miao();

    public void catchMouse();
}

interface Dog {
    public void wang();

    public void action();
}

class ConcrateCat implements Cat {

    @Override
    public void miao() {
        System.out.println("喵喵喵");
    }

    @Override
    public void catchMouse() {
        System.out.println("猫捉老鼠");
    }
}

class ConcrateDog implements Dog {

    @Override
    public void wang() {
        System.out.println("汪汪汪");
    }

    @Override
    public void action() {
        System.out.println("狗捉老鼠");
    }
}
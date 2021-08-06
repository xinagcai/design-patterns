package experiment7.Observe;

import java.util.ArrayList;
import java.util.List;

public class Tame {
    private List<Companion> companions = new ArrayList<>();

    public void register(Companion companion) {
        companions.add(companion);
    }

    public void trigger(String name) {
        System.out.println(name+"受到攻击！！！");
        for (Companion obj : companions) {
            if (obj.getName() != name)
                obj.alarm();
        }
    }
}

class Companion {
    private String name;


    public Companion(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void alarm() {
        System.out.println("我是" + name + "我们来救你啦");
    }
}

class Client {
    public static void main(String[] args) {
        Companion c1 = new Companion("张三");
        Companion c2 = new Companion("李四");
        Companion c3 = new Companion("Lily");
        Companion c4 = new Companion("Jack");
        Companion c5 = new Companion("Mark");
        Companion c6 = new Companion("Tony");

        Tame tame = new Tame();
        tame.register(c1);
        tame.register(c2);
        tame.register(c3);
        tame.register(c4);
        tame.register(c5);
        tame.register(c6);
        tame.trigger("Lily");

    }
}

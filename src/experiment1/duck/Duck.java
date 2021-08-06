package experiment1.duck;

//鸭子抽象类
public abstract class Duck {

    FlyBehaviro myFlyBehavior;

    QuackBehavior myQuackBehavior;

    public Duck() {
    }


    public void fly() {

        myFlyBehavior.fly();

    }

    public void quack() {

        myQuackBehavior.QuackBehavior();

    }

    public abstract void display();

}


//定义飞行接口
interface FlyBehaviro {

    public void fly();

}

//定义叫声接口
interface QuackBehavior {

    public void QuackBehavior();

}

//飞行类
class flyNoWay implements FlyBehaviro {
    @Override
    public void fly() {
        System.out.println(" i can not fly");
    }
}

class canfly implements FlyBehaviro {
    @Override
    public void fly() {
        System.out.println("i can fly");
    }
}

//叫声类
class waquack implements QuackBehavior {
    @Override
    public void QuackBehavior() {
        System.out.println("wawa");
    }
}

class noquack implements QuackBehavior {
    @Override
    public void QuackBehavior() {
        System.out.println("......");
    }
}

class guquack implements QuackBehavior {
    @Override
    public void QuackBehavior() {
        System.out.println("guagua");
    }
}

//绿鸭
class MallarDuck extends Duck {
    public MallarDuck() {
        myFlyBehavior = new canfly();
        myQuackBehavior = new guquack();
    }

    @Override
    public void display() {
        System.out.println("i am MallarDuck");
    }

}

//塑料鸭子
class plasticduck extends Duck {
    public plasticduck() {
        myFlyBehavior = new flyNoWay();
        myQuackBehavior = new noquack();
    }

    @Override
    public void display() {
        System.out.println("no color duck");
    }

}

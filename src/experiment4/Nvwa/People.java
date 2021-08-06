package experiment4.Nvwa;

public abstract class People {
    public abstract void say();
}

class Man extends People{

    @Override
    public void say() {
        System.out.println("I'm a man");
    }
}

class Woman extends People{

    @Override
    public void say() {
        System.out.println("I'm a woman");
    }
}

//新增robot类
class Robot extends People{

    @Override
    public void say() {
        System.out.println("I'm a Robot");
    }
}


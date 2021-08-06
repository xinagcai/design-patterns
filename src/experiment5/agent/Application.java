package experiment5.agent;

public abstract class Application {
    public abstract void run();
}

class RealApplication extends Application{

    @Override
    public void run() {
        System.out.println("真正的应用run方法");
    }
}

class Poxy extends Application{
    private RealApplication realApplication = new RealApplication();


    @Override
    public void run() {
        System.out.println("代理的应用run方法");
        realApplication.run();
    }
}

class Client{
    public static void main(String[] args) {
        Poxy poxy = new Poxy();
        poxy.run();
    }
}

package experiment4.phone;

public abstract class InterfaceController {
    public abstract void display();
}

class AndroidInterfaceController extends InterfaceController{

    @Override
    public void display() {
        System.out.println("i am AndroidInterfaceController");
    }
}

class IOSInterfaceController extends InterfaceController{

    @Override
    public void display() {
        System.out.println("i am IOSInterfaceController");
    }
}
class WindowsInterfaceController extends InterfaceController{

    @Override
    public void display() {
        System.out.println("i am WindowsInterfaceController");
    }
}
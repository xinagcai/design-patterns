package experiment4.phone;

public abstract class OperationController {
    public abstract void display();
}

class AndroidOperationController extends OperationController{

    @Override
    public void display() {
        System.out.println("i am AndroidOperationController");
    }
}


class IOSOperationController extends OperationController{

    @Override
    public void display() {
        System.out.println("i am IOSOperationController");
    }
}


class WindowsOperationController extends OperationController{

    @Override
    public void display() {
        System.out.println("i am WindowsOperationController");
    }
}

package experiment4.phone;

public class test {
    public static void main(String[] args) {
        Factory factory = new AndroidFactory();
        InterfaceController interfaceController = factory.createInterfaceController();
        OperationController operationController = factory.createOperationController();
        interfaceController.display();
        operationController.display();


        factory = new IOSFactory();
        interfaceController = factory.createInterfaceController();
        operationController = factory.createOperationController();
        interfaceController.display();
        operationController.display();


        factory = new WindowsFactory();
        interfaceController = factory.createInterfaceController();
        operationController = factory.createOperationController();
        interfaceController.display();
        operationController.display();
    }
}

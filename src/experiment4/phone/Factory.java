package experiment4.phone;

public abstract class Factory {
    public abstract InterfaceController createInterfaceController();
    public abstract OperationController createOperationController();
}

class AndroidFactory extends Factory {

    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }
}

class IOSFactory extends Factory {

    @Override
    public InterfaceController createInterfaceController() {
        return new IOSInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new IOSOperationController();
    }
}

class WindowsFactory extends Factory {

    @Override
    public InterfaceController createInterfaceController() {
        return new WindowsInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new WindowsOperationController();
    }
}
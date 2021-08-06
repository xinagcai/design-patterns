package experiment4.computer;

public abstract class RAM {
    public abstract void introduce();
}

class MacRAM extends RAM{

    @Override
    public void introduce() {
        System.out.println("I'm MacRAM");
    }
}


class PcRAM extends RAM{

    @Override
    public void introduce() {
        System.out.println("I'm pcRAM");
    }
}
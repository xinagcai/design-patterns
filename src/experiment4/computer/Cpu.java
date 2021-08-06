package experiment4.computer;

public abstract class Cpu {
    public abstract void introduce();
}

class MacCpu extends Cpu{

    @Override
    public void introduce() {
        System.out.println("I'm MacCpu");
    }
}


class PcCpu extends Cpu{

    @Override
    public void introduce() {
        System.out.println("I'm PcCpu");
    }
}
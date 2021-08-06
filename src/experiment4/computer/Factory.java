package experiment4.computer;

public abstract class Factory {
    public abstract Cpu createCPU();
    public abstract RAM createRAM();
}

class MacFactory extends Factory{


    @Override
    public Cpu createCPU() {
        return new MacCpu();
    }

    @Override
    public RAM createRAM() {
        return new MacRAM();
    }
}


class PcFactory extends Factory{


    @Override
    public Cpu createCPU() {
        return new PcCpu();
    }

    @Override
    public RAM createRAM() {
        return new PcRAM();
    }
}
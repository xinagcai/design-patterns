package experiment4.buildeComputer;

public abstract class Builder {
    protected Computer computer = new Computer();

    public abstract void buildCpu();

    public abstract void buildMemory();

    public abstract void buildhardDisk();

    public abstract void buildhost();

    public abstract void buildscreen();

    public void buildComputer() {
        buildCpu();
        buildMemory();
        buildhardDisk();
        buildhost();
        buildscreen();
    }

    public Computer getResult() {
        return computer;
    }
}

class Builder1 extends Builder {
    @Override
    public void buildCpu() {
        computer.setCpu(true);
    }

    @Override
    public void buildMemory() {
        computer.setHardDisk(true);
    }

    @Override
    public void buildhardDisk() {
        computer.setHardDisk(false);
    }

    @Override
    public void buildhost() {
        computer.setHost(false);
    }

    @Override
    public void buildscreen() {
        computer.setScreen(true);
    }
}

class Builder2 extends Builder {
    @Override
    public void buildCpu() {
        computer.setCpu(true);
    }

    @Override
    public void buildMemory() {
        computer.setHardDisk(true);
    }

    @Override
    public void buildhardDisk() {
        computer.setHardDisk(false);
    }

    @Override
    public void buildhost() {
        computer.setHost(true);
    }

    @Override
    public void buildscreen() {
        computer.setScreen(true);
    }
}
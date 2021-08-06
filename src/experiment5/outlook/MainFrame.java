package experiment5.outlook;

public class MainFrame {
    private Memory memory = new Memory();
    private Cpu cpu = new Cpu();
    private HardDisk hardDisk = new HardDisk();
    private OS os = new OS();

    public void on() {
        memory.check();
        cpu.run();
        hardDisk.read();
        os.load();
    }

}

class Memory {
    public void check() {
        System.out.println("Memory check");
    }
}

class Cpu {
    public void run() {
        System.out.println("Cpu run");
    }
}

class HardDisk {
    public void read() {
        System.out.println("HardDisk Read");
    }
}

class OS {
    public void load() {
        System.out.println("OS load");
    }
}

class Client {


    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.on();
    }
}

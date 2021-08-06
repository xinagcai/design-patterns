package experiment4.computer;

public class test {
    public static void main(String[] args) {
        Factory factory = new MacFactory();
        Cpu cpu = factory.createCPU();
        RAM ram= factory.createRAM();
        cpu.introduce();
        ram.introduce();


        factory = new PcFactory();
        cpu = factory.createCPU();
        ram = factory.createRAM();
        cpu.introduce();
        ram.introduce();

    }
}

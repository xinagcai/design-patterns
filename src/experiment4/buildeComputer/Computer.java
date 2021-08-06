package experiment4.buildeComputer;

public class Computer {
    private boolean cpu;
    private boolean memory;
    private boolean hardDisk;
    private boolean host;
    private boolean screen;

    public boolean isCpu() {
        return cpu;
    }

    public void setCpu(boolean cpu) {
        this.cpu = cpu;
    }

    public boolean isMemory() {
        return memory;
    }

    public void setMemory(boolean memory) {
        this.memory = memory;
    }

    public boolean isHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(boolean hardDisk) {
        this.hardDisk = hardDisk;
    }

    public boolean isHost() {
        return host;
    }

    public void setHost(boolean host) {
        this.host = host;
    }

    public boolean isScreen() {
        return screen;
    }

    public void setScreen(boolean screen) {
        this.screen = screen;
    }

    public void display(){
       System.out.println("my Computer");
       System.out.println("cpu:"+cpu);
       System.out.println("memory:"+memory);
       System.out.println("hardDisk:"+hardDisk);
       System.out.println("host:"+host);
       System.out.println("screen:"+screen);
    }
}

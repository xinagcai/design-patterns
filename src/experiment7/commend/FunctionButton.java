package experiment7.commend;



public class FunctionButton {
    private Commend[] commends = new Commend[2];

    public void onPressButton(int button){
        commends[button].on();
    }

    public void setCommends(int button,Commend commend){
        commends[button] = commend;
    }

}

interface Commend {
    void on();
}

class SystemExitClassComend implements Commend {
    protected SystemExitClass systemExitClass;

    public SystemExitClassComend(SystemExitClass systemExitClass){
        this.systemExitClass = systemExitClass;
    }

    @Override
    public void on() {
        systemExitClass.display();
    }
}

class DisplayHelpClassCommend implements Commend {
    protected DisplayHelpClass displayHelpClass;
    public DisplayHelpClassCommend(DisplayHelpClass displayHelpClass){
        this.displayHelpClass = displayHelpClass;
    }

    @Override
    public void on() {
        displayHelpClass.display();
    }
}

class SystemExitClass {
    public void display() {
        System.out.println("打开退出系统");
    }
}

class DisplayHelpClass {

    public void display() {
        System.out.println("打开帮助界面");
    }
}

class Client{
    public static void main(String[] args) {
        SystemExitClass systemExitClass = new SystemExitClass();
        DisplayHelpClass displayHelpClass = new DisplayHelpClass();

        Commend commend1 = new SystemExitClassComend(systemExitClass);
        Commend commend2 = new DisplayHelpClassCommend(displayHelpClass);

        FunctionButton functionButton = new FunctionButton();
        functionButton.setCommends(0,commend1);
        functionButton.setCommends(1,commend2);

        functionButton.onPressButton(1);
        functionButton.onPressButton(0);

    }
}

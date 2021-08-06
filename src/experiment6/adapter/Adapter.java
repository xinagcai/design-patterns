package experiment6.adapter;

public class Adapter extends ChMachine{
    private AmMachine amMachine;
    public Adapter(AmMachine amMachine){
        this.amMachine = amMachine;
    }
    @Override
    public void display(){
        amMachine.display();
    }

}

class ChMachine{
    public void display(){
        System.out.println("220电压");
    }
}

class Client{
    public static void main(String[] args) {
        AmMachine amMachine = new AmMachine();
        ChMachine chMachine = new Adapter(amMachine);
        chMachine.display();
    }
}

class AmMachine{
    public void display(){
        System.out.println("110电压");
    }
}

package experiment5.brige;

public abstract class Factory {
    private Machine machine;
    Factory(Machine machine){
        this.machine = machine;
    }
    public abstract void makeMachine();
    public void getMachine(){
        machine.display();
    }
}

class Haier extends Factory{

    Haier(Machine machine) {
        super(machine);
    }

    @Override
    public void makeMachine() {
        System.out.println("Haier maker");
        super.getMachine();
    }
}

class TCL extends Factory{

    TCL(Machine machine) {
        super(machine);
    }

    @Override
    public void makeMachine() {
        System.out.println("TCL maker");
        super.getMachine();
    }
}
class Hisense extends Factory{

    Hisense(Machine machine) {
        super(machine);
    }

    @Override
    public void makeMachine() {
        System.out.println("Hisense maker");
        super.getMachine();
    }
}

abstract class Machine{
    public abstract void display();
}

class TV extends Machine{

    @Override
    public void display() {
        System.out.println("I'm TV");
    }
}
class AirCondition extends Machine{

    @Override
    public void display() {
        System.out.println("I'm AirCondition");
    }
}
class Refrigeratory extends Machine{

    @Override
    public void display() {
        System.out.println("I'm Refrigeratory");
    }
}

class Test{
    public static void main(String[] args) {
        Machine tv = new TV();
        Machine refrigeratory = new Refrigeratory();
        Machine airCondition = new AirCondition();

        Factory hisense = new Hisense(tv);
        hisense.makeMachine();
        hisense = new Hisense(refrigeratory);
        hisense.makeMachine();

        Factory haire = new Haier(tv);
        haire.makeMachine();
        haire = new Haier(airCondition);
        haire.makeMachine();

        Factory tcl = new TCL(tv);
        tcl.makeMachine();
        tcl = new TCL(refrigeratory);
        tcl.makeMachine();
        tcl = new TCL(airCondition);
        tcl.makeMachine();
    }


}
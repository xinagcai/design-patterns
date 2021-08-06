package experiment3.Meditor;

public abstract class Component {
    protected Mediator mediator;
    public void change(){
        mediator.change(this);
    }

    public abstract void update();
}

class Button extends Component{

    @Override
    public void update() {
        System.out.println("Button update");
    }
}

class List extends Component{

    @Override
    public void update() {
        System.out.println("List update");
    }
}

class ComboBox extends Component{

    @Override
    public void update() {
        System.out.println("ComboBox update");
    }
}

class TextBox extends Component{

    @Override
    public void update() {
        System.out.println("TextBox update");
    }
}

class Label extends Component{

    @Override
    public void update() {
        System.out.println("Label update");
    }
}

package experiment5.component;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void Add(Component c);

    public abstract void delete(Component c);

    public abstract void display();

    public String getName() {
        return name;
    }
}

class ConcreteCompany extends Component {
    private List<Component> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        children.add(c);

    }

    @Override
    public void delete(Component c) {
        children.remove(c);
    }

    @Override
    public void display() {
        for (Component c : children) {
            System.out.print(super.getName() + " ");
            c.display();
        }
    }
}

class finalCompany extends Component {

    public finalCompany(String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        System.out.println("不支持该方法");
    }

    @Override
    public void delete(Component c) {
        System.out.println("不支持该方法");
    }

    @Override
    public void display() {
        System.out.println(super.getName() + " ");
    }
}

class Test {
    public static void main(String[] args) {
        Component root = new ConcreteCompany("北京总部");
        Component c = new finalCompany("教务办公室");
        Component c1 = new finalCompany("行政办公室");
        Component root1 = new ConcreteCompany("湖南分校");
        root.Add(c);
        root.Add(c1);
        root.Add(root1);

        Component root2 = new ConcreteCompany("长沙教学点");
        Component root3 = new ConcreteCompany("湘潭教学点");
        root1.Add(c);
        root1.Add(c1);
        root1.Add(root2);
        root1.Add(root3);

        root2.Add(c);
        root2.Add(c1);

        root3.Add(c);
        root3.Add(c1);

        root.display();


    }
}

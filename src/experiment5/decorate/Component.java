package experiment5.decorate;

public interface Component {
    public abstract void display();
}

class TextView implements Component {
    @Override
    public void display() {
        System.out.println("I'm textView");
    }
}

class PictureView implements Component {
    @Override
    public void display() {
        System.out.println("I'm PictureView");
    }
}

abstract class Decorate implements Component {
    private Component c;

    Decorate(Component c) {
        this.c = c;
    }

    public void display() {
        c.display();
    }

}

class Scoller extends Decorate {
    Scoller(Component c) {
        super(c);
    }

    @Override
    public void display() {
        super.display();
        description();
    }

    public void description() {
        System.out.println("I'm Scoller");
    }
}

class BlackBorder extends Decorate {
    BlackBorder(Component c) {
        super(c);
    }

    @Override
    public void display() {
        super.display();
        description();
    }

    public void description() {
        System.out.println("I'm BlackBorder");
    }
}

class Test {
    public static void main(String[] args) {
        Component textView = new TextView();
        System.out.println("基础款");
        textView.display();

        Component c1 = new Scoller(textView);
        System.out.println("加上滑动框");
        c1.display();

        Component c2 = new BlackBorder(c1);
        System.out.println("加上滑动框与黑色边框");
        c2.display();

        Component pictureView = new PictureView();
        System.out.println("基础款");
        pictureView.display();

        Component c3 = new Scoller(pictureView);
        System.out.println("加上滑动框");
        c3.display();

        Component c4 = new BlackBorder(c3);
        System.out.println("加上滑动框与黑色边框");
        c4.display();


    }
}
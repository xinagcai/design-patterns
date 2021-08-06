package experiment4.vedio;

public class Vedio {
    private boolean menu;
    private boolean list;
    private boolean windows;
    private boolean controller;
    private boolean collection;

    public boolean isMenu() {
        return menu;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    public boolean isList() {
        return list;
    }

    public void setList(boolean list) {
        this.list = list;
    }

    public boolean isWindows() {
        return windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public boolean isController() {
        return controller;
    }

    public void setController(boolean controller) {
        this.controller = controller;
    }

    public boolean isCollection() {
        return collection;
    }

    public void setCollection(boolean collection) {
        this.collection = collection;
    }

    public void display(){
        System.out.println("my Vedio");
        System.out.println("menu:"+menu);
        System.out.println("list:"+list);
        System.out.println("windows:"+windows);
        System.out.println("controller:"+controller);
        System.out.println("collection:"+collection);
    }
}

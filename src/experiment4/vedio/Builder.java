package experiment4.vedio;

public abstract class Builder {
    protected Vedio vedio = new Vedio();

    public abstract void setMenu();

    public abstract void setList();

    public abstract void setWindows();

    public abstract void setController();

    public abstract void setCollection();

    public void setVedio() {
        setMenu();
        setList();
        setWindows();
        setController();
        setCollection();
    }

    public Vedio getResult() {
        return vedio;
    }
}

class CompletePattern extends Builder {

    @Override
    public void setMenu() {
        vedio.setMenu(true);
    }

    @Override
    public void setList() {
        vedio.setList(true);
    }

    @Override
    public void setWindows() {
        vedio.setWindows(true);
    }

    @Override
    public void setController() {
        vedio.setController(true);
    }

    @Override
    public void setCollection() {
        vedio.setCollection(false);
    }
}

class MemoryPattern extends Builder {

    @Override
    public void setMenu() {
        vedio.setMenu(false);
    }

    @Override
    public void setList() {
        vedio.setList(false);
    }

    @Override
    public void setWindows() {
        vedio.setWindows(true);
    }

    @Override
    public void setController() {
        vedio.setController(true);
    }

    @Override
    public void setCollection() {
        vedio.setCollection(true);
    }
}

class SimplePattern extends Builder {

    @Override
    public void setMenu() {
        vedio.setMenu(false);
    }

    @Override
    public void setList() {
        vedio.setList(false);
    }

    @Override
    public void setWindows() {
        vedio.setWindows(true);
    }

    @Override
    public void setController() {
        vedio.setController(true);
    }

    @Override
    public void setCollection() {
        vedio.setCollection(false);
    }
}
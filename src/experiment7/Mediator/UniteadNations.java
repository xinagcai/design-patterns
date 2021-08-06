package experiment7.Mediator;


public abstract class UniteadNations {
    public abstract void action(Nation nation,String value);

}

class WTO extends UniteadNations {
    public China china;
    public American american;

    @Override
    public void action(Nation nation,String value) {
        if (china == nation){
            System.out.println("这里是WTO");
           american.update(value);
        }
        if (american == nation){
            System.out.println("这里是WTO");
            china.update(value);
        }
    }
}

class WHO extends UniteadNations {
    public China china;
    public American american;

    @Override
    public void action(Nation nation,String value) {
        if (china == nation){
            System.out.println("这里是WHO");
            american.update(value);
        }
        if (american == nation){
            System.out.println("这里是WHO");
            china.update(value);
        }
    }
}

abstract class Nation {
    protected UniteadNations uniteadNations;

    public void modify(String value){
        uniteadNations.action(this,value);
    }

    public abstract void update(String value);

}

class China extends Nation {

    public China(UniteadNations uniteadNations) {
        super.uniteadNations = uniteadNations;
    }



    @Override
    public void update(String value) {
        System.out.println("中国更新："+value);
    }
}

class American extends Nation {
    public American(UniteadNations uniteadNations) {
        super.uniteadNations = uniteadNations;
    }

    @Override
    public void update(String value) {
        System.out.println("美国更新："+value);
    }
}


class Client{
    public static void main(String[] args) {
        WHO who = new WHO();
        WTO wto = new WTO();

        China china1 = new China(who);
        China china2 = new China(wto);
        American american1 = new American(who);
        American american2 = new American(wto);

        who.china = china1;
        who.american = american1;

        wto.china = china2;
        wto.american = american2;

        china1.modify("世界和平");
        china2.modify("奥特曼是真的");
        american1.modify("芭比梦想豪宅");
        american2.modify("创造101");

    }
}


package experiment6.outlook;

public class Clerk {
    private GuaHao guaHao = new GuaHao();
    private MenZheng menZheng = new MenZheng();
    private HuaJia huaJia = new HuaJia();
    private HuaYan huaYan = new HuaYan();
    private ShouFei shouFei = new ShouFei();
    private QuYao quYao = new QuYao();

    public void SeeADoctor(){
        guaHao.display();
        menZheng.display();
        huaJia.display();
        shouFei.display();
        huaYan.display();

    }
}

class GuaHao{
    public void display(){
        System.out.println("挂号");
    }
}

class MenZheng{
    public void display(){
        System.out.println("门诊");
    }
}

class HuaJia{
    public void display(){
        System.out.println("划价");
    }
}

class HuaYan{
    public void display(){
        System.out.println("化验");
    }
}

class ShouFei{
    public void display(){
        System.out.println("收费");
    }
}

class QuYao{
    public void display(){
        System.out.println("取药");
    }
}

class Patient{

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        clerk.SeeADoctor();
    }
}

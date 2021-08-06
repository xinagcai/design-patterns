package experiment7.stratege;


public class Data {
    private Decode decode;
    private String name;

    public Data(Decode decode,String name){
        this.decode = decode;
        this.name = name;
    }

    public void setDecode(Decode decode) {
        this.decode = decode;
    }

    public void display(){
        System.out.println("我是"+name);
        decode.display();
    }
}

interface Decode{
    public void display();
}

class Kaisa implements Decode{

    @Override
    public void display() {
        System.out.println("凯撒加密");
    }
}

class EDS implements Decode{
    @Override
    public void display() {
        System.out.println("EDS加密");
    }
}

class Client{
    public static void main(String[] args) {
        Kaisa kaisa = new Kaisa();
        EDS eds = new EDS();
        Data data = new Data(kaisa,"数据1");
        data.display();
        System.out.println("---------第二种加密方式-------");
        data.setDecode(eds);
        data.display();

    }
}
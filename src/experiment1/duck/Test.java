package experiment1.duck;

public class Test {
    public static void main(String[] args) {
//		绿鸭
        Duck mall = new MallarDuck();
        mall.display();
        mall.fly();
        mall.quack();

//		塑料鸭子
        Duck pla = new plasticduck();
        pla.display();
        pla.fly();
        pla.quack();
    }
}

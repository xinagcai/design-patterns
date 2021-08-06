package experiment3.shape;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Square(5);
        rectangle.setHeight(3);
        rectangle.setWidth(4);

        if(rectangle.square() == 12){
            System.out.println("是长方形的子类");
        }else {
            System.out.println("不是长方形的子类");
        }
    }
}

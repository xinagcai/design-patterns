package experiment1.operation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入参数A");
        int argA = in.nextInt();
        System.out.println("请输入参数B");
        int argB = in.nextInt();

        //加法
        Operation operation = OperationFactory.createOperation("+");

        System.out.println(argA+" + "+argB+" = "+operation.getResult(argA,argB));

        //减法
        operation = OperationFactory.createOperation("-");

        System.out.println(argA+" - "+argB+" = "+operation.getResult(argA,argB));

    }
}

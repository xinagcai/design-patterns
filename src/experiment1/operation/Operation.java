package experiment1.operation;


//算法类
public abstract class Operation {
    public abstract int getResult(int argA,int argB);
}

//加法类
class Add extends Operation {
    @Override
    public int getResult(int argA,int argB) {
        int result = 0;
        result = argA + argB;
        return result;
    }
}

//减法类
class Subtraction extends Operation {
    @Override
    public int getResult(int argA,int argB) {
        int result = 0;
        result = argA - argB;
        return result;
    }
}

//工厂
class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation opr = null;
        switch (operate) {
            case "+":
                opr = new Add();
                break;
            case "-":
                opr = new Subtraction();
                break;
        }
        return opr;
    }
}
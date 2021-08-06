package experiment7.template;

public abstract class Bank {
    public void display() {
        openAccount();
        count();
        close();
    }

    public abstract void openAccount();

    public abstract void count();

    public abstract void close();
}

class CurrentAccount extends Bank{

    @Override
    public void openAccount() {
        System.out.println("活期账户打开账户");
    }

    @Override
    public void count() {
        System.out.println("活期账户计算利息");
    }

    @Override
    public void close() {
        System.out.println("活期账户关闭账户");
    }
}

class SavingAccount extends Bank{

    @Override
    public void openAccount() {
        System.out.println("定期账户不打开账户");
    }

    @Override
    public void count() {
        System.out.println("定期账户计算利息");
    }

    @Override
    public void close() {
        System.out.println("定期账户不用关闭账户");
    }
}

class Client{
    public static void main(String[] args) {
        Bank account = new CurrentAccount();
        account.display();
        System.out.println("---------定期账户-----------");
        account = new SavingAccount();
        account.display();
    }
}

package experiment3.bank.Process;

import experiment3.bank.BankProcess;

public class DrawMoneyProcess implements BankProcess {
    @Override
    public void process() {
        System.out.println("drawMoney is ok");
    }
}

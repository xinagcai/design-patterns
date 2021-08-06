package experiment3.bank.Process;

import experiment3.bank.BankProcess;

public class DepositProcess implements BankProcess {
    @Override
    public void process() {
        System.out.println("deposit is ok");
    }
}

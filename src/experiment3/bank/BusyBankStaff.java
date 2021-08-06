package experiment3.bank;

import experiment3.bank.Process.DepositProcess;
import experiment3.bank.Process.DrawMoneyProcess;
import experiment3.bank.Process.TansferProcess;

public class BusyBankStaff {
    private BankProcess bankProcess;

    public void HandleProcess(Client client) {
        switch (client.ClientType){
            case "存款用户":
                bankProcess = new DepositProcess();
                bankProcess.process();
                break;
            case "转账用户":
                bankProcess = new TansferProcess();
                bankProcess.process();
                break;
            case "取款户":
                bankProcess = new DrawMoneyProcess();
                bankProcess.process();
                break;
        }
    }
}

class Client {
     String ClientType;

    public Client(String ClientType) {
        this.ClientType = ClientType;
    }
}
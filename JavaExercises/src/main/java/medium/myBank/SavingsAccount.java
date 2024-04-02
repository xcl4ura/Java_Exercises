package medium.myBank;

import java.util.Map;

public class SavingsAccount extends Account {

    public SavingsAccount(){
        System.out.println("Informe seu nome e CPF");
        cadUser.put(scan.next(), scan.next());
        showInfos();

    }
    public void showInfos(){
        for (Map.Entry<String, String> infos : cadUser.entrySet()) {
            System.out.println("Nome: " + infos.getKey() + "\nCPF: " + infos.getValue() + "\nSaldo: " + getBalance());
        }
    }


}
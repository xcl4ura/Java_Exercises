package medium.myBank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Account { protected double balance;
    public Map<String, String> cadUser = new HashMap<>();

    public Scanner scan = new Scanner(System.in);

    public Account() {
        this.balance = 1000;
    }

    public double getBalance() {
        return balance;
    }

    public void decision() {

        System.out.println("Seu saldo atual: " + getBalance() + "\n");
        System.out.println("Você deseja: \n1- Conta Poupança \n2- Conta Corrente \n3- Seguro de Vida");
        switch (scan.nextInt()) {
            case 1:
                SavingsAccount svAcc = new SavingsAccount();
                break;
            case 2:
                CurrentAccount currentAcc = new CurrentAccount();
                break;
            case 3:
                LifeInsurance lInsurance = new LifeInsurance();
                break;
            default:
                System.out.println("Inválido");
                System.exit(0);
        }

    }


}
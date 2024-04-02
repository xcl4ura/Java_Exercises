package medium.myBank;


import java.util.Map;

public class CurrentAccount extends Account implements TaxCalculator{

    public CurrentAccount(){
        System.out.println("Informe seu nome e CPF");
        cadUser.put(scan.next(), scan.next());
        mostrarDados();
        System.out.println(calculator());
    }
    public void mostrarDados(){
        for (Map.Entry<String, String> dados : cadUser.entrySet()) {
            System.out.println("Nome: " + dados.getKey() + "\nCPF: " + dados.getValue() + "\nSaldo: " + getBalance());
        }
    }
    @Override
    public double calculator() {

        System.out.println("O valor do tributo é: R$" + (balance * 0.01));

        System.out.println("Seu saldo ficará:");
        return balance - (balance * 0.01);

    }




}

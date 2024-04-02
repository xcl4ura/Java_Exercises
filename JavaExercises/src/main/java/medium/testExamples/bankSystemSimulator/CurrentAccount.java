package medium.testExamples.bankSystemSimulator;

public class CurrentAccount {
        int number;
        String name;
        double balance;

        public CurrentAccount(int numberAc, String nameAc, double balanceAc) {
            this.number = numberAc;
            this.name = nameAc;
            this.balance = balanceAc;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int numberAc) {
            this.number = numberAc;
        }

        public String getName() {
            return name;
        }

        public void setName(String nameAc) {
            this.name = nameAc;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balanceAc) {
            this.balance = balanceAc;
        }

        public void depositMoney(double val){
            setBalance(getBalance() + val);
            System.out.println("Deposito Efetuado  \nSeu saldo atual é: " + getBalance());;
        }
        public void withdrawMoney(double val){
            if (getBalance() < 5) {
                System.out.println("Não foi possível efetuar o saque");
            }else {
                setBalance(getBalance() - val);
                System.out.println("Saque efetuado" + "\nSeu saldo atual é: " + getBalance());
            }
        }


    }
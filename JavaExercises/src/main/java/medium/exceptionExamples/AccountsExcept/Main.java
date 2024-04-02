package medium.exceptionExamples.AccountsExcept;

public class Main {

    public static void main(String[] args) throws AccountException {

        Account cc = new Account();

    cc.deposita(1000);
    cc.setLimite(1000);
    cc.saca(1000);


}
}
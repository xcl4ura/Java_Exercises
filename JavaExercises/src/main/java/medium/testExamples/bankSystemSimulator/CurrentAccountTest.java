package medium.testExamples.bankSystemSimulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CurrentAccountTest {

    @Test
    public void depositarDinheiroNaConta(){
        CurrentAccount cc = new CurrentAccount(123,"Laura", 200);
        cc.depositMoney(400);
        Assertions.assertEquals(600, cc.getBalance());
    }
    @Test
    public void SacarDinheiroNaConta(){
        CurrentAccount cc = new CurrentAccount(456, "Joe", 0);
        cc.withdrawMoney(60);
        Assertions.assertEquals(0, cc.getBalance());
    }
}
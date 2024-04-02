package medium.testExamples.oddOrEven;

public class NumberCalculator {
    public boolean verifyNumber(int num){
        if (num % 2 == 0){
            System.out.println("O número é par!");
            return true;
        }else{
            System.out.println("O número é ímpar!");
        }
        return false;
    }
}

package basic;

public class NumerosPares2 {

    public static void main(String[] args) {
        int n = 1;

        while (n <= 60){

            if (n % 2 ==0) {
                System.out.println(n + " É o número par ");
            }

            n++;
        }

    }

}
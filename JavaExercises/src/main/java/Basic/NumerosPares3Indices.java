package Basic;

import java.util.Scanner;

public class NumerosPares3Indices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int val[] = new int[10];

        for (int i = 0; i < val.length; i++) {

            System.out.println("Informe um valor para a posição " + i);
            val[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES");
        for (int i = 0; i < val.length; i++) {

            if (val[i] % 2 == 0){

                System.out.println(val[i]);

            }

        }
    }
}

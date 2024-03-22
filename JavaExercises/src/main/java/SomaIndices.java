import java.util.Scanner;

public class SomaIndices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] val = new int[5];

        for (int i = 0; i < val.length; i++) {

            System.out.println("Informe um valor para a posição " + i);
            val[i] = sc.nextInt();
        }

        System.out.println("VALORES ARMAZENADOS");

        for (int i = 0; i < val.length ; i++) {
            System.out.println(val[i]);
        }

        System.out.println("SOMA");

        int resul;
        resul = val[0] + val[1] + val[2] + val[3] + val[4];

        System.out.println("O resultado da soma dos vetores é respectivamente: " + resul);


    }

}
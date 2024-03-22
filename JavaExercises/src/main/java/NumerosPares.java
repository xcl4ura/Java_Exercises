public class NumerosPares {
    public static void main(String[] args) {

        //exibir numeros pares

        int num = 1;

        do {

            if (num % 2 == 0){
                System.out.println(num);
            }
            num++;

        }while (num<=100);


    }
}

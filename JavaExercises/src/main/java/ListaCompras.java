import java.util.Scanner;

public class ListaCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtItem;

        System.out.print("Informe a quantidade de itens ");
        qtItem = sc.nextInt();

        String itens[] = new String[qtItem];

        for (int i = 0; i < itens.length; i++) {

            System.out.print("Informe o nome produto: ");
            itens[i] = sc.next();

        }

        System.out.println("LISTA DE COMPRAS: ");
        for (int i = 0; i < itens.length; i++) {

            System.out.println(itens[i]);

        }

    }
}

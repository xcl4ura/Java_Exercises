package Basic;

import java.util.Scanner;

public class CadastroCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nameAlbum, artist;
        int cont;

        System.out.print("Informe o nome do Álbum: ");
        nameAlbum = sc.nextLine();

        System.out.print("Informe o artista: ");
        artist = sc.nextLine();

        System.out.print("Informe a quantidade de músicas que contém no álbum: ");
        cont = sc.nextInt();

        String[] music = new String[cont];

        for (int i = 0; i < music.length; i++) {
            System.out.print("Digite a " + (i+1) +" música da banda: ");
            music[i] = sc.next();
        }

        System.out.println();
        System.out.println("Álbum: " + nameAlbum + "\nArtista: " + artist + "\nMúsicas: ");
        for (int i = 0; i < music.length; i++) {
            System.out.println((i+1) +"ª " + music[i]);
        }

    }
}
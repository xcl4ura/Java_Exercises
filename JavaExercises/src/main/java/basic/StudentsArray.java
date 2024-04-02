package basic;

import java.util.Scanner;

public class StudentsArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] student = new String[10];

        for (int i = 0; i < student.length; i++) {

            System.out.print("Informe o nome do aluno: ");
            student[i] = sc.next();
        }

        System.out.println("LISTA DE CHAMADA: ");

        for (int i = 0; i < student.length ; i++) {

            System.out.println(student[i]);

        }
    }
}
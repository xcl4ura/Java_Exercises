package medium.numbersList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class NumberList {

    public static List<Integer> num = new ArrayList<>();
    public Scanner scan = new Scanner(System.in);

    public void receiveInfos(){
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o número: ");
            num.add(scan.nextInt());
        }


    }
    public static List<Integer> getNum() {
        return num;
    }

}

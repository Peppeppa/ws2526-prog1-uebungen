package lektion6;
import java.util.Scanner;

public class Fakultaet {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("input: ");
        int n = input.nextInt();
        long ergebnis = fakulaet(n);
        System.out.println(ergebnis);

    }
    public static long fakulaet(int n){
        long ergebnis = 1;
        for (int i = 1; i <= n; i++){
            ergebnis = ergebnis * i;
        }
        return ergebnis;
    }
}

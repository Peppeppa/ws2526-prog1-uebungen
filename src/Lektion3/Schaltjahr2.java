package Lektion3;
import java.util.Scanner;

public class Schaltjahr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("bitte gib eine Jahreszahl ein: ");
        int jahr = sc.nextInt();
        if (jahr % 4 == 0 &&  jahr % 100 != 0 &&  jahr % 400 != 0) {
            System.out.println("Es ist ein Schaltjahr da es durch 4 aber nicht durch 100 oder 400 Teilbar ist");
        }
        else if (jahr % 4 == 0 &&  jahr % 100 == 0 &&  jahr % 400 != 0) {
            System.out.println("Es ist KEIN Schaltjahr da es durch 4, durch 100 aber nicht 400 Teilbar ist");
        }
        else if (jahr % 4 == 0 &&  jahr % 100 == 0 &&  jahr % 400 == 0) {
            System.out.println("Es ist ein Schaltjahr da es durch 4, zwar durch 100 aber auch durch 400 Teilbar ist");
        }
        else if (jahr % 4 != 0 &&  (jahr % 100 != 0 &&  jahr % 400 != 0)) {
            System.out.println("Es ist KEIN Schaltjahr da es weder durch 4, 100 oder 400 Teilbar ist");
        }
        else{
            System.out.println("hier ist etwas schief gelaufen");
        }
        sc.close();
    }

}

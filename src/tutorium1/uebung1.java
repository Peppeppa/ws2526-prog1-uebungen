package tutorium1;
import java.util.Scanner;

public class uebung1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ergebnis = "";


        for(int i = 1; i<=5; i++){
            System.out.println("scheibe einen String:");
            ergebnis += sc.nextLine();

        }
        System.out.println("Ergebnis:" + ergebnis);
        sc.close();


    }
}

package Lektion3;
import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {

        int jahr = jahr();

        System.out.println("Jahr: " + jahr);
    }

    public static int jahr (){
        System.out.println("bitte eine Jahreszahl eingeben:");
        Scanner sc = new Scanner(System.in);
        int jahr = sc.nextInt();
        sc.close();
        return jahr;
    }

    public static void schaltjahr(int jahr){


    }

}

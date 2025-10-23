package Lektion3;
import java.util.Scanner;


public class Würfelwurf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele Seiten soll der Würfel haben?");

        double seiten  = (input.nextDouble() );

        double wurf = Math.random();

        double range = 1 / seiten;

        double ergebnis = wurf / range + 1;

        System.out.println("du hast " + (int)ergebnis + " gewürfelt");
        double critrange = 1.0 - range;
        if (wurf >= critrange) {
            System.out.println("Kritischer Erfolg");

        }

    }

}

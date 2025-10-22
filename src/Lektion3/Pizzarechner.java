package Lektion3;
import java.util.Scanner;

public class Pizzarechner {
    public static void main(String[] args) {

        double durchmesser1 = 30.0;
        double preis1 = 1000.0;
        double durchmesser2 = 30.0;
        double preis2 = 10.0;
        int auswahl1 = 1;
        int auswahl2 = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Wähle die größe der ersten Pizza:");
        System.out.print("[1] 26cm   [2]28cm   [30]cm");
        //int auswahl1 = input.nextInt();

        System.out.println("Wie teuer ist die erste Pizza?");
        //double preis1 = input.nextDouble();

        System.out.println("Wähle die größe der zweiten Pizza:");
        System.out.print("[1] 26cm   [2]28cm   [30]cm");
        //int auswahl2 = input.nextInt();
        System.out.println("Wie teuer ist die zweite Pizza:?");
        //double preis2 = input.nextDouble();



        double flaeche1 = Math.PI * (durchmesser1 / 2) * (durchmesser1 / 2);
        double preisleistung1 = preis1 / flaeche1;
        double flaeche2 = Math.PI * (durchmesser2 / 2) * (durchmesser2 / 2);
        double preisleistung2 = preis2 / flaeche2;
        if (preisleistung1 < preisleistung2) {
            System.out.println("Pizza 1 lohnt sich mehr");
        }
        else if (preisleistung1 > preisleistung2) {
            System.out.println("Pizza 2 lohnt sich mehr");
        }

        System.out.printf("%2$.2f %1$s" ,"€/cm²", preisleistung1);
        System.out.printf("%2$.2f %1$s" ,"€/cm²", preisleistung2);



    }

}

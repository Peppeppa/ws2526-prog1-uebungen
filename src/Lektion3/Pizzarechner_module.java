package Lektion3;
import java.util.Scanner;

public class Pizzarechner_module {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Durchmesser Pizza 1: ");
        double d1 = input.nextDouble();
        System.out.print("Preis Pizza 1: ");
        double p1 = input.nextDouble();

        System.out.print("Durchmesser Pizza 2: ");
        double d2 = input.nextDouble();
        System.out.print("Preis Pizza 2: ");
        double p2 = input.nextDouble();

        double pl1 = berechnePreisLeistung(p1, d1);
        double pl2 = berechnePreisLeistung(p2, d2);

        vergleichePizzen(pl1, pl2);

        System.out.printf("Pizza 1: %.4f €/cm²\n", pl1);
        System.out.printf("Pizza 2: %.4f €/cm²\n", pl2);


    }

    public static double berechneFlaeche(double durchmesser) {
        return Math.PI * Math.pow(durchmesser / 2, 2);
    }

    public static double berechnePreisLeistung(double preis, double durchmesser) {
        double flaeche = berechneFlaeche(durchmesser);
        return preis / flaeche;
    }

    public static void vergleichePizzen(double pl1, double pl2) {
        if (pl1 < pl2) {
            System.out.println(" Pizza 1 lohnt sich mehr!");
        } else if (pl1 > pl2) {
            System.out.println(" Pizza 2 lohnt sich mehr!");
        } else {
            System.out.println("Beide Pizzen sind gleich gut.");
        }
    }

}


package lektion11;

import java.util.Scanner;

public class TageImMonat {

    public static int tageImMonat(String monat) {
        int tage = switch (monat) {
            case "Februar" -> 28;
            case "April", "Juni", "September", "November" -> 30;
            case "Januar", "März", "Mai", "Juli", "August", "Oktober", "Dezember" -> 31;
            default -> throw new RuntimeException("falscher Monatsname");
        };
        return tage;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean gueltig = false;

        while (!gueltig) {
            System.out.print("Monatsnamen eingeben: ");
            String monat = scanner.nextLine();

            try {
                int tage = tageImMonat(monat);
                System.out.println(monat + " hat " + tage + " Tage.");
                gueltig = true;   // Schleife beenden
            }
            catch (RuntimeException e) {
                System.out.println("Nochmal: ");
            }
        }

        scanner.close();
    }
}

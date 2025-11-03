package lektion5;

public class ReihenwertBerechnung {
    public static void main(String[] args) {
        double summe = 0.0;
        double aAlt = 0.0;
        double differenz = 1.0;
        int k = 1;

        while (differenz > 1e-5) {
            summe +=  1.0 / (k * k);
            double aNeu =  6 * summe;

            differenz = Math.abs(aNeu - aAlt);
            System.out.printf("k = %d, a = %.8f, Änderung = %.10f%n", k, aNeu, differenz);

            aAlt = aNeu;
            k++;
        }
        System.out.println("Endergebnis: " + aAlt);
        System.out.println("Anzahl der Glieder: " + (k - 1));
    }
}





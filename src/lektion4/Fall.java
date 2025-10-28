package lektion4;
import java.util.Scanner;


public class Fall {
    public static void main(String[] args) throws InterruptedException {
        final double g = 9.80665;
        Scanner sc = new Scanner(System.in);
        System.out.println("bitte die Falldauer in Sekunden eingeben: ");
        double falldauer = sc.nextDouble();
        double strecke = 0.0;
        int printdauer = 0;

        for (int i = 0; i < falldauer; i++) {
            printdauer++;
            strecke = 0.5 * g * Math.pow(printdauer, 2);
            System.out.println("Zeit: " + printdauer + " Sekunden: Zurückgelegte Strecke: " + strecke + " cm.");
            Thread.sleep(600);

        }
    }

}

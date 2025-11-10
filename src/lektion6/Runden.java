package lektion6;
import java.util.Scanner;

public class Runden {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("bitte eine Zahl eingeben: ");
        double x = input.nextDouble();

        System.out.println("auf wieviel Nachkommastellen soll gerundet werden?");
        int n = input.nextInt();

        double ergebnis=kommarunden(x, n);
        System.out.println(ergebnis);
        input.close();

    }
    public static double runden(double x){
        int ganzzahl = (int) x;
        double nachkomma = x - ganzzahl;
        if (nachkomma >= 0.5){
            double ergebnis = ganzzahl + 1;
            return ergebnis;
        }
        else {
            double ergebnis = ganzzahl;
            return ergebnis;
        }
    }
    public static double kommarunden(double x, int n){
        double  zahl = 1.0;
        for (int i = 0; i < n; i++){
            zahl = zahl * 10;
        }
        double verschoben = x * zahl;
        double gerundet = runden(verschoben);
        double ergebnis = gerundet /zahl;
        return ergebnis;

    }
}

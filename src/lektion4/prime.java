package lektion4;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte zu untersuchende Zahl eingeben: ");
        int n = input.nextInt();

        System.out.println("Prüfe alle Zahlen bis " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (istPrimzahl(i)) {
                System.out.println(i + " ist eine Primzahl");
            }
        }
    }

    public static boolean istPrimzahl(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
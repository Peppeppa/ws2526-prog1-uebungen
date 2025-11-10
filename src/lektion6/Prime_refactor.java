package lektion6;

import java.util.Scanner;

public class Prime_refactor {
    public static void main(String[] args) {
        boolean ist = prime();
        System.out.println(ist);
    }

    private static boolean prime() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte zu untersuchende Zahl eingeben: ");
        int n = input.nextInt();
        boolean ist = false;

        for (int i = 2; i <= n; i++) {
            ist = istPrimzahl(i);
        }
        return ist;

    }

    public static boolean istPrimzahl(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

package lektion5;

public class pi {
    public static void main(String[] args) {
        int n = 4;
        double breite = 1.0 / n;
        double summe = 0.0;


        for (int i = 0; i < n; i++) {
            double x = i * breite;
            double y = Math.sqrt(1 - x * x);
            summe += y;
        }

        double pi = 4 * summe * breite;
        System.out.println(pi);
    }

}

package Lektion8;

public class ParaMultiplikation {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Es müssen genau zwei Zahlen als Argumente übergeben werden! Sonst gehts net");
            return;
        }
        int zahl1 = parseZahl(args[0]);
        int zahl2 = parseZahl(args[1]);
        int ergebnis = multipliziere(zahl1, zahl2);
        System.out.println("Ergebnis: " + ergebnis);
    }
    public static int parseZahl(String arg) {
        return Integer.parseInt(arg);
    }
    public static int multipliziere(int a, int b) {
        return a * b;
    }
}
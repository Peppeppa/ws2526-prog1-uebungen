package lektion7;

public class Sinusfunktion {
    public static void main(String[] args) {
        System.out.println(sin(15));
    }
    public static double sin(double x){
        double zaehler = x;
        double nenner = 1.0;
        double summe = x;
        double summand = x;



        for (int i = 3; summand > 1E-15 ||
                       summand < -1E-15;i=i+2)
        {
            zaehler = zaehler * x * x * (-1);
            nenner = nenner * i * (i-1);
            summand = zaehler/nenner;
            summe = summe + summand;

        }
        return summe;

    }
}

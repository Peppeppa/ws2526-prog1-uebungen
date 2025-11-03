package lektion5;

public class quadratwurzel {
    public static void main(String [] args){
        double x = 2.0;
        double ergebnis = wurzel(x);
        System.out.println("Die Wurzel von " + x + " ist " + ergebnis);
    }

    public static double wurzel(double x){
        double schaetzwert = 1.0;

        while(!gutGenug(schaetzwert, x)) {
            schaetzwert = verbessern(schaetzwert, x);
        }
        return schaetzwert;

    }

    public static boolean gutGenug(double schaetzwert, double x){
        return Math.abs((schaetzwert * schaetzwert) -x) < 1e-15;
    }

    public static double verbessern(double schaetzwert, double x){
        return mittelwert(schaetzwert, x/schaetzwert);
    }

    public static double mittelwert(double x, double y){
        return (x+y)/2.0;
    }

}

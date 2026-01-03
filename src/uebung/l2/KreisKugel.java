package uebung.l2;

public class KreisKugel {

    public static void main(String[] args) {

        int r = 3;
        kreisflaeche(r);
        kreisumfang(r);
        kugelvolumen(r);


    }

    public static void kreisflaeche(int radius) {
        double a = (Math.PI * radius * radius);
        System.out.println("Die Kreisflaeche beträgt " + a);
        return;
    }

    public static void kreisumfang(int radius) {
        double u = (2 * Math.PI * radius);
        System.out.println("Der Kreisumfang beträgt " + u);
        return;
    }

    public static void kugelvolumen(int radius){
        double v = (4/3*Math.PI*radius*radius*radius);
        System.out.println("Das Kugelvolumen beträgt " + v);
        return;

    }
}


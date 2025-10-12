package lektion2;

public class kreiskugel
{
    public static void main(String[] args) {

        //12.10.2025
        float r = 5.0F;
        float pi = 3.14159265359F;
        System.out.println("Der Radius beträgt " + r + " cm");
        System.out.println("Pi ist " + pi);

        // Kreisfläche
        float kreisflaeche;
        kreisflaeche = pi * (r * r);
        System.out.println("Der Flächeninhalt des Kreises beträgt: " + kreisflaeche + " cm²");

        // Kreisumfang
        float kreisumfang;
        kreisumfang = 2 * pi * r;
        System.out.println("Der Umfang des Kreises beträgt " + kreisumfang + " cm");

        // Volumen Kugel
        float volKugel;
        volKugel = 4 / 3 * pi * (r * r * r);
        System.out.println("Das Volumen einer Kugel beträgt " + volKugel + " cm³");

    }
}

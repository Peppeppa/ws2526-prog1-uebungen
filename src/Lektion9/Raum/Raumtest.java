package Lektion9.Raum;

public class Raumtest {

    public static void main(String[] args) {

        Raum r1 = new Raum("I.2.1", 120);
        Raum r2 = new Raum("I.2.15", 80);

        System.out.println("Raum " + r1.getKennung() + " belegt? " + r1.isBelegt());
        System.out.println("Raum " + r2.getKennung() + " belegt? " + r2.isBelegt());

        r1.setBelegt(true);

        System.out.println("\nNach Belegung von I.2.1:");
        System.out.println("Raum " + r1.getKennung() + " belegt? " + r1.isBelegt());
        System.out.println("Raum " + r2.getKennung() + " belegt? " + r2.isBelegt());
    }
}


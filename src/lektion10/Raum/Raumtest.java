package lektion10.Raum;

public class Raumtest {

    public static void main(String[] args) {

        Raum r1 = new Raum("I.2.1", 3);

        Student s1 = new Student("Zufallsname", 12345);
        Student s2 = new Student("Nocheinname", 23456);
        Student s3 = new Student("jemand", 34567);
        Student s4 = new Student("niemand", 45678);

        r1.betreteRaum(s1);
        r1.betreteRaum(s2);
        r1.betreteRaum(s3);

        r1.betreteRaum(s4);

        System.out.println();
        r1.listStudenten();

        r1.verlasseRaum(s2);
        r1.verlasseRaum(s1);

        System.out.println();
        r1.listStudenten();
    }
}


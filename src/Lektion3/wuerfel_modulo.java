package Lektion3;

public class wuerfel_modulo {
    public static void main(String[] args) {
        int wuerfel = (int) (Math.random() * 100);
        System.out.println((wuerfel % 6) +1);

    }
}

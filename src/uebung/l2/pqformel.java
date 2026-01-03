package uebung.l2;
import java.util.Scanner;

public class pqformel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double p = 12;
        double q = 3;

//        System.out.println("bitte p eingeben: ");
//        p = input.nextDouble();
//        System.out.println("bitte q eingeben: ");
//        q = input.nextDouble();

        double diskriminante = (p / 2) * (p / 2) - q;

        if (diskriminante >= 0) {

            double x1 = -p / 2 + Math.sqrt(diskriminante);
            double x2 = -p / 2 - Math.sqrt(diskriminante);

            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);

        } else {
            System.out.println("Keine reellen Lösungen");
        }

        input.close();
    }
}

package Lektion3;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben: ");
        int x = input.nextInt();


        if (x % 7 == 0)
            System.out.println("Die Zahl ist ohne Rest durch 7 Teilbar.");

        else
            System.out.println("Die Zahl ist nicht ohne Rest durch 7 Teilbar.");




    }
}

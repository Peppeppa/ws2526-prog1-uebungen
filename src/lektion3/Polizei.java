package lektion3;

import java.util.Scanner;

public class Polizei {
    public static void main(String[] args) {
        int groesse;
        int alter;
        Scanner input = new Scanner(System.in);
        System.out.print("Größe in cm: ");
        groesse = input.nextInt();
        System.out.print("Alter in Jahren: ");
        alter = input.nextInt();

       if (alter > 17 && alter < 25 && groesse > 165){
           System.out.println("Vollgas!");

       }

       else System.out.println("leider keine chance");
    }



}

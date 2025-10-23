package Lektion3;

import java.util.Scanner;

public class Einzelzeichen {

    public static void main(String[] args) {

        char eingabe = eingabe();
        System.out.println(eingabe);
        proof(eingabe);
    }

    public static char eingabe() {
        Scanner input = new Scanner(System.in);

        System.out.println("Schreib was:");
        char eingabe = input.next().charAt(0);

        input.close();
        return eingabe;
    }

    public static void proof(char eingabe){
        int charToInt = (int)eingabe;
        boolean u = true;
        if (charToInt >= 65 && charToInt <= 90) {
            System.out.println("Großbuchstabe");
            u = false;
        }
        if (charToInt >= 48 && charToInt <= 57 || charToInt >= 65 && charToInt <= 70 || charToInt >= 97 && charToInt <= 102) {
            System.out.println("Hexadezimalzahl");
            u = false;
        }
        if (charToInt >= 48 && charToInt <= 56 ) {
            System.out.println("Oktalzahl");
            u = false;
        }
        if (charToInt >= 48 && charToInt <= 49 ) {
            System.out.println("Binärzahl");
            u = false;
        }
        if (u){
            System.out.println("Unbekannt");
        }
      }
}

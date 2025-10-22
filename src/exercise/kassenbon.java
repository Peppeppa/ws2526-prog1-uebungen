package exercise;

import java.util.Scanner;

public class kassenbon {
    public static void main(String[] args) {
        double preisTomate = 1.99;
        double preisJoghurt = 1.49;
        double preisKaese = 2.99;
        double geldImGeldbeutel = 20.0;

        Scanner myObj = new Scanner(System.in);
        System.out.println("wie viele Tomaten?");
        double anzTomaten = myObj.nextDouble();
        double gesTomate = anzTomaten * preisTomate;
        System.out.println("wie viele joghurt?");
        double anzJoghurt = myObj.nextDouble();
        double gesJoghurt =  anzJoghurt * preisJoghurt;
        System.out.println("wie viele kaese?");
        double anzKaese= myObj.nextDouble();
        double gesKaese =  anzKaese * preisKaese;
        double gesbon = gesJoghurt + gesKaese + gesTomate;

        System.out.println("-----Kassenbon----");
        System.out.println("Tomaten   " + anzTomaten + " x " + preisTomate + " €");
        System.out.println("                      " + gesTomate + " €");
        System.out.println("Joghurt   " + anzJoghurt + " x " + preisJoghurt + "€");
        System.out.println("                      " + gesJoghurt + " €");
        System.out.println("Kaese     " + anzKaese+ " x " + preisKaese + "€");
        System.out.println("                      " + gesKaese + " €");
        System.out.println("-----------------------");
        System.out.println("Gesamtbetrag          " + gesbon + " €");
        System.out.println("gegeben               " + geldImGeldbeutel + " €");
        double rueckgeld = geldImGeldbeutel - gesbon;

        if (rueckgeld > 0){
            System.out.println("Rückgeld             " + rueckgeld + "€");
        }

        System.out.println("Gesamtbetrag          " + gesbon + "€");




    }

}

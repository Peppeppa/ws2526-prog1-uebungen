package Lektion3;
import java.util.Scanner;

public class Matrikelnummer {
    public static void main(String[] args) {
        int matnr = matrikelnummer();
        checkMatNr(matnr);
    }

    public static int matrikelnummer(){
        System.out.println("Bitte Matrikelnummer eingeben;");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.close();
        return m;
    }

    public static void checkMatNr(int matnr){
        boolean v = true;
        if(matnr/100000==50){
            System.out.println("Dies ist eine valide Matrikelnummer");
            v = false;
                }
        if(matnr/100000==51){
            System.out.println("Dies ist eine valide Matrikelnummer");
            v = false;
        }
        if(matnr/100000==60){
            System.out.println("Dies ist eine valide Matrikelnummer");
            v = false;
        }
        if (v){
            System.out.println("keine valide Matrikelnummer");
        }
    }
}

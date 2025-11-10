package lektion6;
import java.util.Scanner;

public class Dreieck {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("wie viele reien?");
        int n = input.nextInt();
        baum(n);

    }

    public static void pyramide(int n){
        String zeile = "";
        for(int i = 1; i <= n; i++){
            zeile = zeile + "*";
            System.out.println(zeile);
        }

    }
    public static void baum(int n){

        for(int i = 1; i <= n; i++){

            for (int j = 1;j <= n-i; j++){
                System.out.print(" ");
            }
            for (int k = 1;k <= 2 * i -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

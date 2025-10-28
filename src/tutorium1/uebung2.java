package tutorium1;
import java.util.Scanner;

public class uebung2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String eingabe = "";
        String max_name = "";
        for(int i = 7; i >= 0; i--) {
            System.out.println("gib einen Namen ein");
            eingabe = scan.nextLine();
            if((max_name.compareTo(eingabe) > 0) || max_name.equals("")) {
                max_name = eingabe;

            }
            System.out.println(max_name);

        }

        scan.close();


    }

}

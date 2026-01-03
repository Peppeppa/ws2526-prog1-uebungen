package lektion12;
import java.util.Scanner;


public class Listen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Knoten oldtemp;
        Knoten temp;
        Knoten k;



        Knoten start = null;
        start = new Knoten("Baronson");

        k = new Knoten("Zylla");
        start.next = k;

        k = new Knoten("Cool");
        temp = start;

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = k;

        System.out.println("bitte namen eingeben:");
        String nachname = scanner.nextLine();
        k = new Knoten(nachname);

        if (k.getNachname().compareTo(start.getNachname()) < 0){
            k.next = start;
            start = k;
        }

        temp = start.next;
        oldtemp = start;
        while (temp != null){
            if (k.getNachname().compareTo(temp.getNachname()) < 0){
                k.next = temp;
                oldtemp.next = k;
                break;
            }
            else{
                oldtemp = temp;
                temp = temp.next;
            }
        }


        temp = start;
        while(temp != null){
            System.out.println(temp.getNachname());
            temp = temp.next;
        }



    }

}




















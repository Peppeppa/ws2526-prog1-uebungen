package Lektion3;
import java.util.Scanner;

public class uhrzeit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Stunde: ");
        int hour = sc.nextInt();
        System.out.println("Minute: ");
        int minute = sc.nextInt();
        System.out.println("Second: ");
        int second = sc.nextInt();

        if (hour <= 23 && hour >= 0) {
            if (minute <= 59 && minute >= 0) {
                if (second <= 59 && second >= 0) {
                    System.out.printf("%02d:%02d:%02d", hour, minute, second);
                    System.out.println(" ist eine valide Zeit");
                }
                else {
                    error();
                }
            }
            else  {
                error();
            }
        }
        else {
            error();
        }

    }
    public static void error() {
        System.out.println("das ist keine vernünftige Zeit");
    }


}

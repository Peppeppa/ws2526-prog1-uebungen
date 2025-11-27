package lektion7;
import java.util.Scanner;

public class Umwandlung_inGroßbuchstaben {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Bitte Text eingeben:");
        String text = input.nextLine();

        char[] arr = text.toCharArray();
        System.out.println(arr);

        char[] gross = inGrossbuchstaben(arr);
        System.out.println(gross);
    }


    public static char[] inGrossbuchstaben(char[] input){

        for (int i = 0 ; i < input.length ; i++){
            if ((input[i] >= 'a') && (input[i] <= 'z')){
                input[i] = (char)(input[i] - 32);
            }

        }
        return input ;


    }

}

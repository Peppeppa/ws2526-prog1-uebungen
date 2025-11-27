package lektion7;

import java.util.Scanner;

public class B_sprache {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("text eingeben");
        char[] textarr = text.toCharArray();

        System.out.println(textarr);

        char[] b = spielen(textarr);
        System.out.println(String.valueOf(b));


    }

    public static boolean istVokal(char c){
        return c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' ||
                c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U';
    }

    public static int calculateNewLength(char[] input){
        int neueLaenge = 0;
        for (int i = 0; i < input.length; i++){
            if (istVokal(input[i])){
                neueLaenge += 3;
            }
            else{
                neueLaenge += 1;
            }
        }
        return neueLaenge;
    }

    public static char[] spielen(char[] input){

        char[] result = new char[calculateNewLength(input)];
        int j = 0;


        for (int i = 0 ; i < input.length; i++){

            if (istVokal(input[i])) {
                result[j] = input[i];
                result[j+1] = 'b';
                result[j+2] = input[i];
                j = j + 3;
            }
            else {
                result[j] = input[i];
                j++;
            }


        }
        return result;
    }
}

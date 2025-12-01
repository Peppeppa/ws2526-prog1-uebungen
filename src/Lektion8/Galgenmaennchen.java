package Lektion8;
import java.util.Scanner;

public class Galgenmaennchen {
    public static void main(String[] args){
        gameLoopdiloop();

    }
        public static void gameLoopdiloop(){
        String gesuchtesWort = rndWort();
        char[] strichWort = wortVerdecken(gesuchtesWort).toCharArray();
        int versuche = 0;
        boolean gewonnen = false;

        while (versuche < 15 && !gewonnen){
            System.out.println((versuche + 1) + ". Versuch: " + String.valueOf(strichWort));
            char eingabe = eingabeEinlesen();
            if (checkCharInWord(gesuchtesWort, eingabe)){
                updateStrichWort(gesuchtesWort, strichWort, eingabe);
            }
            versuche++;
            if (checkWin(gesuchtesWort, strichWort)){
                gewonnen = true;
            }
        }

        if (gewonnen){
            System.out.println("Gewonnen! Das Wort war: " + gesuchtesWort);
        }
        else{
            System.out.println("Pech gehabt! Das Wort war: " + gesuchtesWort);
        }
    }

    public static boolean checkWin(String rndWord, char[] strichWort){
        String strichAlsString = String.valueOf(strichWort);
        if (strichAlsString.equals(rndWord)){
            return true;
        }
        return false;
    }

    public static char[] updateStrichWort(String rndWord, char[] strichWort, char userInput){
        char[] arr = rndWord.toCharArray();
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] == userInput) {
                strichWort[i] = userInput;
            }
        }
        return strichWort;
    }

    public static boolean checkCharInWord(String rndWord, char userInput){
        char[] arr = rndWord.toCharArray();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == userInput){
                return true;
            }
        }
        return false;
    }

    public static String wortVerdecken(String input){
        String normal = input;
        char[] arr = input.toCharArray();
        char[] strich = new char[arr.length];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == ' '){
                strich[i] = ' ';
            }
            else{
                strich[i] = '_';
            }
        }
        return String.valueOf(strich);
    }

    public static String rndWort(){
        // String zufallswort = rndWort();
        String[] wort = new String[20];
        wort[0] = "Test";
        wort[1] = "Rott";
        wort[2] = "Zeug";
        wort[3] = "Rindfleischettiketierungsgesetz";
        wort[4] = "Auto";
        wort[5] = "Zug";
        wort[6] = "Schinkennudeln";
        wort[7] = "Pizza";
        wort[8] = "GitHub";
        wort[9] = "Racket";
        wort[10] = "Bruecke";
        wort[11] = "Schornsteinfeger";
        wort[12] = "Paketbote";
        wort[13] = "Test2";
        wort[14] = "Test43";
        wort[15] = "Test5";
        wort[16] = "Test6";
        wort[17] = "Test7";
        wort[18] = "Test8";
        wort[19] = "Test9";
        int index = (int)(Math.random() * 20);
        return wort[index].toUpperCase();
    }

    public static char eingabeEinlesen() {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        return Character.toUpperCase(text.charAt(0));
    }
}

package lektion5;

public class Potenz {
    public static void main(String[] args){
        double b = 4.0;
        int n = 4;
        double ergebnis = b;


        if (n == 0){
            ergebnis = 1.0;
        }

        else if (n>0){
            int i = 1;
            while (i < n) {
                ergebnis = ergebnis * b;
                System.out.println(ergebnis);
                i++;
            }
        }

        else {
            int i = 1;
            int positiverN = n * -1;
            while (i < positiverN) {
                ergebnis = ergebnis * b;
                System.out.println(ergebnis);
                i++;

            }
            ergebnis = 1.0;


        }
        System.out.println("Endergebnis: " + ergebnis);


    }




}

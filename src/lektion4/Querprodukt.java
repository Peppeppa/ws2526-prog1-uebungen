package lektion4;

public class Querprodukt {
    public static void main (String [] args){
        int zahl = 123;
        int querprodukt = calcQuerprodukt(zahl);
        System.out.println("Das Querprodukt der Zahl " + zahl + " betraegt " + querprodukt);
    }
    public static int calcQuerprodukt(int n){
        int produkt = 1;
        while ( n > 0 ){
            int ziffer = n % 10;
            produkt *= ziffer;
            n /= 10;
        }
        return produkt;
    }


    }



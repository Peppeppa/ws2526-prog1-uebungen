package lektion7;
import java.util.Scanner;

public class Arithmetisches_Mittel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Anzahl der einzulesenden Werte: ");
        int anzahl = input.nextInt();
        float[] werte = new float[anzahl];

        for (int i=0; i < anzahl; i++){
            System.out.print( (i +1)+ ". Wert:");
            werte[i] = input.nextFloat();
            //System.out.println(werte[i]);
        }

        float summe = 0;

        float min = werte[0];
        float max = werte[0];
        for (int i=0; i < anzahl; i++){

            if (werte[i] < min){
                min = werte[i];
            }
            if (werte[i] > max){
                max = werte[i];
            }
            summe = summe + werte[i];
        }
        float mittelwert = summe/anzahl;
        System.out.println("Kleinster Wert: " + min);
        System.out.println("Groesster Wert: " + max);
        System.out.printf("Arithmetischer Mittelwert: %.2f%n",mittelwert);

        float summeQuadrate = 0;
        for (int i=0; i < anzahl; i++){
            float differenz = werte[i] - mittelwert;
            float quadrat = differenz * differenz;
             summeQuadrate = summeQuadrate + quadrat;
        }
        float varianz = summeQuadrate / anzahl;
        float standardabweichung = (float) Math.sqrt(varianz);
        System.out.printf("Standardabweichung: %.2f", standardabweichung);


        input.close();

    }


}

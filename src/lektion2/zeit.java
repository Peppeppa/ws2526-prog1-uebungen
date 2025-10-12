package lektion2;

import java.time.LocalTime;

public class zeit {
    //12.10.2025
    public static void main(String[] args) {

        int stunden = LocalTime.now().getHour();
        int minuten = LocalTime.now().getMinute();
        int sekunden = LocalTime.now().getSecond();

        System.out.println("Die Uhrzeit ist " + stunden + ":" + minuten + ":" + sekunden);

        // Sekunden seit Mitternacht
        int sekSeitMitternacht;
        sekSeitMitternacht = ((stunden * 60) + minuten) * 60 + sekunden;
        System.out.println("Seit Mitternacht sind " + sekSeitMitternacht + " Sekunden vergangen.");

        // sekunden bis Mitternacht
        int sek24H = 24 * 60 * 60;
        int secBisMitternacht;
        secBisMitternacht = sek24H - sekSeitMitternacht;
        System.out.println("Bis Mitternacht sind es " + secBisMitternacht + " Sekunden.");

        // Prozentsatz des vergangen Tages
        double prozentDesTages;
        prozentDesTages = ((double) sekSeitMitternacht / sek24H) * 100;
        System.out.println("Es sind " + prozentDesTages + " % des Tages vergangen");


    }

}

package lektion2;

public class zeit {
    //12.10.2025
    public static void main(String[] args) {

        int stunden;
        int minuten;
        int sekunden;

        java.time.LocalTime time = java.time.LocalTime.now();
        System.out.printf("%02d:%02d%n", time.getHour(), time.getMinute());
    }

}

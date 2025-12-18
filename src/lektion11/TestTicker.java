package lektion11;

public class TestTicker {

    public static void main(String[] args) {

        Ticker ticker = new Ticker(45);

        char[] text = "Wettervorhersage: Schnee in Wuerzburg".toCharArray();
        ticker.setNachricht(text);

        System.out.println(String.valueOf(ticker.getNachricht()));

        // Rotation um 14 Stellen
        ticker.rotateNachricht(14);

        System.out.println(String.valueOf(ticker.getNachricht()));
    }
}

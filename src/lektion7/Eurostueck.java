package lektion7;

public class Eurostueck {
    public static void main(String[] args) {

        int durchlaeufe = 10000;

        int bedingungErfuellt = 0;
        int euroInDritter = 0;

        for (int i = 0; i < durchlaeufe; i++) {

            boolean euroVorhanden = Math.random() < 0.5;

            if (!euroVorhanden) {
                bedingungErfuellt++;
            } else {
                int lage = (int)(Math.random() * 3) + 1; // 1,2 oder 3

                if (lage == 1 || lage == 2) {
                    bedingungErfuellt++;
                }
                if (lage == 3) {
                    bedingungErfuellt++;
                    euroInDritter++;
                }
            }
        }

        double wahrscheinlichkeit = (double)euroInDritter / bedingungErfuellt;

        System.out.println("Näherungswert: " + wahrscheinlichkeit);
    }
}

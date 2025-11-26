package lektion6;

public class Sprünge {
    public static void main(String[] args) {
        System.out.println(springeInMehrerenSpruengen(4, 1, 2)); // → 5
        System.out.println(springeInMehrerenSpruengen(5, 2, 3)); // → 2
    }

    public static int springeInMehrerenSpruengen(int distanz, int sprung1, int sprung2) {
        // Basisfälle
        if (distanz == 0) {
            return 1;  // genau aufgegangen → 1 Möglichkeit
        }
        if (distanz < 0) {
            return 0;  // zu weit gesprungen → keine Möglichkeit
        }

        // Rekursiver Fall:
        return springeInMehrerenSpruengen(distanz - sprung1, sprung1, sprung2)
                + springeInMehrerenSpruengen(distanz - sprung2, sprung1, sprung2);
    }
}


// erstellt durch GPT check ich noch nicht
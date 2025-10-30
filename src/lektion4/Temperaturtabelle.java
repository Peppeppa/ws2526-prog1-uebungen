package lektion4;

public class Temperaturtabelle {
    public static void main(String[] args) {
        System.out.println("Fahrenheit\tCelsius");

        for (int fahrenheit = 0; fahrenheit <= 300; fahrenheit++) {
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);

            System.out.printf("%d\t\t%.2f%n", fahrenheit, celsius);
        }
    }
}

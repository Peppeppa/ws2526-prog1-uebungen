package lektion4;

public class Temperaturtabelle {
<<<<<<< HEAD
    public static void main(String[] args) {
        System.out.println("Fahrenheit\tCelsius");

        for (int fahrenheit = 0; fahrenheit <= 300; fahrenheit++) {
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
=======
public static void main (String[] args){
    System.out.println("Fahrenheit " + " celsius");
    for (int i = 0; i <= 300; i++){

        System.out.println(i+'\t');
>>>>>>> db95fc3c42e4b0c4aec99317aaf655c6b9462eaf

            System.out.printf("%d\t\t%.2f%n", fahrenheit, celsius);
        }
    }
<<<<<<< HEAD
=======

}
>>>>>>> db95fc3c42e4b0c4aec99317aaf655c6b9462eaf
}

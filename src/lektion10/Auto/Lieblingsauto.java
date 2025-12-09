package lektion10.Auto;

public class Lieblingsauto  {
    public static void main(String[] args){
        Auto auto1 = new Auto("BMW M3", 2993, "blau", 2020);
        Auto auto2 = new Auto("Audi RS6", 3996, "schwarz", 2022);
        Auto auto3 = new Auto("VW Golf GTI", 1984, "rot", 2019);

        Auto groesstes = auto1;
        if (auto2.hubraum > groesstes.hubraum){
            groesstes = auto2;
        }
        if (auto3.hubraum > groesstes.hubraum){
            groesstes = auto3;
        }
        System.out.println("Den größten Hubraum hat: ");
        groesstes.printDaten();
        System.out.println("Insgesamt produzierte Autos: " + Auto.getProduktionsZaehler());


    }
}



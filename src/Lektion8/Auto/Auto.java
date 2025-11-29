package Lektion8.Auto;

public class Auto {
    String marke;
    int  hubraum;
    String farbe;
    int baujahr;

    public Auto(String marke, int hubraum, String farbe, int baujahr){
        this.marke = marke;
        this.hubraum = hubraum;
        this.farbe = farbe;
        this.baujahr = baujahr;
    }

    public void printDaten(){
        System.out.println("Marke: " + marke);
        System.out.println("Hubraum: " + hubraum + " ccm");
        System.out.println("Farbe: " + farbe);
        System.out.println("Baujahr: " + baujahr);
        System.out.println();

    }

    }

package Lektion9.Auto;

public class Auto {
    String marke;
    int  hubraum;
    String farbe;
    int baujahr;

    public Auto(String marke, int ccm, String farbe, int baujahr){
        this.marke = marke;
        if (ccm <= 0){
            this.hubraum = 1600;
        }
        else{
            this.hubraum = ccm;
        }
        this.farbe = farbe;
        this.baujahr = baujahr;
    }

    public String getMarke(){
        return marke;
    }
    public void setMarke(String marke){
        this.marke = marke;
    }

    public int getHubraum(){
        return hubraum;
    }
    public void setHubraum(int ccm){
        if (ccm > 0){
            this.hubraum = ccm;
        }
    }

    public String getFarbe(){
        return farbe;
    }
    public void setFarbe(String farbe){
        this.farbe = farbe;
    }

    public int getBaujahr(){
        return baujahr;
    }
    public void setBaujahr(int baujahr){
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

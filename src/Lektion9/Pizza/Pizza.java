package Lektion9.Pizza;

public class Pizza {
    String name;
    int[] durchmesser;
    float[] preis;


    public Pizza(String name, int[] durchmesser, float[] preis){
        this.name = name;
        this.durchmesser = durchmesser;
        this.preis = preis;
    }

    private float flaeche(int durchmesser){
        return (float) (Math.PI * Math.pow(durchmesser / 2.0,2));
    }
    private float preisLeistung(float preis, int durchmesser){
        return preis / flaeche(durchmesser);
    }
    public float bestePreisLeistung(){
        float beste = preisLeistung(preis[0], durchmesser[0]);

        for (int i=1; i<durchmesser.length; i++){
            float aktuell = preisLeistung(preis[i],durchmesser[i]);
            if (aktuell < beste){
                beste = aktuell;
            }
        }
        return beste;
    }
    public String besteKombiAlsString() {

        int besterIndex = 0;
        float beste = preisLeistung(preis[0], durchmesser[0]);

        for (int i = 1; i < durchmesser.length; i++) {
            float aktuell = preisLeistung(preis[i], durchmesser[i]);
            if (aktuell < beste) {
                beste = aktuell;
                besterIndex = i;
            }
        }

        return durchmesser[besterIndex] + " cm für "
                + preis[besterIndex] + " € (Preis/Leistung: " + beste + ")";
    }


}



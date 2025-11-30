package Lektion9.Raum;

public class Raum {

    private String kennung;
    private int maxStudenten;
    private boolean belegt;

    public Raum(String kennung, int maxStudenten) {
        this.kennung = kennung;
        this.maxStudenten = maxStudenten;
        this.belegt = false;   // Räume sind anfangs frei
    }

    public String getKennung() {
        return kennung;
    }

    public int getMaxStudenten() {
        return maxStudenten;
    }

    public boolean isBelegt() {
        return belegt;
    }

    public void setBelegt(boolean belegt) {
        this.belegt = belegt;
    }
}


package lektion11;

public class Ticker {

    private char[] nachricht;


    public Ticker(int groesse) {
        if (groesse <= 0) {
            groesse = 200;
        }

        nachricht = new char[groesse];

        // mit Leerzeichen füllen
        for (int i = 0; i < nachricht.length; i++) {
            nachricht[i] = ' ';
        }
    }


    public int getGroesse() {
        return nachricht.length;
    }


    public void setNachricht(char[] text) {

        int i = 0;

        while (i < nachricht.length && i < text.length) {
            nachricht[i] = text[i];
            i++;
        }


        while (i < nachricht.length) {
            nachricht[i] = '+';
            i++;
        }
    }


    public char[] getNachricht() {
        char[] kopie = new char[nachricht.length];

        for (int i = 0; i < nachricht.length; i++) {
            kopie[i] = nachricht[i];
        }

        return kopie;
    }


    public void resetNachricht(char zeichen) {
        for (int i = 0; i < nachricht.length; i++) {
            nachricht[i] = zeichen;
        }
    }


    public void resetNachricht() {
        resetNachricht('+');
    }


    public void rotateNachricht(int distance) {

        if (distance <= 0 || distance >= nachricht.length) {
            return;
        }

        char[] temp = new char[distance];

        for (int i = 0; i < distance; i++) {
            temp[i] = nachricht[i];
        }

        for (int i = 0; i < nachricht.length - distance; i++) {
            nachricht[i] = nachricht[i + distance];
        }

        for (int i = 0; i < distance; i++) {
            nachricht[nachricht.length - distance + i] = temp[i];
        }
    }
}


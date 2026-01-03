package lektion12;

public class Knoten {
    String nachname;
    String vorname;
    String telefonnummer;
    Knoten next;

    public Knoten(String nachname){
        this.nachname = nachname;
    }

    // getter setter

    public String getNachname(){
        return nachname;
    }
}

package Klausurvorbereitung;

public class PersonenKnoten {
    String nachname;
    int alter;
    PersonenKnoten next;
    PersonenKnoten prev;

    public PersonenKnoten(String nachnamen, int alter) {
        this.nachname = nachname;
        this.alter = alter;
    }
}

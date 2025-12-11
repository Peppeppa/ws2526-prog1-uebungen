package lektion10.Raum;

public class Raum {

    private String kennung;
    private int maxStudenten;
    private boolean belegt;

    private Student[] studentenImRaum;
    private int anzahlStudenten = 0;

    public Raum(String kennung, int maxStudenten) {
        this.kennung = kennung;
        this.maxStudenten = maxStudenten;
        this.belegt = false;
        this.studentenImRaum = new Student[maxStudenten];
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

    public void betreteRaum(Student s){

        if (anzahlStudenten >= maxStudenten){

            System.out.println("Raum " + kennung + " Voll");
            return;
        }

        studentenImRaum[anzahlStudenten] = s;
        anzahlStudenten++;
        belegt = true;
    }

    public void verlasseRaum(Student s){

        for (int i = 0; i < anzahlStudenten; i++){
            if (studentenImRaum[i] == s){
                for (int j = i; j < anzahlStudenten - 1; j++) {
                    studentenImRaum[j] = studentenImRaum[j+1];
                }

                anzahlStudenten--;
                studentenImRaum[anzahlStudenten] = null;

                if (anzahlStudenten == 0){
                    belegt = false;
                }

                return;
            }
        }

        System.out.println(s.getName() + " war nicht im Raum.");
    }

    public void listStudenten(){
        System.out.println("Studenten im Raum " + kennung + ":");

        if (anzahlStudenten == 0){
            System.out.println("kein Student im Raum");
            return;
        }

        for (int i = 0; i < anzahlStudenten; i++){
            Student s = studentenImRaum[i];
            System.out.println("- "+ s.getName() + " - " + s.getMatrikelnummer());
        }
    }


}


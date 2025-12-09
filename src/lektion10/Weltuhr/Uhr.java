package lektion10.Weltuhr;

public class Uhr {

    private int std;
    private int min;
    private int sek;

    // konstruktor?

    public Uhr (int std, int min, int sek){

        if (std < 0 || std >=24){
            setTime12();
            return;
        }
        if (min < 0 || min >=60){
            setTime12();
            return;
        }
        if (sek < 0 || sek >=24){
            setTime12();
            return;
        }

        this.std = std;
        this.min = min;
        this.sek = sek;

    }

    public int getStd(){
        return std;
    }
    public int getMin(){
        return min;
    }
    public int getSek(){
        return sek;
    }

    public void setUhr(int std, int min, int sek){

        if (std < 0 || std >= 24) {
            wrongTime();
            return;
        }
        if (min < 0 || min >= 60) {
            wrongTime();
            return;
        }
        if (sek < 0 || sek >= 60) {
            wrongTime();
            return;
        }
        this.std = std;
        this.min = min;
        this.sek = sek;
    }

    private void setTime12(){
        this.std = 12;
        this.min = 0;
        this.sek = 0;
    }
    private void wrongTime(){
        System.out.println("Ungültige Eingabe");
    }
    public void naechsteSek(){
        sek++;
        if (sek >= 60){
            min++;
            sek = 0;
        }
        if (min >= 60){
            std++;
            min = 0;
        }
        if (std >= 24){
            std = 0;
        }

    }
    public void printTime(){
        System.out.printf("%02d:%02d:%02d%n", std, min, sek);
    }


}

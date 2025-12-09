package lektion10.Weltuhr;

public class Weltuhr {
    public static void main(String[] args){

        Uhr[] weltuhren = new Uhr[24];

        for (int i=0; i < weltuhren.length; i++){
            weltuhren[i] = new Uhr(i,23,07);
        }
        for (int i=0; i < weltuhren.length; i++){

            weltuhren[i].naechsteSek();
            weltuhren[i].printTime();
        }
    }
}

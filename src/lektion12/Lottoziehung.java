package lektion12;

public class Lottoziehung {
    public static void main(String[] args) {



        LottoZahl start = null;
        LottoZahl temp;
        LottoZahl point;
        int listenLaenge = 1;

        start = new LottoZahl(1);

        for (int i = 2; i <= 49; i++) {
            point = new LottoZahl(i);
            temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = point;
        }
        //listenlänge
        temp = start;
        while (temp.next != null){
            listenLaenge++;
            temp = temp.next;
        }




        //print list
        temp = start;
        while (temp != null) {
            System.out.println(temp.getZahl());
            temp = temp.next;

        }
        System.out.println("wir haben " + listenLaenge + " Elemente in der liste");










    }
}




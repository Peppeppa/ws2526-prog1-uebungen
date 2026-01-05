package lektion12;

public class Lottoziehung {
    public static void main(String[] args) {

        LottoZahl start = baueListe1Bis49();
        int listenLaenge = 49;

        int[] gezogen = new int[6];

        for (int k = 0; k < 6; k++) {
            LottoZiehergebnis ergebnis = zieheZahl(start, listenLaenge);
            gezogen[k] = ergebnis.gezogeneZahl;
            start = ergebnis.neuerStart;
            listenLaenge--;
        }

        selectionSort(gezogen);

        System.out.println("Lottozahlen:");
        for (int i = 0; i < gezogen.length; i++) {
            System.out.print(gezogen[i]);
            if (i < gezogen.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    private static LottoZahl baueListe1Bis49() {
        LottoZahl start = new LottoZahl(1);
        LottoZahl temp = start;

        for (int i = 2; i <= 49; i++) {
            temp.next = new LottoZahl(i);
            temp = temp.next;
        }
        return start;
    }

    private static LottoZiehergebnis zieheZahl(LottoZahl start, int listenLaenge) {

        int index = (int) (Math.random() * listenLaenge);

        if (index == 0) {
            int gezogen = start.zahl;
            LottoZahl neuerStart = start.next;
            return new LottoZiehergebnis(neuerStart, gezogen);
        }

        LottoZahl prev = start;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        LottoZahl current = prev.next;
        int gezogen = current.zahl;

        prev.next = current.next;

        return new LottoZiehergebnis(start, gezogen);
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }
}

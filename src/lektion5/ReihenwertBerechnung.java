package lektion5;

public class ReihenwertBerechnung {
    public static void  main (String [] args){

        double ak = 0;
        double k = 1.0;

        while (true){
            ak = (1/(k*k));
            k++;
            if(k<0.000001) break;
        }
        ak = ak*6;
        System.out.println("Das ak ist " + ak);


//        double e = 1;
//        int i = 1;
//        double f =1;
//
//        //6*
//
//        while (true){
//            f *= i;
//            double temp = e;
//            e = e + 1/f;
//            System.out.println(i + " " + e);
//            i++;
//            if (e-temp<0.000001) break;

    }

}

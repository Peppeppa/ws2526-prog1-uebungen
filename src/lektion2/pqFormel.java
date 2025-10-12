package lektion2;

public class pqFormel {
    //12.10.2025
    public static void main(String[] args) {

        double p = 7;
        double q = 2;
        double x1;
        double x2;
        double wurzel;
        double pHalbe = p / 2;
        System.out.println("pHalbe = " + pHalbe);

        // x1 ->
        x1 = -pHalbe + Math.sqrt(Math.pow(pHalbe, 2) - q);
        System.out.println("x1: " + x1);

        // x2 ->
        x2 = -pHalbe - Math.sqrt(Math.pow(pHalbe, 2) - q);
        System.out.println("x2: " + x2);

    }
}

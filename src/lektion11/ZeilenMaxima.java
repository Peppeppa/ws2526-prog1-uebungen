package lektion11;

public class ZeilenMaxima {
public static void main(String[] args){
    double[][] matrix = {
            {1.2, 3.4, 2.1},
            {5.6, 4.4, 9.0},
            {7.7, 7.1, 7.6}
    };
    double[] ergebnis = zeilenMaxima(matrix);
    for(int i = 0; i < ergebnis.length; i++){
        System.out.println("Max Zeile " + i + " : " + ergebnis[i]);
    }


}
    public static double[] zeilenMaxima(double [][] matrix){
        double[] ergebnis = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            double max = matrix[i][0];
            for (int j = 1; j < matrix[i].length;j++){
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
            ergebnis[i] = max;
        }
        return ergebnis;
    }
}

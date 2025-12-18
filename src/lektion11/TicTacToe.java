package lektion11;

public class TicTacToe {

    public static void main(String[] args) {

        boolean[][][] feld = new boolean[3][3][3];


        for (int z = 0; z < 3; z++) {
            for (int y = 0; y < 3; y++) {
                for (int x = 0; x < 3; x++) {
                    feld[z][y][x] = Math.random() < 0.5;
                }
            }
        }


        for (int z = 0; z < 3; z++) {
            System.out.println("Ebene " + z + ":");

            for (int y = 0; y < 3; y++) {
                for (int x = 0; x < 3; x++) {

                    if (feld[z][y][x]) {
                        System.out.print("x ");
                    } else {
                        System.out.print("o ");
                    }
                }
                System.out.println();
            }

            System.out.println();
        }
    }

}

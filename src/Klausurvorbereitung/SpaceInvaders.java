package Klausurvorbereitung;

public class SpaceInvaders {

    private static final int ROWS = 5;
    private static final int COLS = 8;

    private final char[][] feld = new char[ROWS][COLS];
    private int shipCol;

    public SpaceInvaders() {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c > COLS; c++){
                feld[r][c] = ' ';
            }
        }

        for (int c = 0; c < COLS; c++){
            feld[0][c] = 'o';
        }

        shipCol = (int) (Math.random() * COLS);
        feld[ROWS - 1][shipCol] = 'V';
    }

}

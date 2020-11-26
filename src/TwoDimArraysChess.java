public class TwoDimArraysChess {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                chessBoard[i][j] = ((i + j) % 2 == 0) ? "W" + chessBoarCord(i, j) : "B" + chessBoarCord(i, j);
                System.out.print(chessBoard[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static String chessBoarCord(int y, int x) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] numbers = {"8", "7", "6", "5", "4", "3", "2", "1"};

        return letters[x] + numbers[y];

    }
}

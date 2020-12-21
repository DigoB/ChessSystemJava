package application;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {

        for (int i=0; i<pieces.length; i++) {
            // Faz com que a matriz comece com o numero correto;
            System.out.print((8 - i) + " ");
            for (int j=0; j< pieces.length; j++) {
                printPiece(pieces[i][j]);
            }
            // Faz a quebra de linha da matriz;
            System.out.println();
        }
        // Imprime a linha de coordenadas inferior no tabuleiro;
        System.out.println("  a b c d e f g h");
    }

    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        }
        else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}

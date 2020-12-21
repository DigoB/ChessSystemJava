package application;

import chess.ChessMatch;

public class Program {

    private static UI Ui;

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();

        Ui.printBoard(chessMatch.getPieces());


    }
}

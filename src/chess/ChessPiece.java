package chess;

import boardGame.Board;
import boardGame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    // Apenas o get para que a cor da peça não possa ser alterada;
    public Color getColor() {
        return color;
    }
}


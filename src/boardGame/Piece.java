package boardGame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    // Sem o "set" para que o tabuleiro não seja alterado;
    protected Board getBoard() {
        return board;
    }
}

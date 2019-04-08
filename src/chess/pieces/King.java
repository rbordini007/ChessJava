package chess.pieces;

import boardgame.Board;
import chess.Color;

public class King extends chess.ChessPiece {

    public King(Color color, Board board) {
        super(color, board);
    }

    @Override
    public String toString() {
        return "K";
    }

}

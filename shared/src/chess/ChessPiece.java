package chess;

import java.util.Collection;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {

    private ChessGame.TeamColor pieceColor;
    private ChessPiece.PieceType type;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.pieceColor = pieceColor;
        this.type = type;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {

        KING {

        },

        QUEEN {

        },

        BISHOP {

        },

        KNIGHT {

        },

        ROOK {

        },

        PAWN {

        }
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
        return pieceColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        throw new RuntimeException("Not implemented");
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String symbol = " ";
        switch (type) {
            case KING:
                symbol = "K";
                break;
            case QUEEN:
                symbol = "Q";
                break;
            case BISHOP:
                symbol = "B";
                break;
            case KNIGHT:
                symbol = "N";
                break;
            case ROOK:
                symbol = "R";
                break;
            case PAWN:
                symbol = "P";
                break;
        }
        //String str = (condition) ? expressionTrue : expressionFalse;
        return (pieceColor == ChessGame.TeamColor.WHITE) ? symbol : symbol.toLowerCase();

    }
}

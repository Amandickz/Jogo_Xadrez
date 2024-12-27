package boardgame;

public class Board {

    private int row;
    private int column;
    private Piece[][] pieces;

    public Board(int row, int column) {
        if(row < 1 || column < 1) {
            throw new BoardException("Erro ao criar tabuleiro: as linhas e colunas devem ser maior que 1");
        }
        this.row = row;
        this.column = column;
        pieces = new Piece[row][column];
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Piece piece(int row, int column) {
        if(!positionExists(row, column)) {
            throw new BoardException("Posição não existe no tabuleiro");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        if(!positionExists(position)) {
            throw new BoardException("Posição não existe no tabuleiro");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if(thereIsAPiece(position)) {
            throw new BoardException("Já há uma peça na posição: " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public Piece removePiece(Position position) {
        if(!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        if(piece(position) == null) {
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }

    private boolean positionExists(int row, int column) {
        return row >= 0 && row < this.row && column >= 0 && column < this.column;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position) {
        if(!positionExists(position)) {
            throw new BoardException("Posição não existe no tabuleiro");
        }
        return piece(position) != null;
    }

}

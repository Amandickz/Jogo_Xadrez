package aplicacao;

import chess.ChessPiece;

public class Interface {

    public static void imprimirTabuleiro(ChessPiece[][] pecas) {
        for (int i = 0; i < pecas.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pecas[i].length; j++) {
                imprimirPeca(pecas[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    public static void imprimirPeca(ChessPiece peca) {
        if(peca == null) {
            System.out.print("-");
        } else {
            System.out.print(peca);
        }
        System.out.print(" ");
    }

}

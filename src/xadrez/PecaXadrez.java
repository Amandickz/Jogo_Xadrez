package xadrez;

import tabuleiro.Peca;
import tabuleiro.Posicao;

public class PecaXadrez extends Peca {

    private Cor cor;

    public PecaXadrez(Posicao posicao, Cor cor) {
        super(posicao);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
}

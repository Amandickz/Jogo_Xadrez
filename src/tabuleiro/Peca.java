package tabuleiro;

public class Peca {

    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Peca(Posicao posicao) {
        this.posicao = posicao;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}

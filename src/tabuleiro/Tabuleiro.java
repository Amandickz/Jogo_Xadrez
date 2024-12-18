package tabuleiro;

public class Tabuleiro {

    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        if(linhas < 1 || colunas < 1) {
            throw new ExcessaoTabuleiro("Erro ao criar tabuleiro: as linhas e colunas devem ser maior que 1");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public Peca peca(int linha, int coluna) {
        if(!posicaoExistente(linha, coluna)) {
            throw new ExcessaoTabuleiro("Posição não existe no tabuleiro");
        }
        return pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao) {
        if(!posicaoExistente(posicao)) {
            throw new ExcessaoTabuleiro("Posição não existe no tabuleiro");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void localPeca(Posicao posicao, Peca peca) {
        if(temUmaPeca(posicao)) {
            throw new ExcessaoTabuleiro("Já há uma peça na posição: " + posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    private boolean posicaoExistente(int linha, int coluna) {
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }

    public boolean posicaoExistente(Posicao posicao) {
        return posicaoExistente(posicao.getLinha(), posicao.getColuna());
    }

    public boolean temUmaPeca(Posicao posicao) {
        if(!posicaoExistente(posicao)) {
            throw new ExcessaoTabuleiro("Posição não existe no tabuleiro");
        }
        return peca(posicao) != null;
    }

}

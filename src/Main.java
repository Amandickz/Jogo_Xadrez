import aplicacao.Interface;
import xadrez.PartidaXadrez;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PartidaXadrez partida = new PartidaXadrez();
        Interface.imprimirTabuleiro(partida.getPecas());

    }
}
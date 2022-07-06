public class Main {
  public static void main(String[] args) {
    Jogador jogador = new Jogador("Paulo", "Elfo");

    float valor = (float) 180.00;

    jogador.adicionarBau("Elixir", valor, 3);
    jogador.adicionarBau("Comida", valor, 4);
    jogador.adicionarBau("Poção", valor, 2);

    jogador.calcularTotal();
    jogador.retornarTesouroMaiorValor();

    jogador.setarArma("Aerondith", 100, TipoArma.Espada);
    jogador.setarCastelo(100, 200);

    jogador.adicionarMasmorra("Templo da Perdição", "Nivel Médio", 1250);
    jogador.detalheMasmorra(0);

    jogador.castelo.receberAtaque(100);
  }
}
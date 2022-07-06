public class Main {
  public static void main(String[] args) {
    Jogador jogador = new Jogador("Paulo", "Elfo");

    float valor = (float) 180.00;

    jogador.adicionarBau("Elixir", valor, 3);
    jogador.adicionarBau("Comida", valor, 4);
    jogador.adicionarBau("Poção", valor, 2);

    jogador.calcularTotal();
    jogador.retornarTesouroMaiorValor();

    jogador.setarArma("Arco Longo", 100, TipoArma.ArcoeFlecha);
    jogador.setarCastelo(100, 200);

    jogador.adicionarMasmorra("Templo da Perdição", "Nivel Médio", 1250);
    jogador.detalheMasmorra(0);

    jogador.castelo.receberAtaque(100);

    Jogador jogador2 = new Jogador("Geralt", "Bruxo");

    jogador.adicionarBau("Óleo", valor, 3);
    jogador.adicionarBau("Elixir", valor, 2);
    jogador.adicionarBau("Armadura rara", valor, 4);

    jogador.calcularTotal();
    jogador.retornarTesouroMaiorValor();

    jogador.setarArma("Aerondith", 200, TipoArma.Espada);
    jogador.setarCastelo(100, 300);

    jogador.adicionarMasmorra("Covil da Striga", "Nivel alto", 2390);
    jogador.detalheMasmorra(0);

    jogador.castelo.receberAtaque(100);
  }

}
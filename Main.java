
public class Main {
  public static void main(String[] args) {

    Computador computador = new Computador();

    computador.processador = "intel";
    computador.memoria = "asus";
    computador.monitor = "eliteone";
    computador.placaMae = "Aouros";

    computador.ligarComputador();
    computador.setupComputador(computador);
    computador.desiliguarComputador();
  }
}

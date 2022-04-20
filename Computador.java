public class Computador {
    String processador;
    String memoria;
    String monitor;
    String placaMae;

    public void desiliguarComputador() {
        System.out.println("Desligando o computador");
    }

    public void ligarComputador() {
        System.out.println("ligando o computador");
    }

    public void reniciarComputador() {
        System.out.println("Reniciando o computador");
    }

    public void setupComputador(Computador computador) {
        System.out.println("o setup e " + computador.processador +  computador.memoria + computador.placaMae + computador.monitor);
    }

}




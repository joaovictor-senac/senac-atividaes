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

    public Computador(String processador, String memoria, String monitor, String placaMae){
        this.processador = processador;
        this.memoria = memoria;
        this.monitor = monitor;
        this.placaMae = placaMae;


//        System.out.println(memoria + "\n" + monitor + "\n" +  placaMae + "\n" + processador);
    }



}




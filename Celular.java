public class Celular {

    String chipSet;
    String memoria;
    String processador;
    String tela;



    public void celularON() {
        System.out.println("o celular ligou");
    }

    public void celularOFF(){
        System.out.println("o celular desligou");
    }

    public void celularSetup(Celular celular) {
        System.out.println("o setup e" + "\n" + celular.chipSet + "\n" + celular.memoria + "\n" + celular.processador + "\n" + celular.tela);

        int bareia = 100;
        for (int i = 0; i < 85; i++) {
            bareia = bareia - 1;

            if(bareia < 15){
                System.out.println("bateria está vazia");
                break;
            }
        }
    }



}

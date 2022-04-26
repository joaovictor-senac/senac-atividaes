public class Master {
    public static void main(String[] args) {
        Celular phone = new Celular();

        phone.processador = "8 core";
        phone.memoria = "4Gg";
        phone.chipSet = "Qualcomm";
        phone.tela = "7 polegadas";



//        phone.celularON();
//        phone.celularOFF();
       phone.celularSetup(phone);
    }
}

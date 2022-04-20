import java.util.Scanner;

public class aula2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite 1 para somar");
        System.out.println("digite 2 para subtrair");
        System.out.println("digite 3 para multiplicar");
        System.out.println("digite 4 para divididir");

//observe dos dados do usuario
        String operacoes = input.next();

        if (operacoes.equals("1")) {

            System.out.println("Digite primeiro numeiro para somar.");
            int numero1 = input.nextInt();
            System.out.println("Segundo numero");
            int numero2 = input.nextInt();
            //a variavel do total
            int total = numero1 + numero2;
            System.out.println("Resultado: " + total);

        } else if (operacoes.equals("2")) {

            System.out.println("Digite primeiro numero para subtrair.");
            int numero1 = input.nextInt();
            System.out.println("Segundo numero");
            int numero2 = input.nextInt();
            //a variavel do total
            int total = numero1 - numero2;
            System.out.println("Resultado: " + total);

        } else if (operacoes.equals("3")) {

            System.out.println("Digite primeiro numeiro para multiplicar.");
            int numero1 = input.nextInt();
            System.out.println("Segundo numero");
            int numero2 = input.nextInt();
            //a variavel do total
            int total = numero1 * numero2;
            System.out.println("Resultado: " + total);

        } else if (operacoes.equals("4")) {

            System.out.println("Digite primeiro numeiro para divididir.");
            int numero1 = input.nextInt();
            System.out.println("Segundo numero");
            int numero2 = input.nextInt();
            //a variavel do total
            int total = numero1 / numero2;
            System.out.println("Resultado: " + total);

        }


    }

}

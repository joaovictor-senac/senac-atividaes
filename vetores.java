import java.io.IOException;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class vetores {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String[] listaNome = new String[5];
    listaNome[0] = "joao";
    listaNome[1] = "thiago";
    listaNome[2] = "lisboa";
    listaNome[3] = "Souza";
    listaNome[4] = "Doglas";

    System.out.println("insira os nomes que deseja procurar= ");
    String nome = input.next();

    for (int i = 0; i < listaNome.length; i++) {
      if (listaNome[i].equals(nome)){
        System.out.println("Sua posicao da Matrize e " + i);
        break;
      }else {
        System.out.println("o " + nome + "nao foi encontrado" + i);
      }
      input.close();
    }
  }

}


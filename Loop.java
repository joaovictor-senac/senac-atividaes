import java.util.*;

public class Loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List nome = new ArrayList();
        nome.add("joao");
        nome.add("valentina");
        nome.add("kaio");
        nome.add("julio");
//        System.out.println(nome);

        //For off
        for (Object Lista : nome) {
            if (Lista.equals("kaio")) {
                System.out.println(Lista);
                System.out.println("comprimentar o kaio");
            }
        }
    }
}

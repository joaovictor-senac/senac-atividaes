import java.util.*;

public class emailFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List email = new ArrayList();
        email.add("pessoa0@gmail.com");
        email.add("pessoa1@gmail.com");
        email.add("pessoa32gmail.com");
        email.add("pessoa4@gmail.com");
        email.add("pessoa5@gmail.com");

        //For off
        for (Object Lista : email) {
            System.out.println(Lista);
        }
    }
}

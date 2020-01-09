package section3;

import java.util.Scanner;

public class RedCross {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tent = s.nextInt();
        int total = 0;
        int arrvar[] = new int[tent];
        for (int i = 0; i < arrvar.length; i++) {
            arrvar[i] = s.nextInt();
            total = total + arrvar[i];
        }

        System.out.println(total);
        s.close();

    }

}

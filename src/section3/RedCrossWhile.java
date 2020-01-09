package section3;

import java.util.Scanner;

public class RedCrossWhile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tent = s.nextInt();

        int[] arrvar = new int[tent];
        int total = 0;
        int i = 0;
        while (i < arrvar.length) {
            arrvar[i] = s.nextInt();
            total = total + arrvar[i];
            i++;

        }
        System.out.println(total);

        s.close();
        // TODO Auto-generated method stub

    }

}

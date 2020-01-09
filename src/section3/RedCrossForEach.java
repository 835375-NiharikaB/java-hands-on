package section3;

import java.util.Scanner;

public class RedCrossForEach {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tent = s.nextInt();
        {
            int[] arrvar = new int[tent];
            int total = 0;

            for (int i = 0; i < arrvar.length; i++) {
                arrvar[i] = s.nextInt();
            }
            for (int x : arrvar) {
                total = total + x;
            }
            System.out.println(total);
            s.close();

        }

    }
}

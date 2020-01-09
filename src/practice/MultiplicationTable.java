package practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input\n");
        int n = s.nextInt();
        System.out.println("Output\n");
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }

        s.close();
    }

}

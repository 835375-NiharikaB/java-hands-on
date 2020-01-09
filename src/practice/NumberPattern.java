package practice;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number pattern");
        int n = s.nextInt();
        for (i = 1; i <= n; i++)

        {
            for (j = 1; j <= i; j++)

            {

                System.out.print(i);
            }
            System.out.println("");
            s.close();
        }
    }
}

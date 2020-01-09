package section2;

import java.util.Scanner;

public class LabAllocation {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter x:");
        int L1 = s.nextInt();
        System.out.println("Enter y:");
        int L2 = s.nextInt();
        System.out.println("Enter z:");
        int L3 = s.nextInt();
        if (L1 < L2 && L1 < L3) {
            System.out.println("L1 has the minimal seating capacity");
        }
        if (L2 < L1 && L2 < L3) {
            System.out.println("L2 has the minimal seating capacity");
        }
        if (L3 < L1 && L3 < L2) {
            System.out.println("L3 has the minimal seating capacity");
        }
        s.close();
        // TODO Auto-generated method stub

    }

}

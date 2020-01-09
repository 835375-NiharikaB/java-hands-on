package section3;

import java.util.Scanner;

public class ReplaceOrganization {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String x = s.nextLine();

        System.out.println("Enter the old name of the company");
        String y = s.nextLine();

        System.out.println("Enter the new name of the company");
        String z = s.nextLine();

        System.out.println("the content of the modified document is");
        System.out.println(x.replace(y, z));

        s.close();
        // TODO Auto-generated method stub

    }

}

package section3;

import java.util.Scanner;

public class SecureUrl {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String website = s.nextLine();
        System.out.println("Enter the first string");
        String website1 = s.nextLine();

        if (website1.matches("[h][t]{2}[p][s]") && website.startsWith("https")) {
            System.out.println(website + " start with\" https\"");
        }

        else {
            System.out.println(website + "  does not start with \"https\"");

        }
        s.close();
        // TODO Auto-generated method stub

    }

}

package section3;

import java.util.Scanner;

public class WeekDays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the day number");
        int x = s.nextInt();

        String week_days[] = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday" };
        System.out.println("Day of the week is " + week_days[x]);

        s.close();
        // TODO Auto-generated method stub

    }
}

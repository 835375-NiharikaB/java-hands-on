package section3;

import java.util.Scanner;

public class WeekDayKeyword {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the day number");
        int x = s.nextInt();

        String week_days[] = new String[7];
        week_days[0] = "Saturday";
        week_days[1] = "Sunday";
        week_days[2] = "Monday";
        week_days[3] = "Tuesday";
        week_days[4] = "Wednesday";
        week_days[5] = "Thursday";
        week_days[6] = "Friday";
        System.out.println("Day of the week is " + week_days[x]);

        s.close();
        // TODO Auto-generated method stub

    }

}

package section2;

import java.util.Scanner;

class ProfitLoss {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of dozens of toys purchased");
        s.nextDouble();
        System.out.println("Enter the price per dozen");
        double y = s.nextDouble();
        System.out.println("Enter the selling price of 1 toy");
        double z = s.nextDouble();
        double costPrice = y / 12;
        double profit = (z - costPrice);
        double percentage = (profit / costPrice) * 100;
        System.out.println("Sam's profit percentage is " + percentage);
        s.close();
    }
}

//Java Program by Alex Bledsoe, 04/10/2017

import java.util.Scanner;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double cost = sc.nextDouble();
        double paid = sc.nextDouble();
        //Found on StackOverflow to handle pennies not equaling 0.01.
        double change = Double.valueOf(df.format(paid - cost));

        int $Count = 0;
        int qCount = 0;
        int dCount = 0;
        int nCount = 0;
        int pCount = 0;

        if (change != 0) {
            while (change >= 1.00) {
                $Count++;
                change -= 1.00;
            }
            while (change >= 0.25) {
                qCount++;
                change -= 0.25;
            }
            while (change >= 0.10) {
                dCount++;
                change -= 0.10;
            }
            while (change >= 0.05) {
                nCount++;
                change -= 0.05;
            }
            while (change >= 0.01) {
                pCount++;
                change -= 0.01;
            }
        }
        System.out.printf("You bought something worth %.2f.\r\n", cost);
        System.out.printf("You paid %.2f.\r\n", paid);
        System.out.println("==============================");
        System.out.println("Your change is:");
        System.out.println(" " + $Count + " dollar coins");
        System.out.println(" " + qCount + " quarters");
        System.out.println(" " + dCount + " dimes");
        System.out.println(" " + nCount + " nickels");
        System.out.println(" " + pCount + " pennies");
    }
}
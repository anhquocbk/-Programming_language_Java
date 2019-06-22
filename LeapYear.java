package Bai1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner checkYear = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = checkYear.nextInt();
        if (year % 4 == 0) {
            if (year%100 == 0) {
                if (year%400 == 0) {
                    System.out.print(year + "Is leap year");
                } else {
                    System.out.print(year + "Is not leap year");
                }
            } else {
                System.out.print(year + "Is leap year");
            }
        }
        else {
            System.out.print("Is not leap year");
        }
    }
}

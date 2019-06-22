package Bai1;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.print("February have 28 or 29 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Have 30 day");
                break;
            default:
                System.out.print("Have 31 day");
        }
    }
}

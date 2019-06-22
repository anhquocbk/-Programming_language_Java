package Bai1;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        int month;
        double money;
        double interest_rate;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        money = input.nextDouble();
        System.out.print("Enter number of months: ");
        month = input.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        interest_rate = input.nextDouble();

        for(int i = 0; i < month; i++){
            money += money * (interest_rate/100);
        }
        System.out.println("Total of interest: " + money);
    }
}

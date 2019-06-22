package Bai1;

import java.util.Scanner;

public class MoneySwap {
    public static void main(String[] args) {
        Scanner swap = new Scanner(System.in);
        System.out.println("You swap");
        System.out.println("1: VND --> USD");
        System.out.println("2: USD --> VND");
        int choice;
        choice = swap.nextInt();
        if (choice == 1) {
            double vnd,usd;
            System.out.println("Enter money: ");
            vnd = swap.nextDouble();
            usd = vnd/23000;
            System.out.println(usd + " USD");
        }
        if (choice == 2) {
            double vnd,usd;
            System.out.println("Enter money: ");
            usd = swap.nextDouble();
            vnd = usd*23000;
            System.out.println(vnd + " USD");
        }
    }
}

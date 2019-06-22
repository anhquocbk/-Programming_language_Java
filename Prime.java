package Bai1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int num;
        Scanner checkPrime = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = checkPrime.nextInt();

        if (num < 2) {
            System.out.println("The number isn't prime");
        } else {
            for (int i = 2; i < num; i ++) {
                if (num % i == 0) {
                    System.out.println("The number isn't prime");
                    return;
                }
            }
            System.out.println("The number is prime");
        }
    }
}

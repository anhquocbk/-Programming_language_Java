package Bai1;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        a = scanner.nextInt();
        a = Math.abs(a);

        System.out.print("Second number: ");
        b = scanner.nextInt();
        b = Math.abs(b);
        int max = 1;
        if (a == 0 || b == 0) {
            System.out.print("No greatest common factor");
        } else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    max = i;
                }
            }
            System.out.print("Greatest common factor = " + max);
        }
    }
}

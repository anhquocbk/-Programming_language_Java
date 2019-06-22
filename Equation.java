package Bai1;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        float a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        a = scanner.nextFloat();
        System.out.print("b: ");
        b = scanner.nextFloat();
        System.out.print("c: ");
        c = scanner.nextFloat();

        if (a != 0) {
            float answer = (c - b) / a;
            System.out.print("Equation pass with x: " + answer);
        } else if (b == c) {
            System.out.print("The solution is all x!");
        } else {
            System.out.print("No solution");
        }
    }
}

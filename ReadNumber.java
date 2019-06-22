package Bai1;

import java.util.Scanner;
public class ReadNumber {
    public static void Hundreds(int hundred) {
        switch (hundred) {
            case 1:
                System.out.print("One hundred ");
                break;
            case 2:
                System.out.print("Two hundred ");
                break;
            case 3:
                System.out.print("Three hundred ");
                break;
            case 4:
                System.out.print("Four hundred ");
                break;
            case 5:
                System.out.print("Five hundred ");
                break;
            case 6:
                System.out.print("Six hundred ");
                break;
            case 7:
                System.out.print("Seven hundred ");
                break;
            case 8:
                System.out.print("Eight hundred ");
                break;
            case 9:
                System.out.print("Nine hundred ");
                break;
        }
    }
    public static void Ones(int one) {
        switch (one) {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
            case 10:
                System.out.print("Ten");
                break;
        }
    }
    public static void Eleven (int eleven) {
        switch (eleven) {
            case 11:
                System.out.print("Eleven");
                break;
            case 12:
                System.out.print("Twelve");
                break;
            case 13:
                System.out.print("Thirteen");
                break;
            case 14:
                System.out.print("Fourteen");
                break;
            case 15:
                System.out.print("Fifteen");
                break;
            case 16:
                System.out.print("Sixteen");
                break;
            case 17:
                System.out.print("Seventeen");
                break;
            case 18:
                System.out.print("Eighteen");
                break;
            case 19:
                System.out.print("Nineteen");
                break;
        }
    }
    public static void Tens(int ten) {
        switch (ten) {
            case 2:
                System.out.print("Twenty ");
                break;
            case 3:
                System.out.print("Thirty ");
                break;
            case 4:
                System.out.print("Forty ");
                break;
            case 5:
                System.out.print("Fifty ");
                break;
            case 6:
                System.out.print("Sixty ");
                break;
            case 7:
                System.out.print("Seventy ");
                break;
            case 8:
                System.out.print("Eighty ");
                break;
            case 9:
                System.out.print("Ninety ");
                break;
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = number.nextInt();
        int hundreds = num / 100;
        int elevens = num - hundreds*100;
        int tens = (num - hundreds * 100) / 10;
        int ones = num - hundreds * 100 - tens * 10;
        if (num > 0 && num < 1000) {
            if (num < 10) {
                Ones(ones);
            } else if ( num < 20) {
                Eleven(num);
            } else if (num < 100) {
                Tens(tens);
                Ones(ones);
            } else if (tens == 1) {
                Hundreds(hundreds);
                Eleven(elevens);
            } else {
                Hundreds(hundreds);
                Tens(tens);
                Ones(ones);
            }
        } else {
            System.out.println("out of ability");
        }
    }
}

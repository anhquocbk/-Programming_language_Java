package Bai1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight;
        double height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight: ");
        weight = input.nextDouble();
        System.out.println("Enter height: ");
        height = input.nextDouble();
        double bmi;
        bmi = weight/(height*height);

        System.out.println("BMI= " + bmi);

        if (bmi < 18)
            System.out.println("Underweight");
        else if (bmi < 25.0)
            System.out.println("Normal");
        else if (bmi < 30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}

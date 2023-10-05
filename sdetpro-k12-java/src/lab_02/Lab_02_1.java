package lab_02;

import java.util.Scanner;

public class Lab_02_1 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your height(m): ");
        double userHeight = scanner.nextDouble();
        System.out.println("Please input your weight(kg): ");
        double userWeight = scanner.nextDouble();

        double userBMI;
        userBMI = userWeight/(userHeight*2);

        if (userBMI <= 18.5) {
            System.out.println("Underweight");
        } else if (userBMI <= 24.9) {
            System.out.println("Normal weight");
        } else if (userBMI <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}

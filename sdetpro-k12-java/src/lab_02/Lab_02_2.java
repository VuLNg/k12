package lab_02;

import java.util.Scanner;

public class Lab_02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int userInput = scanner.nextInt();

        if (userInput % 2 == 1){
            System.out.println("Odd number");
        }else {
            System.out.println("Even number");
        }
    }
}

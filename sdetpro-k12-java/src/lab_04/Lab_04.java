package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab_04 {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int arraySize = random.nextInt(10);
        System.out.println("The random size of the Array List is: " + arraySize);
        for (int i = 0; i < arraySize; i++) {
            arrayList.add(random.nextInt(1000));
        }
        System.out.println("Random Array List: "+ arrayList);

        boolean isContinuing = true;
        printGameMenu();
        while (isContinuing) {
            int userOption = getUserOption();
            if (userOption == 1) {
                System.out.println("Here are all numbers: ") ;
                for (int i = 0; i < arraySize; i++) {
                    System.out.println(arrayList.get(i));
                }
            } else if (userOption == 2) {
                int maxValue = arrayList.get(0);
                for (int i = 0; i < arraySize; i++) {
                    if (arrayList.get(i) > maxValue) {
                        maxValue = arrayList.get(i);
                    }
                }
                System.out.println("The maximum value is: " + maxValue);
            } else if (userOption == 3) {
                int minValue = arrayList.get(0);
                for (int i = 0; i < arraySize; i++) {
                    if (arrayList.get(i) > minValue) {
                        minValue = arrayList.get(i);
                    }
                }
                System.out.println("The minimum value is: " + minValue);
            } else if (userOption == 4) {
                System.out.println("What number do you want to search?");
                Scanner userInput = new Scanner(System.in);
                int searchNumber = userInput.nextInt();
                boolean noResult = true;
                for (int i = 0; i < arraySize; i++) {
                    if (searchNumber == arrayList.get(i)) {
                        noResult = false;
                        searchNumber = arrayList.get(i);
                        System.out.println("Here is your search result: " + searchNumber + " and its index is: " + arrayList.indexOf(searchNumber));
                        break;
                    }
                }
                if (noResult) {
                    System.out.println("That number is not in the list");
                }
            } else if (userOption == 5) {
                isContinuing = false;
            } else {
                System.out.println("The system does not have that option. Bye!!!");
                isContinuing = false;
            }
        }
    }

    private static int getUserOption() {
        System.out.println("\n Please input your option" );
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static void printGameMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("5. Exit");
    }
}

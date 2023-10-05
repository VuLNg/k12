package lab_03;

import java.util.Arrays;

public class Lab_03_2 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int arrayLength = intArr.length;
        int minimumValue = intArr[0];
        int maxValue = intArr[0];

        for (int i = 0; i < arrayLength; i++) {
            if (intArr[i] < minimumValue) {
                minimumValue = intArr[i];
            }
        }

        for (int i = 0; i < arrayLength; i++) {
            if (intArr[i] > maxValue) {
                maxValue = intArr[i];
            }
        }

        System.out.println("In the array: " + Arrays.toString(intArr));
        System.out.println("The max value is: " + maxValue);
        System.out.println("The minimum value is: " + minimumValue);
    }
}
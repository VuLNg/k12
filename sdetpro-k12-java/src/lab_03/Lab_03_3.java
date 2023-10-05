package lab_03;

import java.util.Arrays;

public class Lab_03_3 {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};
        int arrayLength = intArr.length;
        int temp = 0;
        System.out.println("The given array: " + Arrays.toString(intArr));

        for (int i = 0; i < arrayLength; i++) {
            for (int j = i+1; j < arrayLength; j++) {
                if(intArr[i] > intArr[j]) {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }

        System.out.println("\nArray is sorted from min to max: ");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
    }
}

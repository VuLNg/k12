package lab_03;

import java.util.Arrays;

public class Lab_03_1 {
    public static void main (String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int arrayLength = intArr.length;
        int evenNumber = 0;
        int oddNumber = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (intArr[i]%2 == 0){
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.println("In the array: " + Arrays.toString(intArr));
        System.out.println("Number of Even number is : " + evenNumber);
        System.out.println("Number of Odd number is : " + oddNumber);
    }
}

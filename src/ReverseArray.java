//This program will reverse the given array
//Time complexity: O(N/2)

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,5,6,7,4,8};

        System.out.println("Original array: " + Arrays.toString(arr));

        for(int i=0; i< arr.length/2; i++) {
            int temp = arr[i];
            int pos = arr.length-i-1;

            arr[i] = arr[pos];
            arr[pos] = temp;
        }

        System.out.println("Array after reversing: " + Arrays.toString(arr));
    }
}

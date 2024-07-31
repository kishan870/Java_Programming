//This program will copy elements from an array to new array and remove duplicates

import java.util.Arrays;

public class RemoveDuplicates {
    static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] uniqueArray = new int[n];
        int j=0;

        for(int i=0; i<n; i++) {
            int target = arr[i];
            if(!Arrays.stream(uniqueArray).anyMatch(num -> num == target)) {
                uniqueArray[j++] = arr[i];
            }
        }

        return Arrays.copyOf(uniqueArray, j);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,5,2,3,4,5, 6,3,6,7,8,4,5};
        System.out.println("Given array: " + Arrays.toString(arr));

        System.out.println("New array after removing duplicates: ");
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}

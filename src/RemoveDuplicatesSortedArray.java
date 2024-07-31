
//Leetcode 26: Return the number of unique elements in the sorted array. Should be done with O(1) extra memory.

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    static int numUniqueElements(int[] arr) {
        if(arr.length <= 1) {
            return arr.length;
        }

        int answer=1, currentNum=arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != currentNum) {
                answer++;
                currentNum = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,4,6,7,7,7,8,8,8,9,12,12,13,14,15,15,16,16};
        System.out.println("Current Array: " + Arrays.toString(arr));
        System.out.println("Length of current array: "+arr.length);

        System.out.println("Number of unique elements: "+numUniqueElements(arr));
    }
}

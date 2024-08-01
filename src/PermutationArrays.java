
// This program will check if two arrays are permutations of each other. 
//Arrays are assumed to be of same length

import java.util.Arrays;

public class PermutationArrays {
    static boolean isPermutation(int[] array1, int[] array2) {
        int sum1=0, sum2=0;
        int prod1=1, prod2=1;

        for(int i=0; i<array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
            prod1 *= array1[i];
            prod2 *= array2[i];
        }

        if(sum1 == sum2 && prod1 == prod2) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {3,1,2,5,6,4};

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        System.out.println("Is permutation: " + isPermutation(array1, array2));
    }
}

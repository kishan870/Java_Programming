import java.util.Arrays;
import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {
        int[] intArray; //Decleration
        intArray = new int[3]; //Instantiation
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        System.out.println(Arrays.toString(intArray));

        String sArray[] = {"a", "b", "c"};
        System.out.println(Arrays.toString(sArray));

        //User Input to array

        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<intArray.length; i++) {
            System.out.print("Enter next number: ");
            intArray[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(Arrays.toString(intArray));


    }
}

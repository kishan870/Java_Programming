//In this program, we will try to insert value to the array. If the location already has a value, we do not insert.
//If the location is out of bounds, we catch the exception.

import java.util.Arrays;

public class ArrayInsertion {
    int[] intArr = null;

    public ArrayInsertion(int sizeOfArray) {
        intArr = new int[sizeOfArray];
        for(int i=0; i< sizeOfArray; i++) {
            intArr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int insertValue) {

        try {

            if(intArr[location] == Integer.MIN_VALUE) {
                intArr[location] = insertValue;
                System.out.println("Insertion Successful");
                System.out.println("Array now is " + Arrays.toString(intArr));
    
            } else {
                System.out.println("Location" + location + "is already occupied");
            }

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Location " + location + " is out of bounds");
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {

        ArrayInsertion obj = new ArrayInsertion(4);
        System.out.println("Array before insertion: " + Arrays.toString(obj.intArr));

        obj.insert(0, 2);
        obj.insert(1, 4);
        obj.insert(2, 6);
        obj.insert(3, 7);
        obj.insert(2, 5);
        obj.insert(10, 67);

    }
}

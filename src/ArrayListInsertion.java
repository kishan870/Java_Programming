import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInsertion {
    public static void main(String[] args) {
        
        //Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30));
        System.out.println("Newly created arraylist: " + numbers);

        //Inserting elements into ArrayList
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        System.out.println("ArrayList after insertion: " + numbers);

        //Insert element into a given position
        numbers.add(2, 75);
        System.out.println("ArrayList after positional insertion: " + numbers);

        ArrayList<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("B");
        strList.add("C");
        System.out.println("ArrayList after insertion: " + strList);

    }
}

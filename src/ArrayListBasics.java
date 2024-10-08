import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListBasics {
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

        //Accessing the elements of the ArrayList
        //get element at position 2
        System.out.println("Element at position 2: " + numbers.get(2));
        System.out.println("StringList element at number 1: " + strList.get(1));

        strList.add("D");
        strList.add("E");

        //ArrayList traversal using for loop:
        System.out.println("Traversal using for loop: ");
        for(int i=0; i< strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        //ArrayList traversal using for each loop
        System.out.println("Traversal using for each loop: ");
        for(String letter: strList) {
            System.out.println(letter);
        }

        //ArrayList traversal using Iterator interface
        System.out.println("Traversal using iterator interface: ");
        Iterator<String> iterator = strList.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

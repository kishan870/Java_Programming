
//Demonstrate search and delete operations in arraylist

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSearchDelete {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

        //Search element using for each
        for(String letter: strList) {
            if(letter.equals("C")) {
                System.out.println("The element is found");
                break;
            }
        }

        //Search using indexOf method
        int index = strList.indexOf("D");
        System.out.println("The element C is found at position: " + index );

        //-1 indecates that the element is not found
        index = strList.indexOf("F");
        System.out.println("The element F is found at position: " + index );

    }
}

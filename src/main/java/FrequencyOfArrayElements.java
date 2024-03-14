import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {

    public static Map<String,Integer> frequencyOfElements(String[]arr){

        Map<String,Integer> elementCount = new HashMap<>();

        for (String eachWord : arr) {
            elementCount.put(eachWord, elementCount.getOrDefault(eachWord,0)+1);
        }

        return elementCount;
    }


    public static void main(String[] args) {

        String[]arr = {"Apple", "Banana", "apple", "Cherry", "Apple"};

        System.out.println(frequencyOfElements(arr));

    }


}
/*Write a function that takes a String array as parameter and returns a map object that
contains each element of array as key and their occurrence counts as value.
For calculating occurrence, array elements should be checked by regarding case sensitivity.
Order is not important.
EXAMPLE:
Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}

 */
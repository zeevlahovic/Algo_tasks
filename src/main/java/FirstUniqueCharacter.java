import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {


    public static void main(String[] args) {
        System.out.println(solutionWithMap("success"));
    }

    public static char solutionWithMap(String str) {
        if (str == null) throw new IllegalArgumentException("Input should not be null");
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return ' ';
    }
}


/*
    Write a function that returns the first non-repeated character from a string.
    If all characters are repeated return a space character.
    EXAMPLE:
    Input: "success"		output: u
    Explanation: u and e are non-repeated, u is the first non-repeated character
     */



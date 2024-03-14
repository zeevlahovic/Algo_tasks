import java.util.*;
import java.util.stream.Collectors;

public class FirstUniqueCharacter2 {


    public static char firstUniqueCharacter(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] arr = str.toCharArray();
        
        for (char eachChar : arr) {
            map.put(eachChar, map.getOrDefault(eachChar, 0) + 1);

        }
        for (Map.Entry<Character, Integer> eachSet : map.entrySet()) {
            if (eachSet.getValue() == 1) {
                return eachSet.getKey();
            }
        }

        return 'a';

    }

    public static void main(String[] args) {
        System.out.println(firstUniqueCharacter("success"));
    }
}



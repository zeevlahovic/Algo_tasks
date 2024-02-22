import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharactersMap {

    public static void main(String[] args) {

    }

    public static Map<Character,Integer> frequencyOfCharacter (String str){
        Map<Character,Integer> result = new LinkedHashMap<>();

        if(str == null){
            return null;
        }
        if(str.isEmpty()){
            return result;
        }

        String [] arr = str.split("");
        for(String each : arr){
            //   result.put(each.charAt(0), Collections.frequency(Arrays.asList(arr),each));
            result.put(each.charAt(0),result.getOrDefault(each.charAt(0),0)+1);

        }
        return result;
    }
    public static Map<Character,Integer> frequencyOfCharacter2 (String str){
        Map<Character,Integer> result = new LinkedHashMap<>();
        if(str == null){
            return null;
        }
        if(str.isEmpty()){
            return result;
        }
        str= str.toLowerCase();
        char [] arr = str.toCharArray();
        for(char each : arr){
            result.put(each,result.getOrDefault(each,0)+1);
        }
        return result;
    }
}

/*Write a method that returns the frequency of each character of a given String parameter.
 If the given String is null, then return null
 If the given String is empty return an empty map
Example-1
input: “”
output: empty map
explanation: input is empty
Example-2
input: null
output: null
explanation: input is null.
Example-3
input: responsible
output: {r=1, e=2, s=2, p=1, o=1, n=1, i=1, b=1, l=1}
explanation: characters are keys and occurrences are values

 */


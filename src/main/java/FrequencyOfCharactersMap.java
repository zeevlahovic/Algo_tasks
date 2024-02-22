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


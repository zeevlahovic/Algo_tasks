import java.util.*;

public class IndexOfFirstNonRepeatingVowel {



        public static int indexOfFirstNonRepeatingVowels(String str){
            // int index =-1 ;
            char [] arr = str.toCharArray();
            Map<Character,Integer> allChar = new LinkedHashMap<>();
            for(char each: arr){
                allChar.put(each,allChar.getOrDefault(each,0)+1);
            }
            Character[] allVowels = {'a','e','i','o','u'};
            Set<Character> vowel = new HashSet<>(Arrays.asList(allVowels));

            for (Character each : allChar.keySet()) {
                int value = allChar.get(each);
                for (Character eachCh : vowel) {
                    if (each == eachCh && value==1 ) {
                        return  str.indexOf(each);
                    }
                }
            }
            return -1;
        }



    }




/*Given a string, write a method to find the index of first non-repeating vowel (a, e, i, o, u) in it and return it.
If it doesn't exist, return -1. Assume that string is not empty, and all the characters of the String is
lowercase.
Try to solve with Map data structure like using a Map<Character, Integer>.
Example-1:
Input: “google”
Output: 5
Explanation: only e is non-repeated vowel and it’s index is 5
Example-2:
Input: “responsible”
Output: 4
Explanation: e is repeated, o and i are not repeated, o is the first non-repeating vowel
Example-3:
Input: “mood”
Output: -1
Explanation: o is repeated, no non-repeating vowel.

 */

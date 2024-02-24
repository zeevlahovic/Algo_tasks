import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalsWentInTwoByTwo {

    public static Map<String, Integer> getAnimalPairs(List<String> animals) {
        Map<String, Integer> animalCounts = new HashMap<>();

        // Count occurrences of each animal
        for (String animal : animals) {
            animalCounts.put(animal, animalCounts.getOrDefault(animal, 0) + 1);
        }

        // Filter animals with at least 2 occurrences
        Map<String, Integer> pairs = new HashMap<>();
        for (Map.Entry<String, Integer> entry : animalCounts.entrySet()) {
            if (entry.getValue() >= 2) {
                pairs.put(entry.getKey(), 2);
            }
        }

        return pairs;
    }
}


   /*
A great flood has hit the land, and just as in Biblical times we need to get the animals to the ark in pairs.
We are only interested in getting one pair of each animal, and not interested in any animals where there are less than 2.
They need to mate to repopulate the planet after all!
Write a function that takes a list of animals as a parameter,
which you need to check to see which animals there are at least two of,
and then return a Map<String, Integer> that contains the name of the animal along with the fact that there are 2 of them to bring onto the ark.
Examples:
Input: []
Output: {}

Input: ['goat']
Output: {}
Input : ["dog", "goat", "dog"]
Output: {dog=2}
Input : ["dog", "cat", "dog", "cat", "beaver", "cat"]
Output: {cat=2, dog=2}

Input: ["goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"]
Output: {horse=2, rabbit=2, goat=2}
     */

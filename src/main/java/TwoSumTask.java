import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTask {


    public static void main(String[] args) {
        int[] array=new int[]{4,7,2,11};
        System.out.println(Arrays.toString(twoSumSolution1(array, 9)));
    }

    // Bruteforce Solution of Two Sum problem.
    public static int[] twoSumSolution1(int[] array, int targetValue){
        for(int i=0;i<array.length;i++) {
            for(int j=1;j<array.length;j++) {
                if (i!=j) {
                    if (array[i] + array[j] == targetValue) return new int[]{array[i], array[j]};
                }
            }
        }

        return new int[]{};
    }

    public static int[] twoSumOptimalSolution(int[] array, int targetValue){
        // Complexity of the solution is O(n) but I have space complexity of O(n)
        // create hashmap
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <array.length ; i++) {
            int potentialMatch=targetValue-array[i];
            if (map.containsKey(potentialMatch)) return new int[] {i,map.get(potentialMatch)};
            else map.put(array[i], i);

        }
        return new int[]{};
    }

}

/*Problem: Two Sum
• Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
• You may assume that each input would have exactly one solution, and you
may not use the same element twice.
• You can return the answer in any order.
• No solution will return empty array.
Example:
Input: nums = [2, 7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */

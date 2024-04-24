
public class BuySellStock {

    public static int buySellStock(int[] arr) {

        int minNum = 105;
        int maxNum = 1;
        int buy = 0;
        int IndexOfBuy = 0;
        int sell = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
                buy = minNum;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == buy) {
                IndexOfBuy = i;
                break;
            }
        }
        for (int i = IndexOfBuy; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                sell = maxNum;
            }
        }
        if (arr[arr.length - 1] == buy){
            return 0;
        }
        return sell - buy;

    }



    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};
        int[] arr2 = {7,6,4,3,1};
        int[] arr3 = {5,6,4,3,1,8,55,6,3,1,2,5};

        System.out.println(buySellStock(arr));
        System.out.println(buySellStock(arr2));
        System.out.println(buySellStock(arr3));



    }

}
/*You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in
the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example 1:
Input: prices = [7,1,5,3,6,4] Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:
Input: prices = [7,6,4,3,1] Output: 0
Explanation: In this case, no transactions are done and the max profit = 0

 */
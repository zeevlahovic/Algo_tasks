import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HappyNumber {

    public static boolean happyNumber (Integer n){

        String nums = n.toString();
        char[]arr = nums.toCharArray();
        int result=0;

        for (char eachNum : arr) {
          result += Character.getNumericValue(eachNum) * Character.getNumericValue(eachNum);
          if (result == 1){
              return true;
          }
        }
        return false;
    }






    public static void main(String[] args) {
        System.out.println(happyNumber(20));
    }

}

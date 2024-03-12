public class FindFactorial {

    public static int findFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *=i;

        }
        return factorial;
    }


    public static void main(String[] args) {
        System.out.println(findFactorial(6));
    }

}


/*Write a method that returns the factorial number of any given number.
Factorial: Factorial of a non-negative integer, is multiplication of all positive integers smaller
than or equal to n. For example, factorial of 6 is 6*5*4*3*2*1 which is 720

 */

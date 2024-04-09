package tasks;

public class Task6 {
    /**
     * This method calculates the power of an integer
     * It uses a recursive approach
     * Time complexity: O(n)
     * @param a the base integer
     * @param n the exponent
     * @return the result of a raised to the power of n
     */
    public static int power(int a, int n){
        // Base case
        if (n == 0) {
            return 1;
        }
        // Base case
        if (n == 1){
            return a;
        }
        // Recursive case
        else {
            return a * power(a, n-1);
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        double startTime = System.nanoTime();
        int result = power(a, n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println(a + " to the power of " + n + " is " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

}

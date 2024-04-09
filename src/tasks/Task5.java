package tasks;

public class Task5 {
    /**
     * This method calculates the nth Fibonacci number
     * It uses a recursive approach
     * Time complexity: O(2^n)
     * @param n the index of the Fibonacci number which needs to be calculated
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n){
        if (n == 1 || n == 2){
            return 1; // Base case
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2); // Recursive case
        }
    }

    /**
     * This method calculates the Fibonacci number of 5
     * @return The Fibonacci of 5.
     */
    public static int fibonacci(){
        return fibonacci(5);
    }

    public static void main(String[] args){
        double startTime = System.nanoTime();
        int result = fibonacci();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println("Fibonacci of 5 is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}

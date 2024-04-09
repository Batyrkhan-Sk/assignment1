package tasks;

public class Task9 {
    /**
     * This method calculates the binomial coefficient
     * It uses a recursive approach
     * Time complexity: O(2^n)
     * @param n the total number of items
     * @param k the number of items to be chosen
     * @return the binomial coefficient C(n,k)
     */
    public static int binomialCoeff(int n, int k){
        // Base case
        if (k > n){
            return 0;
        }
        // Base case
        if (k == 0 || k == n){
            return 1;
        }
        // Recursive case
        return binomialCoeff(n-1,k-1) + binomialCoeff(n-1, k);
    }
    public static void main(String[] args){
        int n = 7;
        int k = 3;
        double startTime = System.nanoTime();
        int result = binomialCoeff(n,k);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println("The binomial coefficient of " + n + " and " + k + " is " + result );
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}


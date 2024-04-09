package tasks;

public class Task10 {
    /**
     * This method finds the GCD of 2 integers by Euclidean algorithm
     * It uses a recursive approach
     * Time complexity: O(log(min(a, b))
     * @param a the 1st integer
     * @param b the 2nd integer
     * @return the GCD of 2 integers
     */
    public static int findGCD(int a, int b){
        // Base case
        if (b == 0){
            return a;
        }
        // Recursive case
        else {
            return findGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        double startTime = System.nanoTime();
        int gcd = findGCD(a, b);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000.0;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

}

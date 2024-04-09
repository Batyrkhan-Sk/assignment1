package tasks;

public class Task2 {
    /**
     * This method calculates the average of elements in an array
     * It uses iterative approach
     * Time complexity: O(n)
     * @param arr the input array
     * @param n the number of elements in the array
     * @return the average of the elements in the array
     */
    public static double average(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (double) sum / n;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        int n = arr.length;
        double startTime = System.nanoTime();
        double avg = average(arr, n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Average of elements: " + avg);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}


package tasks;

public class Task1 {
    /**
     * This method finds the minimum element in an array
     * It uses iterative approach
     * Time complexity: O(n)
     * @param arr the input array
     * @param n the number of elements in the array
     * @return the minimum element in the array
     */
    public static int findMinimum(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            // If the current element is smaller than the current minimum, update the minimum
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{10, 1, 32, 3, 45};
        double startTime = System.nanoTime();
        int result = findMinimum(arr, n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Smallest element in the array is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}

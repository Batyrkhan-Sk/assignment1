package tasks;

public class Task1 {
    public static int findMinimum(int[] arr, int n) {
        return n == 1 ? arr[0] : Math.min(arr[n - 1], findMinimum(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{15, 60, 1, 0, 2};
        int n = arr.length;
        double startTime = System.nanoTime();
        int result = findMinimum(arr, n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Smallest element in the array is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}

package tasks;

public class Task2 {
    public static double arrayAverage(int[] arr, int n) {
        return n == 1 ? arr[n - 1] : (arrayAverage(arr, n - 1) * (n - 1) +arr[n - 1]) / n;
    }

    public static void main(String[] args) {
        int[] elements = new int[]{3, 2, 4, 1};
        int n = elements.length;
        double startTime = System.nanoTime();
        double avg = arrayAverage(elements, n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Average of elements: " + avg);
        System.out.println("Time taken: "+ duration + " milliseconds");
    }
}
